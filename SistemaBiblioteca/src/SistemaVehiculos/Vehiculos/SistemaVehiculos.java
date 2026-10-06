/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaVehiculos.Vehiculos;

/**
 *
 * @author lilia
 */
public class SistemaVehiculos {
    // Atributos
    
    private String placa;
    private String marca;
    private String modelo;
    
    // Valores usados para estimar el mantenimiento
    
    private static final double COSTO_BASE = 2000.0;
    private static final double COSTO_POR_KM = 3.0;
    private static final double DESCUENTO = 0.10;
    
    // === USO DE CONDUCTORES SOBRECARGADOS ===

    public SistemaVehiculos() {
        this.placa = "SIN PLACA";
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        
    }

    public SistemaVehiculos(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = "Desconocido";
    }

    public SistemaVehiculos(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // === METODOS SOBRECARGADOS ===
   
    // Solo costo base
    public double calcularMantenimiento(){
        return COSTO_BASE;
    }
    
    // Segun los kilometros recorridos
    
    public double calcularMantenimiento(double km){
        return COSTO_BASE + (km * COSTO_POR_KM);
    }
    
    // Segun kilometros y tipo de servicio (basico, completo o frenos)
    
    public double calcularMantenimiento(double km, String tipoServicio){
        return calcularMantenimiento(km) * factorServicio(tipoServicio);
    }
    
    
    public double calcularMantenimiento(double km, String tipoServicio, boolean aplicaDescuento){
        double costo = calcularMantenimiento(km, tipoServicio);
        if (aplicaDescuento){
            costo = costo - (costo * DESCUENTO);
        }
        return costo;
    }
    // Auxiliar: cuanto cuesta cada tipo de servicio respecto al basico
    private double factorServicio(String tipoServicio) {
        switch (tipoServicio.toLowerCase()) {
            case "completo":
                return 1.5;
            case "frenos":
                return 1.25;
            case "basico":
            default:
                return 1.0;
        }
    }
 
    // Muestra los datos del vehiculo
    public void mostrarInfo() {
        System.out.println("Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo);
    }
 
    // Getters
    public String getPlaca() {
        return placa;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public String getModelo() {
        return modelo;
    }
}
