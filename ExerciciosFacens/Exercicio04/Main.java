package Exercicio04;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do lado 1:");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Digite o comprimento do lado 2:");
        double lado2 = scanner.nextDouble();
        
        System.out.println("Digite o comprimento do lado 3:");
        double lado3 = scanner.nextDouble();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }
             scanner.close();
    
}

}
