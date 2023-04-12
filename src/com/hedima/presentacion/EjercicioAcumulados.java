package com.hedima.presentacion;

import java.util.Scanner;

public class EjercicioAcumulados {
    public static void main(String[] args) {
        // Pedir 10 numeros. Mostrar la media de los numero positivos, la media de los numeros negativos, la cantidad de ceros.

        //1. Definicion de variables
        int sumaPositivos = 0, sumaNegativos =0, contadorPositivos =0, contadorNegativos =0, contadorCeros=0;
        Scanner s1 = new Scanner(System.in);
        //2 Logica
        for (int i = 1; i <= 10; i++) {
            System.out.println("Escriba el numero a evaluar");
            int numero = s1.nextInt();
            if (numero<0){
                contadorNegativos++;
//                sumaNegativos= sumaNegativos + numero;
                sumaNegativos+=numero;
            }else if(numero==0){
                contadorCeros++;
            }else{
                contadorPositivos++;
                sumaPositivos+=numero;
            }
        }
        System.out.println("Promedio de numeros negativos " + sumaNegativos/contadorNegativos);
        System.out.println("Promedio de numeros positivos " + sumaPositivos/contadorPositivos);
        System.out.println("Contador de ceros " + contadorCeros);

        //pedir 5 sueldos y decir su suma y cuanto hay mayores de 1000








    }

            }
