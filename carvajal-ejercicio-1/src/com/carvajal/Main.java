package com.carvajal;

public class Main {

    public static void main(String[] args) {
        double base, exponente, numeroRaiz;
        int numeroPrimo;

        System.out.println("***ELEVAR UN NUMERO***");
        base = lectorDeDatos.solicitarDouble("Ingrese la base: ");
        exponente = lectorDeDatos.solicitarDouble("Ingrese el exponente: ");

        double resul = Matematicas.elevarUnNumero(base, exponente);
        System.out.println("El resultado de elevar " + base + "^" + exponente + " es: " + resul);

        System.out.println("***CALCULAR RAIZ CUADRADA***");
        numeroRaiz = lectorDeDatos.solicitarDouble("Ingrese un numero: ");
        resul = Matematicas.calcularLaRaizCuadrada(numeroRaiz);
        System.out.println("La raiz cuadrada de " + numeroRaiz + " es: " + resul);

        System.out.println("***NUMERO PRIMO***");
        numeroPrimo = lectorDeDatos.solicitarEntero("Ingrese un numero: ");
        if(Matematicas.determinarNumeroPrimo(numeroPrimo)){
            System.out.println("El numero " + numeroPrimo + " es primo");
        } else {
            System.out.println("El numero " + numeroPrimo + " no es primo");
        }
    }
}
