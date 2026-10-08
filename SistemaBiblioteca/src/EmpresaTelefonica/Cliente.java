/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaTelefonica;

/**
 *
 * @author lilia
 */
public class Cliente {

    // Atributos (encapsulados)
    private String nombre;
    private String numeroTelefonico;
    private Plan plan; // El cliente "tiene un" plan

    // Constructor
    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }

    // Getters y setter (el cliente puede cambiar de plan)
    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}