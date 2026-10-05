/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class SistemaDescuentos {
    public static void main(String[] args) {
        double totalCompra = 1500.00;
        String tipoCliente = "VIP";
        double descuento = 0;
        
        if (totalCompra >= 2000) {
            descuento = 0.20;
        }
        else if (totalCompra >= 1000) {
            descuento = 0.15;
        }
        else if (totalCompra >= 500) {
            descuento = 0.10;
        }
        
        double montoDescuento = totalCompra * descuento;
        double totalFinal = totalCompra - montoDescuento;
        
        System.out.println("=== DETALLE DE COMPRA ===");
        System.out.println("Subtotal: $" + totalCompra);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Descuento aplicado: " + (descuento * 100)+ "%");
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
        
    }
}
