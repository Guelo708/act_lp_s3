package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {

// División entre enteros
        int a = 10;
        int b = 3;
        int divisionEntera = a / b; // Resultado: 3 (se descarta la parte decimal)

// División decimal usando conversión explícita (casting)
        double divisionDecimal = (double) a / b; // Resultado: 3.333... (se conserva la parte decimal)

// División entre decimales
        double x = 15.5;
        double y = 4.2;
        double divisionDobleDecimales = x / y; // Resultado: 3.690476...

// Imprimir resultados
        System.out.println("División entera (int): " + a + " / " + b + " = " + divisionEntera);
        System.out.println("División decimal (double): " + a + " / " + b + " = " + divisionDecimal);
        System.out.println("División entre decimales (double): " + x + " / " + y + " = " + divisionDobleDecimales);

// Explicación en comentarios:
// - La división entre enteros descarta los decimales y devuelve solo la parte entera.
// - Al convertir uno de los operandos a double, Java realiza una división decimal.
// - Cuando ambos operandos son double, el resultado conserva toda la precisión decimal.

    }

    public static void main(String[] args) {
        ejercicio2();





  
      
    }
}
