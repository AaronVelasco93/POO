/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

/**
 *
 * @author Aaron
 */
public class CondicionalIf {

    public static void main(String[] args) {

        int a;
        a = 5;

        //Programa va a evaluar si 'a' es menor que 10
        /**
         * if (condicion){ instrucciones
         *
         * }
         */
        if (a+5 < 10) { //if que abre 
            a=0;
            System.out.println("El valor de a: " + a + " es menor que 10");

        }//if que cierra

        System.out.println("El valor de la variable 'a' es = "+a);

    }

}
