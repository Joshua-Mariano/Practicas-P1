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
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;
   
        
        tv2.marca = "LG";
        tv2.pulgadas = 48;
        tv2.volumen = 0;
      
        
        tv3.marca = "Sony";
        tv3.pulgadas = 36;
        tv3.volumen = 100;
        
        System.out.println("=== TELEVISOR 1 ===");
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        
        System.out.println("\n=== TELEVISOR 2 ===");
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        
        System.out.println("\n=== TELEVISOR 3 ===");
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
       
        
    }
}
