package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Conversor

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Informe a distância percorrida em km: ");
        double distanciaPercorrida = entradaDados.nextDouble();

        System.out.println("Informe a quantidade de gasolina que foi gasta em litros: ");
        double gasolinaGasta = entradaDados.nextDouble();

        System.out.println("O consumo médio foi de " + ConsumoMedio(gasolinaGasta, distanciaPercorrida));

        entradaDados.close();
    }

    public static double ConsumoMedio(double gasolinaGasta, double distanciaPercorrida) {
        return gasolinaGasta / distanciaPercorrida;
    }
}