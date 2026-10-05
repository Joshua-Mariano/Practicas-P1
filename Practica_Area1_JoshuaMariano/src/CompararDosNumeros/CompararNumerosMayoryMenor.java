/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompararDosNumeros;

/**
 *
 * @author lilia
 */

 import java.util.Scanner;
public class CompararNumerosMayoryMenor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int num2 = scanner.nextInt();
           
            if (num1 > num2) {
                System.out.println("El número mayor es: " + num1);
                System.out.println("El número menor es: " + num2);
            } else if (num2 > num1) {
                System.out.println("El número mayor es: " + num2);
                System.out.println("El número menor es: " + num1);
            } else {
                System.out.println("Ambos números son iguales.");
            }
        }
    }
}