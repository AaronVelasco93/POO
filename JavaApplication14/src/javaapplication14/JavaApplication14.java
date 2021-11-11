/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);//esta fuera de do while

        int opcion;

        int Dato1, Dato2;

        do {

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Salir");

            System.out.println("Introduce una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("--SUMA--");
                    System.out.print("Ingresa tu primer dato: ");
                    Dato1 = entrada.nextInt();
                    System.out.print("Ingresa tu segundo dato:");
                    Dato2 = entrada.nextInt();
                    System.out.print("Resultado");
                    suma(Dato1, Dato2);

                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Fue de rango");
                    break;

            }

        } while (opcion != 3);

    }

    static void suma(int a, int b) {

        int resultado;
        resultado = a + b;
        System.out.println(resultado);
    }

}
