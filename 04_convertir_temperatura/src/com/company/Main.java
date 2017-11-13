package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


   public static double convertirTemperatura(double gradoscentigrados) {
    double fahrenheit;
    fahrenheit = 0;
    fahrenheit = (gradoscentigrados * 1.8)+ 32;
    return fahrenheit;


   }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double grados, resultado;
        grados = 0;
        System.out.print("Escribe: ");
        grados = Double.parseDouble(br.readLine());

        resultado = convertirTemperatura(grados);
        System.out.print("El resultado es: ");
        System.out.println(resultado);



    }
}
