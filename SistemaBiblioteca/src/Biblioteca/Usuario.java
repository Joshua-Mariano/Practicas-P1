/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author lilia
 */
import java.util.ArrayList;
 
public class Usuario {
 
    // Atributos (encapsulados)
    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;
 
    // Constructor
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }
 
    // Presta un libro al usuario. Devuelve el Prestamo, o null si no se pudo.
    public Prestamo prestarLibro(Libro libro) {
        if (!libro.consultarDisponibilidad()) {
            System.out.println("No se puede prestar \"" + libro.getTitulo() + "\": ya esta prestado.");
            return null;
        }
        libro.setDisponible(false);
        librosPrestados.add(libro);
        System.out.println(nombre + " tomo prestado: " + libro.getTitulo());
        return new Prestamo(this, libro);
    }
 
    // Devuelve un libro. Devuelve true si el usuario realmente lo tenia.
    public boolean devolverLibro(Libro libro) {
        if (!librosPrestados.contains(libro)) {
            System.out.println(nombre + " no tiene prestado: " + libro.getTitulo());
            return false;
        }
        librosPrestados.remove(libro);
        libro.setDisponible(true);
        System.out.println(nombre + " devolvio: " + libro.getTitulo());
        return true;
    }
 
    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados a " + nombre + " (" + librosPrestados.size() + "):");
        if (librosPrestados.isEmpty()) {
            System.out.println("  - Ninguno");
        }
        for (Libro libro : librosPrestados) {
            System.out.println("  - " + libro.getTitulo());
        }
    }
 
    // Getters
    public String getNombre() {
        return nombre;
    }
 
    public String getId() {
        return id;
    }
 
    public ArrayList<Libro> getLibrosPrestados() {
        return new ArrayList<>(librosPrestados);
    }
}
