package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double convertirTemperatura(double grados, boolean escala) {
        double fahrenheit, kelvin;

        if (escala == true) {
            //si. Es verdadero
            grados = (grados * 1.8) + 32;//f
        } else {
            //no. Es falso
            grados = (grados * 1) + 273.15;//k
        }
        return grados;


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double grados, resultado;
        int eleccion;
        boolean escala, fin;
        fin = true;
        eleccion = 0;

        do {
            System.out.print("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción: ");

            eleccion = Integer.parseInt(br.readLine());

            System.out.print("Escribe los grados; ");
            grados = Double.parseDouble(br.readLine());


            switch (eleccion) {
                case 1:
                    escala = true;
                    resultado = convertirTemperatura(grados, escala);
                    System.out.print("El resultado es: ");
                    System.out.println(resultado);
                    break;
                case 2:
                    escala = false;
                    resultado = convertirTemperatura(grados, escala);
                    System.out.print("El resultado es: ");
                    System.out.println(resultado);
                    break;
                case 3:
                    fin = false;
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Numero incorrecto");

            }

        } while (fin == true);

    }


}
