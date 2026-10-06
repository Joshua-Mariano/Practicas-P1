# Calculadora con Sobrecarga de Métodos

Este proyecto en Java implementa una calculadora utilizando **sobrecarga de métodos**. Permite realizar operaciones matemáticas utilizando diferentes cantidades de parámetros.

## Funcionamiento

La clase `Calculadora` contiene métodos para realizar:

* Suma
* Resta
* Multiplicación
* División

Los métodos de suma, resta y multiplicación están sobrecargados para trabajar con:

* 2 números
* 3 números
* 4 números

La división se realiza utilizando dos números y devuelve un resultado de tipo `double`.

## Sobrecarga de métodos

Un mismo método puede utilizarse con diferentes cantidades de parámetros. Por ejemplo:

```java
sumar(5, 3)
sumar(5, 3, 2)
sumar(1, 2, 3, 4)
```

Java determina automáticamente cuál método utilizar dependiendo de los parámetros enviados.

## Ejemplo

```text
Suma (2 parametros): 8
Resta (2 parametros: 6
Multiplicacion (2 parametros): 42
Division (2 parametros): 5.0

Suma (3 parametros): 10
Resta (3 parametros): 4
Multiplicacion (3 parametros): 24

Suma (4 parametros): 10
Resta (4 parametros): 10
Multiplicacion (4 parametros): 16
```

## Conceptos utilizados

* Programación Orientada a Objetos (POO).
* Clases y objetos.
* Métodos.
* Parámetros.
* Retorno de valores.
* Sobrecarga de métodos (Method Overloading).
* Conversión de tipos (`double`).

## Clases principales

```text
Calculadora
Prueba
```
