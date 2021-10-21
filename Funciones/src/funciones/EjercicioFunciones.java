/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class EjercicioFunciones {

    static void suma(int a, int b) {
        int operacion;
        operacion = a + b;
        System.out.println("Suma: "+operacion);
    }

    static void resta(int a, int b) {
        int resultado;
        resultado = a - b;
        System.out.println("Resta: "+resultado);
    }

    static void multiplicacion(int a, int b) {
        int resultado;
        resultado = a * b;
        System.out.println("Multiplicacion:"+resultado);
    }
    
    public static void main(String[] args) {
            
        Scanner entradaDatos = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.print("Ingresa Numero 1: ");
            numero1= entradaDatos.nextInt();
            
        System.out.print("Ingresa Numero 2: ");
            numero2=entradaDatos.nextInt();
            
        suma(numero1, numero2);
        
        resta(numero1, numero2);
        
        multiplicacion(numero1, numero2);
    }

}
