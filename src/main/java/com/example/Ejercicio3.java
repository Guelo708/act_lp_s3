package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {

int contador = 5;

// Mostrar valor inicial
        System.out.println("Valor inicial de contador: " + contador);

// Pre-incremento: se incrementa antes de usar el valor
        System.out.println("Pre-incremento (++contador): " + (++contador)); // contador ahora es 6

// Post-incremento: se usa el valor actual y luego se incrementa
        System.out.println("Post-incremento (contador++): " + (contador++)); // imprime 6, luego contador es 7

// Mostrar valor actual después del post-incremento
        System.out.println("Valor después del post-incremento: " + contador); // contador ahora es 7

// Pre-decremento: se decrementa antes de usar el valor
        System.out.println("Pre-decremento (--contador): " + (--contador)); // contador ahora es 6

// Post-decremento: se usa el valor actual y luego se decrementa
        System.out.println("Post-decremento (contador--): " + (contador--)); // imprime 6, luego contador es 5

// Mostrar valor actual después del post-decremento
        System.out.println("Valor después del post-decremento: " + contador); // contador ahora es 5

    //  Explicación:
    // - Pre (++contador / --contador): modifica el valor antes de usarlo en la expresión.
    // - Post (contador++ / contador--): usa el valor actual y luego lo modifica.
    
    }

    public static void main(String[] args) {
        ejercicio3();

       
    }
}
