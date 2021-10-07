/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Edad {
    
    public static void main(String[] args) {
        //hacer un programa que nos pregunte la edad y nuestra estatura
        
        Scanner scLeer = new Scanner(System.in);
        
        //declaracion de variables
        int edad;
        double estatura;
        
        /*Preguntas al usuario*/
        System.out.println("Cual es tu edad: ");
            edad=scLeer.nextInt();
            
        System.out.println("Cual es tu estatura: ");
            estatura=scLeer.nextDouble();
        
         int resultado;
         resultado=edad+1;
            
        // Mostrando Resultados
            
            System.out.println("El proximo año tendras: "+resultado);
            System.out.println("Tu estatura es de: "+estatura+" metros");
            
            
            
        
        
        
        
        
        
        
        
    }
         
    
}
