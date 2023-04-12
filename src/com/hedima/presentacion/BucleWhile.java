package com.hedima.presentacion;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        int i;
        int suma = 0;
        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca numero  ");
            i = s1.nextInt();
            if (i >= 0) {
                suma += i;
            } else {
                break;
            }

//            System.out.println(i);
        }
        System.out.println("El numero introducido es menor de cero y la suma de  los numeros es " + suma);
    }
}
