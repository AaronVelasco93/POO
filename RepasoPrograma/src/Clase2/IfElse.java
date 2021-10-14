/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class IfElse {

    public static void main(String[] args) {
        //Estructura If-Else
        //programa que me diga si un numero es positivo o negativo
        
        //crear un programa que nos diga su un numero es positivo o negativo
        /**
         * if(condicion){
         *
         * bloque true instrucciones }else { bloque false instrucciones
         *
         * }
         *
         *
         */
        
        Scanner entrada = new Scanner(System.in);
        
        double dato;
        
        System.out.println("---Programa para evaluar un numero positivo o negativo---");
        
        System.out.print("Ingresa un numero:");
            
        dato=entrada.nextDouble();
        
        if(dato<0){//condicion
            System.out.println("Tu numero es negativo");
            System.out.println("Numero ingresado: "+dato);
        }else if(dato == 0){
            System.out.println("Tu numero es neutro");
            System.out.println("Numero ingresado: "+dato);
        }else {
            System.out.println("Tu numero es positivo ");
            System.out.println("Numero ingresado: +"+dato);
        }
        
        System.out.println("Fin del programa");
        
        
    }

}
