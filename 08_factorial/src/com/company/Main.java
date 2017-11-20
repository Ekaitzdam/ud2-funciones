package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int factorial(int numero) {
        int resultado = 0, a = 1;

        for (int v = 1; v <= numero; v++) {
            resultado = a * v;
            a = resultado;

        }
        return resultado;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero, resultado = 0, a = 1;

        System.out.print("Escribe: ");
        numero = Integer.parseInt(br.readLine());

        resultado = factorial(numero);


        System.out.print("El resultado es: ");
        System.out.println(resultado);

    }
}
