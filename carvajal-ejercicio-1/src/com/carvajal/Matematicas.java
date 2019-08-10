package com.carvajal;

public class Matematicas {

    public static double elevarUnNumero(double base, double exponente){
        return Math.pow(base, exponente);
    }

    public static double calcularLaRaizCuadrada(double laRaiz){
        return Math.sqrt(laRaiz);
    }

    public static boolean determinarNumeroPrimo(int numero) {
        int conta = 2;
        boolean numPrimo=true;

        while ((numPrimo) && (conta!=numero)){
            if (numero % conta == 0)
                numPrimo = false;
            conta++;
        }
        return numPrimo;
    }
}
