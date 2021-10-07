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
public class EjercicioConScanner {
    public static void main(String[] args) {
        /**
         *Diseñar un programa que calcule la longitud y el área de una circunferencia.
         *para esto nuestro usuario deberá introducir el radio(el radio puede contener decimales)
         *longitud = 2Pi * Radio
         *área= PI * radio^2
         * 
         **/
                
        final double PI=3.1416; //constante
        double radio;
        double area, longitud;
        
        //declar
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el Radio: ");
            radio=sc.nextDouble();
            
            longitud = 2 * PI * radio;
            area = PI * radio * radio;
            //Math.pow(radio,2)
                        
        System.out.println("La longitud del circulo es: "+longitud);
        System.out.println("El Area de la circunferencia es: "+area);
            
            
        
        
        
        
        
        
    }
}
