# Aplicación de Escritorio: Calculadora y Conversor (Java Swing)

Aplicación de escritorio desarrollada en **Java** utilizando **Java Swing** (`JFrame`, `JTabbedPane`, `JPanel`) y una arquitectura modular que separa la lógica de negocio de la interfaz gráfica (`GUI`).

---

## 🚀 Características Principales

* **Interfaz con Pestañas (`JTabbedPane`):** Organiza las herramientas en vistas limpias y separadas (Calculadora y Conversor de Temperatura).
* **Diseño Personalizado (`null` layout / `setBounds`):** Posicionamiento preciso de componentes visuales (etiquetas, campos de texto y botones).
* **Calculadora Básica:**
  * Operaciones aritméticas: Suma, Resta, Multiplicación y División.
  * Funciones avanzadas: Potenciación (exponente) y Raíz cuadrada.
  * Manejo de errores integrado (validación de campos vacíos/letras y control de división entre cero).
* **Conversor de Temperatura:**
  * Conversión precisa entre grados Celsius (°C) y Fahrenheit (°F).
  * Formato de salida optimizado a dos cifras decimales.

---

## 🛠️ Estructura del Proyecto

El proyecto está compuesto por dos clases principales:

1. **`Calculadora.java` (Lógica de Negocio):**
   Contiene todos los métodos matemáticos y validaciones lógicas independientes de la interfaz de usuario.
2. **`Main.java` (Interfaz Gráfica / Vista):**
   Configura la ventana principal (`JFrame`), construye los paneles, inicializa los componentes de Swing y gestiona los eventos de los botones mediante `ActionListener`.

---

## 📋 Requisitos del Sistema

* **Java Development Kit (JDK):** Versión 8 o superior recomendada.
* **IDE compatible:** NetBeans IDE, IntelliJ IDEA, Eclipse o Visual Studio Code.

---

## ⚙️ Instrucciones de Ejecución

1. Clona o descarga los archivos fuente del proyecto en tu computadora.
2. Asegúrate de tener en el mismo paquete o directorio las clases **`Calculadora.java`** y **`Main.java`**.
3. Abre el proyecto en tu entorno de desarrollo favorito (IDE).
4. Ejecuta la clase principal **`Main.java`** (`public static void main(String[] args)`).
