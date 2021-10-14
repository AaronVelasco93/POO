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
public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        *Generar un programa que me pida dos numero y me diga si
        *son iguales o no
        *Usar if-else
        */
        
        Scanner entradaDatos = new Scanner(System.in);
        //variables
        int numero1;
        int numero2;
        
        System.out.print("Ingresa tu primer numero");
            numero1=entradaDatos.nextInt();
        
        System.out.print("\nIngresa tu segundo numero");
            numero2=entradaDatos.nextInt();
         
        if(numero1 == numero2){
            System.out.println("Tus numeros son iguales");
        }else{
        
            System.out.println("Tu numeros son diferentes");
        }
        
        
        
        
    }
        
}
