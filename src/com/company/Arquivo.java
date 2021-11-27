package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {

    static void insertNameFile(String name){
        try {
            FileWriter myWriter = new FileWriter("filetest.txt",true);
            myWriter.write('\n'+name );
            myWriter.close();
            System.out.println("Successo em escrever nome no arquivo.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na escrita do arquivo.");
            e.printStackTrace();
        }


    }


   static void  readFile(){

       try {
           File myFile = new File("filetest.txt");
           Scanner myReader = new Scanner(myFile);
           while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
               System.out.println(data);
           }
           myReader.close();

           if(myFile.length() ==  0){
               System.out.println("O Arquivo Está vazio.");

           }
       } catch (FileNotFoundException e) {
           System.out.println("Ocorreu um erro em ler o arquivo.");
           e.printStackTrace();
       }

   }
    static void createFile(){
        try{
            File meuArquivo =  new File("filetest.txt");
            if(!meuArquivo.exists()){
                meuArquivo.createNewFile();
                System.out.println("Arquivo Criado com Sucesso : " + meuArquivo.getName());

            }
            else{
                System.out.println("Arquivo Já Existe");
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ");
        }
    }


    static void deleteFile(){
        File myFile = new File("filetest.txt");
        if (myFile.delete()) {
            System.out.println("O Seguinte Arquivo foi Deletado: " + myFile.getName());
        } else {
            System.out.println("Ocorreu um erro em deletar esse Arquivo.");
        }
    }
}
