package com.example;

public class Ejercicio6 {
    public static void ejercicio6() {
       
// Verificar mayoría de edad
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }

// Verificar aprobación
        double nota = 7.5;
        if (nota >= 6.0) {
            System.out.println("Aprobado");
        }

// Verificar tipo de número
        int numero = -5;
        if (numero > 0) {
            System.out.println("Número positivo");
        }
        if (numero < 0) {
            System.out.println("Número negativo");
        }
        if (numero == 0) {
            System.out.println("Número es cero");
        }
    }

    public static void main(String[] args) {
        ejercicio6();
 
    }
}
