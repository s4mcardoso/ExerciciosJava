package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Calcula nota final do aluno

        double AC1;
        double AC2;
        double AG;
        double AF;
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        AC1 = entradaDados.nextDouble() * 0.15;

        System.out.println("Digite a segunda nota: ");
        AC2 = entradaDados.nextDouble() * 0.30;

        System.out.println("Digite a terceira nota: ");
        AG = entradaDados.nextDouble() * 0.10;

        System.out.println("Digite a quarta nota: ");
        AF = entradaDados.nextDouble() * 0.45;

        double mediaFinal = MediaFinal(AC1, AC2, AG, AF);

        if (mediaFinal > 5) {
            System.out.println("Você foi aprovado");
        }

        else {
            System.out.println("Você foi reprovado");
        }

        entradaDados.close();
    }

    public static double MediaFinal(double AC1, double AC2, double AG, double AF) {
        return AC1 + AC2 + AG + AF;

    }
}
