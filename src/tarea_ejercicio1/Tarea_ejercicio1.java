/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Margarita
 */
public class Tarea_ejercicio1 {

    public static void main(String[] args) {
        // arreglo[3] = entrada.nextInt;
        Scanner entrada = new Scanner(System.in);

        int dimension = 0;

        boolean flag = true;
        System.out.println("Ingrese la longitud de la lista: ");
        dimension = entrada.nextInt();
        int[] arreglo = new int[dimension];
        mostrarArreglo(arreglo);


        Random generador = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = generador.nextInt(10);
        }

        do {
            System.out.println("-----¿Que desea hacer?-----");
            System.out.println("1-Llenar arreglo\n2-Mostrar arreglo\n3-Mostar Suma"
                    + "\n4-Salir");
            int decision = entrada.nextInt();
            entrada.nextLine();

            switch (decision) {
                case 1:
                    llenarArreglo(arreglo, entrada);
                    mostrarArreglo(arreglo);
                    break;
                case 2:
                    mostrarArreglo(arreglo);
                    verificararreglo(arreglo);
                    break;
                case 3:
                    sumaArregloPar(arreglo);
                    mostrarArreglo(arreglo);

                case 4:
                    flag = false;
                    break;
            }

        } while (flag);

    }

    public static void llenarArreglo(int[] arreglo, Scanner entrada) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese valor: ");
            arreglo[i] = entrada.nextInt();
        }
    }

    private static void verificararreglo(int[] arreglo) {
        int longitud = arreglo.length;
        if (longitud % 2 == 0) {

        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
    }

    public static void sumaArregloPar(int[] arreglo) {
        for (int i = 0; i < arreglo.length / 2; i++) {
            int conjuncion = arreglo[i] + arreglo[arreglo.length - (i + 1)];
            System.out.println("|" + conjuncion + "|");

        }

    }

}
