package com.hedima.presentacion;

import java.util.Scanner;

public class EjercicioAlumnos {
    public static void main(String[] args) {
//Dada la edad de 5 Alumnos, 1. Mostrar la edad media 2.LA cantidad de alumnos mayores de 18.
        Scanner s2 = new Scanner(System.in);
        int edad=0;
        int con=0;
        int suma = 0;
        for (int i=1; i<=5;i++) {
            System.out.println("inserte la edad del alumno ");
            edad= s2.nextInt();
            suma+=edad;
            if(edad>=18){
                con++;
            }
        }
        System.out.println("la edad media de los alumnos es:" + suma/5);
        System.out.println("Alumnos mayores de edad son: " + con);


    }
}
