package com.hedima.presentacion;

import java.util.Scanner;

public class EjercicioCuadrados {
     public static void main(String[] args) {

         //Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
         int numero;
         Scanner s1 = new Scanner(System.in);
         while (true) {
             System.out.println("Introduzca numero  ");
             numero= s1.nextInt();
             if (numero >= 0) {
                 System.out.println("El cuadrado es "+ Math.pow(numero, 2));
             }else {
                 break;
             }

//            System.out.println(i);
         }

     }


    }
