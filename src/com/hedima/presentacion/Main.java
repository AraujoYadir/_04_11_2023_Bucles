package com.hedima.presentacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Pedir un numero i y mostrar todos los numeros del 1 al i
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = sn.nextInt();
        for(int i = 1; i <= a; i++){
            System.out.println(i);
        }

        // Escibir todos numero del 100 al 0 de 7 en 7

        int b = 0;
        for(int i = 100; i >= 0; i-=7){
            System.out.print(i+ ",");
        }

        // Diseñar un Programa que muestre el producto de los 10 primero numeros impares

        int c = 1;
        for(int i=1; i<=20; i++){
            System.out.println("--interaccion--" + i);
            if(i%2!= 0){
                c*=i;
                System.out.println("numero impar " + i + " valor de c -> " + c);
            }
        }
        System.out.println("El resultado es->"+c);

        // Pedir 10 numeros. Mostrar la media de los numero positivos, la media de los numeros negativos, la cantidad de ceros.

    }

}