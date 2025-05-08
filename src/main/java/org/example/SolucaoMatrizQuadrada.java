package org.example;

import java.io.*;

public class SolucaoMatrizQuadrada {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String linha = br.readLine();
            if (linha == null || linha.trim().isEmpty()) continue;

            int n = Integer.parseInt(linha.trim());
            if (n == 0) break;

            int[][] matriz = new int[n][n];
            int camadas = (n + 1) / 2;

            // Preenche a matriz por camadas
            for (int camada = 0; camada < camadas; camada++) {
                int valor = camada + 1;
                for (int i = camada; i < n - camada; i++) {
                    for (int j = camada; j < n - camada; j++) {
                        matriz[i][j] = valor;
                    }
                }
            }

            // Gera a saída formatada
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > 0) bw.write(" ");
                    bw.write(String.format("%3d", matriz[i][j]));
                }
                bw.newLine();
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
