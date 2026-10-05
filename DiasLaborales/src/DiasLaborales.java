/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class DiasLaborales {
    public static void main(String[] args) {
        
        String dia = "Lunes";
        String tipoJornada;
        int horasTrabajo;
        
        switch (dia){
            
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                tipoJornada = "Dia Laboral";
                horasTrabajo = 8;
                break;
                
            case "Sabado":
                tipoJornada = "Medio dia";
                horasTrabajo = 4;
                break;
                
            case "Domingo":
                tipoJornada = "Descanso";
                horasTrabajo = 0;
                break;
                
            default: 
                tipoJornada = "Dia no valido";
                horasTrabajo = 0;
               
        }
        
        System.out.println("Dia: " + dia);
        System.out.println("Tipo: " + tipoJornada);
        System.out.println("Horas a trabajar: " + horasTrabajo);
             
    }
}
