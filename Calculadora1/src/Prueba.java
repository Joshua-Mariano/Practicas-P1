/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class Prueba {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        // Pruebas con 2 parametros
        System.out.println("Suma (2 parametros): " + calc.sumar(5,3));
        System.out.println("Resta (2 parametros: " + calc.restar(10, 4) );
        System.out.println("Multiplicacion (2 parametros): " + calc.multiplicar(6, 7));
        System.out.println("Division (2 parametros): " + calc.dividir(20, 4));
        
        // Pruebas con 3 parametros
        System.out.println("Suma (3 parametros): " + calc.sumar(5, 3, 2));
        System.out.println("Resta (3 parametros): " + calc.restar(10, 4, 2));
        System.out.println("Multiplicacion (3 parametros): "+ calc.multiplicar(2, 3, 4));
        
        // Pruebas con 4 parametros
        System.out.println("Suma (4 parametros): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4 parametros): " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicacion (4 parametros): "+ calc.multiplicar(2, 2, 2, 2));
        
    }
}
