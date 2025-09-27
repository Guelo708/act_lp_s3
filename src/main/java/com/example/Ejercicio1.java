package com.example;

public class Ejercicio1 {
    public static void ejercicio1() {

// Declarar variables
        int x = 10;
        int y = 5;
// Operaciones aritméticas
        int resultadoSuma = x + y;
        int resultadoResta = x - y;
        int resultadoMultiplicacion = x * y;
        int resultadoDivision = x / y;
        int resultadoModulo = x % y;

// Imprimir resultados con mensajes descriptivos
        System.out.println("Suma: " + x + " + " + y + " = " + resultadoSuma);
        System.out.println("Resta: " + x + " - " + y + " = " + resultadoResta);
        System.out.println("Multiplicación: " + x + " * " + y + " = " + resultadoMultiplicacion);
        System.out.println("División entera: " + x + " / " + y + " = " + resultadoDivision);
        System.out.println("Módulo (residuo): " + x + " % " + y + " = " + resultadoModulo);
    
  }

    public static void main(String[] args) {
        ejercicio1();

       
        
    }
}
