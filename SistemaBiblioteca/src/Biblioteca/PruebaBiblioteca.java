/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author lilia
 */
    public class PruebaBiblioteca {
    public static void main(String[] args) {

        // Creando libros y usuarios
        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", "978-0307474728");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8420412146");

        Usuario usuario1 = new Usuario("Joshua Mariano", "U001");
        Usuario usuario2 = new Usuario("Maria Lopez", "U002");

        System.out.println("=== ESTADO INICIAL ===");
        libro1.mostrarInfo();
        libro2.mostrarInfo();

        System.out.println("\n=== PRESTAMOS ===");
        Prestamo p1 = usuario1.prestarLibro(libro1);
        Prestamo p2 = usuario1.prestarLibro(libro2);
        Prestamo p3 = usuario2.prestarLibro(libro1); // ya esta prestado

        if (p1 != null) p1.mostrarInfo();
        if (p2 != null) p2.mostrarInfo();
        if (p3 == null) System.out.println("El prestamo de Maria no se realizo.");

        System.out.println("\n=== CONSULTAR DISPONIBILIDAD ===");
        System.out.println(libro1.getTitulo() + " disponible? " + libro1.consultarDisponibilidad());
        usuario1.mostrarLibrosPrestados();

        System.out.println("\n=== DEVOLUCIONES ===");
        usuario1.devolverLibro(libro1);
        usuario2.devolverLibro(libro2); // Maria no lo tiene
        System.out.println(libro1.getTitulo() + " disponible? " + libro1.consultarDisponibilidad());
        usuario1.mostrarLibrosPrestados();

        System.out.println("\n=== ESTADO FINAL ===");
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}
