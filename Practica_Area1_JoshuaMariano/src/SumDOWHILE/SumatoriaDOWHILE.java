/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumDOWHILE;

/**
 *
 * @author lilia
 */
public class SumatoriaDOWHILE {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
       
        do {
            suma += i;
            i++;
        } while (i <= 50);
       
        System.out.println("La sumatoria de los números del 1 al 50 es: " + suma);
    }
}
