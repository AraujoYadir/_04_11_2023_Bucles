package com.hedima.presentacion;

import java.util.Scanner;

public class EjerciciosSueldo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int sueldo = 0; int con=0;
        int suma=0;
        for (int i=1; i<=5;i++) {
            System.out.println("El sueldo :"+i);
            sueldo = s1.nextInt();
            suma += sueldo;
//            System.out.println(sueldo);
            if (sueldo>1000){
                con++;
            }
        }
        System.out.println("Sueldos superior a 1000 :"+con);
        System.out.println("Suma de Sueldos "+suma);
    }
}
