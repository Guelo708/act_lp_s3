package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
     
// Declaraciones iniciales
        int edad = 25;
        double salario = 30000;
        boolean tieneExperiencia = true;

// Operador AND
        if (edad >= 18 && salario > 25000) {
            System.out.println("Califica para préstamo");
        }

// Operador OR
        if (edad < 18 || edad > 65) {
            System.out.println("Descuento especial");
        }

// Operador NOT
        if (!tieneExperiencia) {
            System.out.println("Necesita capacitación");
        }

// Combinación de operadores
        if (edad >= 25 && (salario > 20000 || tieneExperiencia)) {
            System.out.println("Candidato ideal");
        }

// Evaluación de día de clases
        boolean esFinDeSemana = false;
        boolean esFeriado = true;

        if (esFinDeSemana || esFeriado) {
            System.out.println("No hay clases");
        }

        if (!esFinDeSemana && !esFeriado) {
            System.out.println("Día de clases normal");
        }
    }

    public static void main(String[] args) {
        ejercicio10();
}
}
