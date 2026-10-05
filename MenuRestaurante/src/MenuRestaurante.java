/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class MenuRestaurante {
    public static void main(String[] args) {
        int opcion = 3;
        String plato;
        double precio;
        
        switch (opcion){
            case 1: 
                plato = "Hamburguesa Sencilla";
                precio = 8.99;
            break;
            
            case 2: 
                plato = "Piza";
                precio = 12.50;
                break;
           
            case 3:
                plato = "Yaroa";
                precio = 150.00;
                break;
                
            default:
                plato = "Opcion no valida";
                precio = 0.0;
                
        }
        
        System.out.println("=== PEDIDO ===");
        System.out.println("Plato seleccionado:" + plato);
        System.out.println("Precio del plato: $" + precio);
    }
}
