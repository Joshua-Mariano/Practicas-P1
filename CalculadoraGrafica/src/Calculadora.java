/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class Calculadora {
    
    public double sumar (double numero1, double numero2){
        return numero1 + numero2;
    
    }
    
    public double restar (double numero1, double numero2){
        return numero1 - numero2;
    
    }
    
    public double multiplicar (double numero1, double numero2){
        return numero1 * numero2;
    
    }
    
    public double dividir (double numero1, double numero2){
        if (numero2 == 0){
            throw new ArithmeticException("ERROR: No puedes dividir entre cero.");
        }
        return numero1 / numero2;
    }
    
    public double calcExponente (double base, double exponente){
        return Math.pow(base, exponente);
    }
    
    public double calcRaiz (double numero){
        return Math.sqrt(numero);
    }
}
