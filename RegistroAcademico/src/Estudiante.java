/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class Estudiante {

    public Estudiante() {
    }

    public Estudiante(String nombreCompleto, String matricula, String carrera, double practicas, double parciales, double asignaciones, double examenFinal) {
        this.nombreCompleto = nombreCompleto;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }
    
    
    String nombreCompleto;
    String matricula;
    String carrera;
 
    double practicas;
    double parciales;
    double asignaciones;
    double examenFinal;
    
    public double sumarCalificaciones(){
        return practicas + parciales + asignaciones + examenFinal;
    }
    
    public String obtenerEstado() {
        if (sumarCalificaciones() >= 60)
                return "APROBADO";
        else
            return "REPROBADO";
    }
}
