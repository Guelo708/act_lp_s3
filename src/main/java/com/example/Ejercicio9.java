package com.example;

public class Ejercicio9 {
    public static void ejercicio9() {
       
// Comparaciones numéricas
        int a = 10;
        int b = 20;

        System.out.println("¿a == b? " + (a == b));       // Igualdad
        System.out.println("¿a != b? " + (a != b));       // Desigualdad
        System.out.println("¿a < b? " + (a < b));         // Menor que
        System.out.println("¿a > b? " + (a > b));         // Mayor que
        System.out.println("¿a <= b? " + (a <= b));       // Menor o igual que
        System.out.println("¿a >= b? " + (a >= b));       // Mayor o igual que

// Comparación de cadenas
        String texto1 = "Hola";
        String texto2 = "Hola";

        System.out.println("¿texto1.equals(texto2)? " + texto1.equals(texto2)); // Comparación de contenido
    }

    public static void main(String[] args) {
        ejercicio9();

    }
}
