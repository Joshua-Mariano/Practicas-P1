/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author lilia
 */
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi Calculadora y Conversor");
        JTabbedPane panelPestanas = new JTabbedPane();
        
        Calculadora calc = new Calculadora();
        
    // --- Etiquetas y Campos de Texto ---
    JPanel panelCalculadora = new JPanel();
    panelCalculadora.setLayout(null);
    
    JLabel lblValor1 = new JLabel("Valor 1:");
    lblValor1.setBounds(30, 40, 60, 25);
    panelCalculadora.add(lblValor1);
    
    JTextField txfValor1 = new JTextField();
    txfValor1.setBounds(90, 40, 120, 25);
    panelCalculadora.add(txfValor1);
    
    JLabel lblValor2 = new JLabel("Valor 2:");
    lblValor2.setBounds(30, 90, 60, 25);
    panelCalculadora.add(lblValor2);
    
    JTextField txfValor2 = new JTextField();
    txfValor2.setBounds(90, 90, 120, 25);
    panelCalculadora.add(txfValor2);
    
    JLabel lblRespuesta = new JLabel();
    lblRespuesta.setBounds(30, 150, 80, 25);
    panelCalculadora.add(lblRespuesta);
    
    JTextField txfRespuesta = new JTextField();
    txfRespuesta.setBounds(30, 180, 180, 30);
    txfRespuesta.setEditable(false);
    panelCalculadora.add(txfRespuesta);
    
    // --- Botones de Operaciones ---
    
    JButton btnSumar = new JButton("Sumar");
    btnSumar.setBounds(250, 40, 110, 30);
    panelCalculadora.add(btnSumar);
      
    btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(txfValor1.getText());
                    double num2 = Double.parseDouble(txfValor2.getText());
                    
                    double resultado = calc.sumar(num1, num2);
                    
                    txfRespuesta.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex){
                    txfRespuesta.setText("Ingresa numeros validos");
                }       
               }     
    });

    JButton btnRestar = new JButton("Restar");
    btnRestar.setBounds(250, 80, 110, 30);
    panelCalculadora.add(btnRestar);
    
    btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(txfValor1.getText());
                    double num2 = Double.parseDouble(txfValor2.getText());
                    double resultado = calc.restar(num1, num2);
                    txfRespuesta.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    txfRespuesta.setText("Ingresa números válidos");
                }
            }
        });

    JButton btnMultiplicar = new JButton("Multiplicar");
    btnMultiplicar.setBounds(250, 120, 110, 30);
    panelCalculadora.add(btnMultiplicar);
    
    btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(txfValor1.getText());
                    double num2 = Double.parseDouble(txfValor2.getText());
                    double resultado = calc.multiplicar(num1, num2);
                    txfRespuesta.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    txfRespuesta.setText("Ingresa números válidos");
                }
            }
        });

    JButton btnDividir = new JButton("Dividir");
    btnDividir.setBounds(250, 160, 110, 30);
    panelCalculadora.add(btnDividir);
    
    btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(txfValor1.getText());
                    double num2 = Double.parseDouble(txfValor2.getText());
                    double resultado = calc.dividir(num1, num2);
                    txfRespuesta.setText(String.valueOf(resultado));
                } catch (ArithmeticException ex) {
                    txfRespuesta.setText("Error: Divisor en cero");
                } catch (NumberFormatException ex) {
                    txfRespuesta.setText("Ingresa números válidos");
                }
            }
        });
    
    panelPestanas.add("Calculadora", panelCalculadora); 
    
    JPanel panelConversor = new JPanel();
        panelConversor.setLayout(null);
        
        JLabel lblTemp = new JLabel("Temperatura:");
        lblTemp.setBounds(30, 40, 90, 25);
        panelConversor.add(lblTemp);
        
        JTextField txfTemp = new JTextField();
        txfTemp.setBounds(120, 40, 120, 25);
        panelConversor.add(txfTemp);
        
        JLabel lblResConv = new JLabel("Resultado:");
        lblResConv.setBounds(30, 100, 80, 25);
        panelConversor.add(lblResConv);
        
        JTextField txfResConv = new JTextField();
        txfResConv.setBounds(120, 100, 120, 30);
        txfResConv.setEditable(false);
        panelConversor.add(txfResConv);
        
        JButton btnACelsius = new JButton("Convertir a °C");
        btnACelsius.setBounds(260, 40, 130, 30);
        panelConversor.add(btnACelsius);
        
        JButton btnAFahrenheit = new JButton("Convertir a °F");
        btnAFahrenheit.setBounds(260, 90, 130, 30);
        panelConversor.add(btnAFahrenheit);
        
        // Acción convertir a Celsius
        btnACelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double f = Double.parseDouble(txfTemp.getText());
                    // Asumiendo que tu método de Fahrenheit a Celsius se llama deFaC o similar
                    // Cambia "deFaC" por el nombre exacto de tu método de conversión
                    double c = (f - 32) * 5.0 / 9.0; 
                    txfResConv.setText(String.format("%.2f °C", c));
                } catch (NumberFormatException ex) {
                    txfResConv.setText("Valor inválido");
                }
            }
        });
        
        // Acción convertir a Fahrenheit
        btnAFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double c = Double.parseDouble(txfTemp.getText());
                    // Asumiendo que tu método de Celsius a Fahrenheit se llama deCaF o similar
                    double f = (c * 9.0 / 5.0) + 32;
                    txfResConv.setText(String.format("%.2f °F", f));
                } catch (NumberFormatException ex) {
                    txfResConv.setText("Valor inválido");
                }
            }
        });
        
        panelPestanas.add("Conversor", panelConversor);
        
        ventana.add(panelPestanas);
        ventana.setSize(420, 280);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    
    
        }
    }
    
 