package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double perimetroRectangulo(double base, double altura) {
        double a = base * altura;
        return a;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe valor de la base: ");
        double base = Double.parseDouble(br.readLine());
        System.out.print("Escribe valor de la altura: ");
        double altura = Double.parseDouble(br.readLine());
        perimetroRectangulo(base, altura);
        double b = perimetroRectangulo(base, altura);
        System.out.print("El perimetro es: ");
        System.out.println(b);
    }

}
