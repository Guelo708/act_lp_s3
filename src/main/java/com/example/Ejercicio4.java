package com.example;

public class Ejercicio4 {
    public static void ejercicio4() {
      int numero = 10;
        System.out.println("Valor inicial: " + numero);

// Suma compuesta
        numero += 5; // Equivale a numero = numero + 5
        System.out.println("Después de += 5: " + numero);

// Resta compuesta
        numero -= 3; // Equivale a numero = numero - 3
        System.out.println("Después de -= 3: " + numero);

// Multiplicación compuesta
        numero *= 2; // Equivale a numero = numero * 2
        System.out.println("Después de *= 2: " + numero);

// División compuesta
        numero /= 4; // Equivale a numero = numero / 4
        System.out.println("Después de /= 4: " + numero);

// Módulo compuesto
        numero %= 3; // Equivale a numero = numero % 3
        System.out.println("Después de %= 3: " + numero);
    }

    public static void main(String[] args) {
        ejercicio4();

    }
}
