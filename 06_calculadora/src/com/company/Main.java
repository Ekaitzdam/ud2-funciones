package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double longitud(double radio) {
        double respuesta = 2 * Math.PI * radio;
        return respuesta;
        //para simplificar el return, es mejor ponerlo: return 2 * pi * radio;
    }

    public static double area(double radio) {
        double respuesta = Math.PI * Math.pow(radio, 2);
        return respuesta;
    }

    public static double volumen(double radio) {
        double respuesta = 4 / 3 * Math.PI * Math.pow(radio, 3);
        return respuesta;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radio, a;
        radio = 0;
        char opcion;
        do {
            System.out.print("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción: ");

            opcion = br.readLine().charAt(0);  //entre el br y charat se pone otra cosa para utilizar solo minusculas.
            if (opcion != 'd') {
                System.out.print("Escribe el radio: ");
                radio = Double.parseDouble(br.readLine());
            }


            switch (opcion) {

                case 'a':
                    a = longitud(radio);
                    System.out.print("La longitud es de: ");
                    System.out.println(a);
                    break;
                case 'b':
                    a = area(radio);
                    System.out.print("El area es: ");
                    System.out.println(a);
                    break;
                case 'c':
                    a = volumen(radio);
                    System.out.print("El volumen es de: ");
                    System.out.println(a);
                    break;
                case 'd':

                    break;
                default:
                    System.out.println("Error");
                    break;


            }
        } while (opcion != 'd');

    }
}
