package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        
// Verificar si el número es par o impar
        int numero = 15;
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }

// Verificar si hace calor
        double temperatura = 25.5;
        if (temperatura > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("Temperatura agradable");
        }

// Verificar si la puntuación es aprobatoria
        int puntuacion = 85;
        if (puntuacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

// Verificar si es estudiante
        boolean esEstudiante = true;
        if (esEstudiante) {
            System.out.println("Es estudiante");
        } else {
            System.out.println("No es estudiante");
        }
    }

    public static void main(String[] args) {
        ejercicio7();



    }
}
