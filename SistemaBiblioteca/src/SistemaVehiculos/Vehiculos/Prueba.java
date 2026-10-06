/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaVehiculos.Vehiculos;

/**
 *
 * @author lilia
 */
public class Prueba {
    public static void main(String[] args) {

        // Probando los 3 constructores
        SistemaVehiculos v1 = new SistemaVehiculos();
        SistemaVehiculos v2 = new SistemaVehiculos("A123456", "Toyota");
        SistemaVehiculos v3 = new SistemaVehiculos("B654321", "Honda", "Civic");

        System.out.println("=== CONSTRUCTORES ===");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        // Probando los metodos sobrecargados
        System.out.println("\n=== CALCULAR MANTENIMIENTO ===");
        System.out.printf("Costo base (sin parametros): RD$ %.2f%n", v1.calcularMantenimiento());
        System.out.printf("Por 5000 km: RD$ %.2f%n", v2.calcularMantenimiento(5000));
        System.out.printf("Por 5000 km, servicio completo: RD$ %.2f%n", v2.calcularMantenimiento(5000, "completo"));
        System.out.printf("Por 10000 km, servicio de frenos: RD$ %.2f%n", v3.calcularMantenimiento(10000, "frenos"));
        System.out.printf("Por 10000 km, completo con descuento: RD$ %.2f%n", v3.calcularMantenimiento(10000, "completo", true));
    }
}
