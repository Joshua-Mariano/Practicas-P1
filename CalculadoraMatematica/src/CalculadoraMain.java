
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase principal del programa. Muestra un menú interactivo por consola
 * y utiliza la clase {@link CalculadoraMatematica} para realizar las
 * operaciones de suma, resta, multiplicación y división.
 *
 * @author lilia
 */
public class CalculadoraMain {
 
    /**
     * Método principal. Muestra el menú de la calculadora en un bucle
     * do-while hasta que el usuario elija la opción 0 (Salir), y ejecuta
     * la operación seleccionada mediante una estructura switch.
     */
    public static void main(String[] args) {
        // Scanner para leer los datos que el usuario escribe en consola
        Scanner scanner = new Scanner(System.in);
 
        // Objeto de la calculadora que guarda los números y hace las operaciones
        CalculadoraMatematica calc = new CalculadoraMatematica();
 
        // Guarda la opción elegida por el usuario en el menú
        int opcionMenu;
 
        // El do-while garantiza que el menú se muestre al menos una vez
        // y se repita hasta que el usuario elija 0
        do {
            // Impresión del menú de opciones
            System.out.println("=== CALCULADORA MATEMATICA ===");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==============================");
            System.out.println("Seleccione una opcion: ");
 
            // Lee la opción elegida
            opcionMenu = scanner.nextInt();
 
            // El switch ejecuta la acción según la opción elegida previamente
            switch (opcionMenu) {
                case 1:
                    // Pide los dos números y los guarda en la calculadora
                    System.out.println("Ingrese el primer numero: ");
                    double numero1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    double numero2 = scanner.nextDouble();
                    calc.ingresarNumeros(numero1, numero2);
                    System.out.println("Numeros leidos correctamente...");
                    break;
 
                case 2:
                    // Suma de los números guardados
                    System.out.println("Resultado de la suma: " + calc.sumar());
                    break;
 
                case 3:
                    // Resta de los números guardados
                    System.out.println("Resultado de la resta: " + calc.restar());
                    break;
 
                case 4:
                    // Multiplicación de los números guardados
                    System.out.println("Resultado de la multiplicacion: " + calc.multiplicar());
                    break;
 
                case 5:
                    // División de los números guardados
                    // (la validación de división por cero está en el método dividir())
                    System.out.println("Resultado de la division: " + calc.dividir());
                    break;
 
                case 0:
                    // El bucle termina porque opcionMenu == 0
                    System.out.println("Saliendo...");
                    break;
 
                default:
                    // Cualquier otro número no es una opción válida
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opcionMenu != 0);
 
        // Cerramos el Scanner al terminar el programa
        scanner.close();
    }
}
 