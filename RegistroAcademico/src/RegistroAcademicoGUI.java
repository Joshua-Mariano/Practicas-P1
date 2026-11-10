/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author lilia
 */

public class RegistroAcademicoGUI extends JFrame {
    
    JLabel labelNombre;
    JTextField campoNombre;
    
    JLabel labelMatricula;
    JTextField campoMatricula;
    
    JLabel labelCarrera;
    JTextField campoCarrera;
    
    JLabel labelCalificaciones;
    
    JLabel labelPracticas;
    JTextField campoPracticas;
    
    JLabel labelParciales;
    JTextField campoParciales;
    
    JLabel labelAsignaciones;
    JTextField campoAsignaciones;
    
    JLabel labelExamenFinal;
    JTextField campoExamenFinal;
    
    JButton botonCalcular;
    JLabel labelResultado;
    
    public RegistroAcademicoGUI(){
        setTitle("Registro Academico");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        labelNombre = new JLabel("Nombre Completo:");
        campoNombre = new JTextField(15);
        
        add(labelNombre);
        add(campoNombre);
        
        // Construccion y agregado de Matricula
        labelMatricula = new JLabel("Matricula:");
        campoMatricula = new JTextField(15);
        add(labelMatricula);
        add(campoMatricula);
        
        // Construccion y agregado de Carrera
        labelCarrera = new JLabel("Carrera:");
        campoCarrera = new JTextField(15);
        add(labelCarrera);
        add(campoCarrera);
        
        // Construccion y agregado de calificaciones
        labelPracticas = new JLabel("Practicas (max 40):");
        campoPracticas = new JTextField(5);
        add(labelPracticas);
        add(campoPracticas);
        
        labelParciales = new JLabel("Parciales (max 20):");
        campoParciales = new JTextField(5);
        add(labelParciales);
        add(campoParciales);
        
        labelAsignaciones = new JLabel("Asignaciones (max 20):");
        campoAsignaciones = new JTextField(5);
        add(labelAsignaciones);
        add(campoAsignaciones);
        
        labelExamenFinal = new JLabel("Examen Final (max 20):");
        campoExamenFinal = new JTextField(5);
        add(labelExamenFinal);
        add(campoExamenFinal);
        
        // Construcción del Boton y Etiqueta de Resultado
        botonCalcular = new JButton("Calcular Resultado");
        add(botonCalcular);
        
        labelResultado = new JLabel("Resultado: ---");
        add(labelResultado);
        
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
            // 1. Extraemos los textos
            String nombreEstudiante = campoNombre.getText();
            String matriculaEstudiante = campoMatricula.getText();
            String carreraEstudiante = campoCarrera.getText();

            // 2. Extraemos y convertimos los numeros
            double notaPracticas = Double.parseDouble(campoPracticas.getText());
            double notaParciales = Double.parseDouble(campoParciales.getText());
            double notaAsignaciones = Double.parseDouble(campoAsignaciones.getText());
            double notaExamenFinal = Double.parseDouble(campoExamenFinal.getText());

            // 3. Creamos al estudiante usando su molde
            Estudiante nuevoEstudiante = new Estudiante(nombreEstudiante, matriculaEstudiante, carreraEstudiante, notaPracticas, notaParciales, notaAsignaciones, notaExamenFinal);

            // 4. Hacemos los calculos
            double notaTotal = nuevoEstudiante.sumarCalificaciones();
            String estadoEstudiante = nuevoEstudiante.obtenerEstado();

            // 5. Mostramos el resultado
            labelResultado.setText("Hola, " + nombreEstudiante + " su calificacion final es: " + notaTotal + " USTED HA SIDO: " + estadoEstudiante);
    }
});
    }
    
}
