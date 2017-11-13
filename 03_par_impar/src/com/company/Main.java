package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean esPar(int n) {
        int resto = 0;
        boolean ParImpar=true;
        resto = n % 2;
        if (resto == 0) {
            ParImpar = true;}
        return ParImpar;
    }


    public static boolean esImpar(int n) {
        int resto = 0;
        boolean ParImpar=true;
        resto = n % 2;

        if (resto != 0) {
            ParImpar = false;}
        return ParImpar;
    }




    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean resultado = true;
        System.out.print("Escribe un numero: ");
        int n = Integer.parseInt(br.readLine());

        resultado = esPar(n);
        resultado = esImpar(n);

        if (resultado == true) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }





    }
}
