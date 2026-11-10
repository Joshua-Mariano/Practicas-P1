# Sistema de Registro Academico

Este es un programa creado en Java que utiliza una interfaz grafica (GUI) con Swing para registrar los datos de un estudiante, calcular sus calificaciones totales y determinar si ha aprobado o reprobado el curso.

## Archivos del Proyecto

El proyecto esta compuesto por dos archivos principales que separan la interfaz visual de la logica matematica:

*   **Estudiante.java**: Clase que representa el "molde" del estudiante. Almacena los datos personales, contiene el metodo `sumarCalificaciones()` para calcular el total y el metodo `obtenerEstado()` para determinar si el estudiante aprueba.
*   **RegistroAcademicoGUI.java**: Clase principal que construye la interfaz visual usando la libreria `javax.swing.*`. Contiene el formulario, el boton de accion, captura los datos del usuario y contiene el metodo `main` para arrancar la aplicacion.

## Caracteristicas Principales

*   Interfaz grafica amigable con distribucion `FlowLayout`.
*   Captura de datos en texto (Nombre, Matricula, Carrera).
*   Conversion de texto a numeros (`Double.parseDouble`) para calcular las calificaciones (Practicas, Parciales, Asignaciones, Examen final).
*   Visualizacion del resultado final en pantalla al presionar el boton "Calcular Resultado".

## Como compilar y ejecutar el programa

1. Abre tu terminal o consola de comandos.
2. Navega hasta la carpeta donde guardaste tus dos archivos `.java`.
3. Compila el codigo escribiendo el siguiente comando:
   ```bash
   javac Estudiante.java RegistroAcademicoGUI.java
   ```
4. Una vez compilado sin errores, ejecuta el programa con:
   ```bash
   java RegistroAcademicoGUI
   ```