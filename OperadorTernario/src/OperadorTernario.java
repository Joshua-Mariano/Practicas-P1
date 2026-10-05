/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class OperadorTernario {
    public static void main(String[] args) {
        int edad = 17;
        
        //Forma tradicional
        String mensaje1;
        
        if (edad >= 18)
        {
            mensaje1 = "Mayor de edad";
        }
        else
        {
           mensaje1 = "Menor de edad";
        }
        
        //Forma compacta con el operador ternario
        
        String mensaje2 = (edad >= 18) ? "Mayor de edad": "Menor de edad";
        
        System.out.println(mensaje2);
        
        //Util para asignaciones rapidas
        
        int precio = 100;
        double precioFinal = (precio > 50) ? precio * 0.9: precio;
        System.out.println("Precio final: $" + precioFinal);
    }
}
