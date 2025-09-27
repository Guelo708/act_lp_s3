package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {

// Determinar letra de calificación
        int calificacion = 85;
        String letra;

        if (calificacion >= 90) {
            letra = "A";
        } else if (calificacion >= 80) {
            letra = "B";
        } else if (calificacion >= 70) {
            letra = "C";
        } else if (calificacion >= 60) {
            letra = "D";
        } else {
            letra = "F";
        }

        System.out.println("Calificación numérica: " + calificacion);
        System.out.println("Calificación en letra: " + letra);

// Determinar saludo según la hora
        int hora = 14;
        String saludo;

        if (hora < 12) {
            saludo = "Buenos días";
        } else if (hora < 18) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println("Hora actual: " + hora);
        System.out.println("Saludo: " + saludo);
    }

    public static void main(String[] args) {
        ejercicio8();

  
    }
}
