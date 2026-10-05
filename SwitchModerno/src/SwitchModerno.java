/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class SwitchModerno {
    public static void main(String[] args) {
        String mes = "Enero";
        
        // Expresion del switch (mas conciso)
      
        int diasDelMes = switch (mes){
           case "Enero", "Marzo", "Mayo", "Julio", "Agosto",
                "Octubre", "Diciembre" -> 31;
           case "Abril", "Junio", "Septiembre", "Noviembre" -> 30;
            
           case "Febrero" -> 28;
               
           default -> 0;
        };
        System.out.println( mes + " tiene " + diasDelMes + " dias");
        
        
        // Con bloques de codigo
        String trimestre = switch (mes) {
            case "Enero", "Febrero", "Marzo" -> {
                System.out.println("Primer trimestre del ano");
                yield "Q1";
            }
            case "Abril", "Mayo", "Junio" ->{
                System.out.println("Segundo trimestre del ano");
                yield "Q2";
            }
            case "Julio", "Agosto", "Septiembre" -> "Q3";
            case "Octubre", "Noviembre", "Diciembre" -> "Q4";
            default -> "Mes invaliado";
        };
        
        System.out.println("Trimestre: " + trimestre);
        
    }
}
