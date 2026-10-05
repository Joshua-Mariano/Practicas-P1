/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablaMultiplicar;

/**
 *
 * @author lilia
 */
import java.util.Scanner;

public class TablaMultiplicar {
        public static void main(String[] args) {
        Scanner Scanner;
        Scanner = new Scanner(System.in);
        System.out.print("Ingresa el número para ver su tabla de multiplicar: ");
        int numero = Scanner.nextInt();

        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        Scanner.close();
    }
}
