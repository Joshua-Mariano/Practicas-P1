/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class Tv {
    String marca = "";
    int pulgadas = 0;
    boolean encendido;
    int volumen = 0;
    
    
    public boolean encender(){
   
        if (encendido == false)
        {
            System.out.println("La tv esta encendiendo...");
            encendido = true;
        }
        else 
            System.out.println("La tv ya esta encendida.");
        return encendido;
    }
    
    public boolean apagar(){
        
        if (encendido == true)
        {
            System.out.println("La tv se esta apagando...");
            encendido = false;
        }
        else
            System.out.println("La tv no esta encendida.");
        
        return encendido;
    
    }
    
    public int subirVolumen(){
    
        if (encendido == true){
        
            if (volumen < 100){
                volumen ++;
                System.out.println("Subiendo el volumen... Volumen actual:" + volumen);
        }
        else{
            System.out.println("El volumen ya esta al maximo.");
        }
       } else {
            System.out.println("No se puede subir el volumen, la TV esta apagada.");
        }
           return volumen; 
    }
    
    public int bajarVolumen(){
        if (encendido == true){
            if (volumen > 0){
                volumen = volumen - 1;
                System.out.println("Bajando el volumen... Volumen actual: " + volumen);
                
            }
            else{
                System.out.println("El volumen ya esta al minimo.");
            }
        }
            else{
                    System.out.println("No se puede bajar el volumen si la tv esta apagada.");
            }
            return volumen;
        }
    }
