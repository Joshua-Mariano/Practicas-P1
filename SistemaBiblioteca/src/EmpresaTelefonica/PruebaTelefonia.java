/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaTelefonica;

/**
 *
 * @author lilia
 */
public class PruebaTelefonia {
    public static void main(String[] args) {

        // Planes
        Plan planBasico = new Plan(300, 5, 800.0);
        Plan planPremium = new Plan(1000, 20, 1500.0);

        // Clientes (cada uno tiene su plan)
        Cliente c1 = new Cliente("Juan Perez", "809-555-0101", planBasico);
        Cliente c2 = new Cliente("Maria Lopez", "829-555-0202", planBasico);
        Cliente c3 = new Cliente("Carlos Diaz", "849-555-0303", planPremium);

        // Facturas: cada una usa al cliente y su consumo real
        Factura f1 = new Factura(c1, 250, 4.5);   // sin exceso
        Factura f2 = new Factura(c2, 350, 7.0);   // se paso en minutos y datos
        Factura f3 = new Factura(c3, 900, 25.5);  // se paso solo en datos

        f1.generarFactura();
        System.out.println();
        f2.generarFactura();
        System.out.println();
        f3.generarFactura();
    }
}