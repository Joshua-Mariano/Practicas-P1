/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author lilia
 */
public class Libro {
    
     // Atributos (encapsulados)
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
 
    // Constructor: todo libro nuevo empieza disponible
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
 
    // Consulta si el libro se puede prestar
    public boolean consultarDisponibilidad() {
        return disponible;
    }
 
    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn + " | Estado: " + estado);
    }
 
    // Getters y setters
    public String getTitulo() {
        return titulo;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public String getIsbn() {
        return isbn;
    }
 
    public boolean isDisponible() {
        return disponible;
    }
 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
