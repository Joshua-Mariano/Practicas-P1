/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author lilia
 */
import java.time.LocalDate;
 
public class Prestamo {
 
    // Atributos (encapsulados)
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;
 
    // Constructor 1: usa la fecha de hoy
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }
 
    // Constructor 2: con una fecha especifica
    public Prestamo(Usuario usuario, Libro libro, LocalDate fecha) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }
 
    public void mostrarInfo() {
        System.out.println("Prestamo | Fecha: " + fecha + " | Usuario: " + usuario.getNombre()
                + " (ID " + usuario.getId() + ") | Libro: " + libro.getTitulo());
    }
 
    // Getters
    public LocalDate getFecha() {
        return fecha;
    }
 
    public Usuario getUsuario() {
        return usuario;
    }
 
    public Libro getLibro() {
        return libro;
    }
}
