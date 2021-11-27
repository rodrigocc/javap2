package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Manipulador de Arquivo Txt Escolha entre as Seguintes Opções : "+
                "\n 1- Escrever nome no arquivo"+ "\n 2- ler nome dentro do arquivo"+ "\n 3- Apagar Arquivo \n");

        String option = scanner.nextLine();

        if(option.equals("1")){
            Scanner fileNameScanner = new Scanner(System.in);
            System.out.println("Qual nome você deseja inserir no Arquivo? :");
            String inputNamed = fileNameScanner.nextLine();
            Arquivo.insertNameFile(inputNamed);

        }
        else if(option.equals("2")){
            System.out.println("vai ler todos os nomes do arquivo ");
            Arquivo.readFile();
        }

        else if (option.equals("3")){
            Arquivo.deleteFile();

        }

        else{
            System.out.println("Opção inválida");

        }
        System.out.println("a option escolhida foi :"+ option);
    }
}
