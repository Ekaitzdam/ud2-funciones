package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean calcularCambio(double moneda, String a) {
        double resultado;
        resultado = 0;
        boolean bucle = true;
        switch (a) {
            case "usd":
                resultado = moneda * 1.15945;
                System.out.print("El resultado es: ");
                System.out.println(resultado);
                break;

            case "gbp":
                resultado = moneda * 0.88435;
                System.out.print("El resultado es: ");
                System.out.println(resultado);
                break;
            case "cny":
                resultado = moneda * 7.6841;
                System.out.print("El resultado es: ");
                System.out.println(resultado);
                break;
            case "jpy":
                resultado = moneda * 132;
                System.out.print("El resultado es: ");
                System.out.println(resultado);
                break;
            default:
                bucle = false;
                System.out.println("Error");

        }

        return bucle;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;
        double moneda;
        System.out.print("Introduzca una cantidad en euros: ");
        moneda = Double.parseDouble(br.readLine());
        boolean repeticion = true;

        do {
            System.out.print("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
            a = br.readLine();
            repeticion = calcularCambio(moneda, a);
        } while (repeticion == false);

    }
}
