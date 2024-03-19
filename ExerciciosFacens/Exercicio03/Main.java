package Exercicio03;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Calcula se o ano é bissexto

        int ano;
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.println("Em que ano estamos: ");
        ano = entradaDados.nextInt();

        if ((ano % 4) == 0){
            System.out.println("O ano é bissexto");
        }

        else{
            System.out.println("O ano não é bissexto");
        }



        System.out.println("resultado da divisão: " + ano % 4);

        entradaDados.close();
    }
}
