package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int perimetroRectangulo(int base, int altura) {
        int a = base * 2 + altura * 2;
        return a;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe valor de la base: ");
        int base = Integer.parseInt(br.readLine());
        System.out.print("Escribe valor de la altura: ");
        int altura = Integer.parseInt(br.readLine());
        int b = perimetroRectangulo(base, altura);
        System.out.print("El perimetro es: ");
        System.out.println(b);
    }

}
