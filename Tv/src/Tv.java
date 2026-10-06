/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class Tv {
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    public Tv() {
        this.marca = "";
        this.pulgadas = 0;
        this.encendido = false;
        this.volumen = 0;
    }
    
    
    
    
public boolean encender(){
        if (encendido == false) {
            System.out.println("La TV " + marca + " se esta encendiendo...");
            encendido = true;
        } else {
            System.out.println("La TV " + marca + " ya esta encendida.");
        }
        return encendido;
    }

    public boolean apagar(){
        if (encendido == true) {
            System.out.println("La TV " + marca + " se esta apagando...");
            encendido = false;
        } else {
            System.out.println("La TV " + marca + " no esta encendida.");
        }
        return encendido;
    }

    public int subirVolumen(){
        if (encendido == true){
            if (volumen < 100){
                volumen++;
                System.out.println("[" + marca + "] Subiendo el volumen... Volumen actual: " + volumen);
            } else {
                System.out.println("[" + marca + "] El volumen ya esta al maximo.");
            }
        } else {
            System.out.println("[" + marca + "] No se puede subir el volumen, la TV esta apagada.");
        }
        return volumen;
    }

    public int bajarVolumen(){
        if (encendido == true){
            if (volumen > 0){
                volumen--;
                System.out.println("[" + marca + "] Bajando el volumen... Volumen actual: " + volumen);
            } else {
                System.out.println("[" + marca + "] El volumen ya esta al minimo.");
            }
        } else {
            System.out.println("[" + marca + "] No se puede bajar el volumen, la TV esta apagada.");
        }
        return volumen;
    }
    

}