/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaTelefonica;

/**
 *
 * @author lilia
 */
public class Plan {

    // Atributos (encapsulados)
    private int minutosIncluidos;
    private double datosGB;
    private double precioMensual;

    // Constructor
    public Plan(int minutosIncluidos, double datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }

    public void mostrarInfo() {
        System.out.println("Plan: " + minutosIncluidos + " min | " + datosGB + " GB | RD$ "
                + String.format("%.2f", precioMensual) + " al mes");
    }

    // Getters
    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public double getDatosGB() {
        return datosGB;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }
}
