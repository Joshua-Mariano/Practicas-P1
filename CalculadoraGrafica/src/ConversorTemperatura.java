/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class ConversorTemperatura {
    
    public double convFaC (double temp){
        return (temp - 32) * 5.0/9.0;
    }
    
    public double convCaF (double temp){
        return (temp * 9.0/5.0) + 32;
    }
}
