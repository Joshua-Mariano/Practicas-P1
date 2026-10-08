/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaTelefonica;

/**
 *
 * @author lilia
 */
public class Factura {

    // Tarifas por exceso (en RD$)
    private static final double COSTO_MINUTO_EXTRA = 2.5;
    private static final double COSTO_GB_EXTRA = 150.0;

    // Atributos (encapsulados)
    private Cliente cliente; // La factura usa al cliente (y, por medio de el, su plan)
    private int minutosUsados;
    private double datosUsadosGB;
    private double cargosExtras;

    // Constructor: registra el consumo real y calcula los cargos por exceso
    public Factura(Cliente cliente, int minutosUsados, double datosUsadosGB) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGB = datosUsadosGB;
        this.cargosExtras = calcularCargosExtras();
    }

    // Cargo por los minutos y GB que se pasaron de lo incluido en el plan
    public double calcularCargosExtras() {
        Plan plan = cliente.getPlan();
        int minutosExtra = Math.max(0, minutosUsados - plan.getMinutosIncluidos());
        double gbExtra = Math.max(0, datosUsadosGB - plan.getDatosGB());
        return (minutosExtra * COSTO_MINUTO_EXTRA) + (gbExtra * COSTO_GB_EXTRA);
    }

    // Monto total = precio base del plan + cargos extras
    public double calcularTotal() {
        return cliente.getPlan().getPrecioMensual() + cargosExtras;
    }

    // Muestra un resumen detallado de la factura
    public void generarFactura() {
        Plan plan = cliente.getPlan();
        int minutosExtra = Math.max(0, minutosUsados - plan.getMinutosIncluidos());
        double gbExtra = Math.max(0, datosUsadosGB - plan.getDatosGB());

        System.out.println("==============================");
        System.out.println("        FACTURA MENSUAL");
        System.out.println("==============================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getNumeroTelefonico());
        System.out.println("------------------------------");
        System.out.println("Plan incluido: " + plan.getMinutosIncluidos() + " min / " + plan.getDatosGB() + " GB");
        System.out.println("Consumo real:  " + minutosUsados + " min / " + datosUsadosGB + " GB");
        System.out.println("Exceso:        " + minutosExtra + " min / " + gbExtra + " GB");
        System.out.println("------------------------------");
        System.out.printf("Precio del plan:  RD$ %.2f%n", plan.getPrecioMensual());
        System.out.printf("Cargos extras:    RD$ %.2f%n", cargosExtras);
        System.out.printf("TOTAL A PAGAR:    RD$ %.2f%n", calcularTotal());
        System.out.println("==============================");
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public int getMinutosUsados() {
        return minutosUsados;
    }

    public double getDatosUsadosGB() {
        return datosUsadosGB;
    }

    public double getCargosExtras() {
        return cargosExtras;
    }
}
