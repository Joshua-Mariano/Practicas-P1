/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author lilia
 */
public class CalculadoraMatematica {

    private double numero1;
    private double numero2;

    /**
     * Constructor por defecto. Inicializa ambos números en 0.
     */
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    /**
     * Guardamos los dos números con los que se harán las operaciones.
     *
     * @param numero1 primer número
     * @param numero2 segundo número
     */
    public void ingresarNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * Suma los dos números guardados.
     *
     * @return resultado de la suma
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Resta los dos números.
     *
     * @return resultado de la resta
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Multiplica los dos números guardados.
     *
     * @return resultado de la multiplicación
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Divide el primer número entre el segundo.
     * Usamos un IF para validar que el divisor no sea cero.
     *
     * @return resultado de la división
     * @throws ArithmeticException si el segundo número es cero
     */
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir entre cero.");
        }
        return numero1 / numero2;
    }
}
