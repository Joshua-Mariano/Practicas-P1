/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilia
 */
public class HondaCivic extends AutoMovil {
 
    /**
     * Constructor por defecto. Llama al constructor del padre.
     */
    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }
 
    @Override
    public void encender() {
        System.out.println("El Honda Civic esta encendiendo con arranque deportivo...");
    }
 
    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rapidamente...");
    }
}
 
