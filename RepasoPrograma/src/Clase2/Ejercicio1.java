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
public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        *Diseñar un programa o aplicacion que solicite un numero al usuario
        y no indique si es par o impar
        Nota: usar el condicional if- else
        **/
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("---Programa para saber si un numero es Par o Impar");
        System.out.println("Ingresa un numero");
            numero=sc.nextInt();
        if( numero%2==0 ){
            System.out.println("Tu numero es par y es: "+numero);
        }else{
            System.out.println("Tu numero es impar y es: "+numero);
        }
        
        
        
        
    }
}
