/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class AutoMovil {
 
    // Atributos privados (encapsulación)
    private String marca;
    private String modelo;
    private int año;
    private String color;
 
    /**
     * Constructor por defecto.
     */
    public AutoMovil() {
        System.out.println("Constructor de AutoMovil");
    }
 
    // Getters y Setters
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAño() {
        return año;
    }
 
    public void setAño(int año) {
        this.año = año;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
 
    // Métodos
    public void encender() {
        System.out.println("El automovil esta encendiendo...");
    }
 
    public void apagar() {
        System.out.println("El automovil se esta apagando...");
    }
 
    public void acelerar() {
        System.out.println("El automovil esta acelerando...");
    }
 
    public void frenar() {
        System.out.println("El automovil esta frenando...");
    }
}