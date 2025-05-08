# Desafios Beecrowd URI

Este repositório contém soluções para diversos desafios de lógica de programação propostos na plataforma Beecrowd (anteriormente conhecida como URI Online Judge), implementadas em Java.

## 📚 Descrição

O objetivo deste projeto é praticar e aprimorar habilidades de programação, resolução de problemas algorítmicos e lógica computacional, abordando temas como:

* Estruturas condicionais e de repetição
* Manipulação de strings e arrays
* Algoritmos de ordenação e busca
* Cálculos matemáticos e aritméticos
* Leitura e escrita de dados

Cada desafio é implementado em uma classe separada, facilitando a organização e reutilização do código.

## 🛠️ Tecnologias Utilizadas

* Java 17
* Maven

## 📁 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```


desafios_beecrowd_uri/
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   ├── Desafio1001.java
│                   ├── Desafio1002.java
│                   └── ...
├── .gitignore
└── pom.xml
```



* Cada arquivo `DesafioXXXX.java` representa a solução de um desafio específico, onde `XXXX` é o número do problema no Beecrowd.

## 🚀 Como Executar

1. Certifique-se de ter o Java 17 e o Maven instalados em sua máquina.
2. Clone este repositório:

   ```bash
   git clone https://github.com/abdieldeathayde/desafios_beecrowd_uri.git
   ```



3. Navegue até o diretório do projeto:

   ```bash
   cd desafios_beecrowd_uri
   ```



4. Compile o projeto utilizando o Maven:

   ```bash
   mvn clean install
   ```



5. Execute a classe desejada:

   ```bash
   mvn exec:java -Dexec.mainClass="org.example.DesafioXXXX"
   ```



Substitua `DesafioXXXX` pelo nome da classe que deseja executar.

## 📄 Licença

Este projeto é de uso educacional e foi desenvolvido como parte do processo de aprendizado em lógica de programação.
