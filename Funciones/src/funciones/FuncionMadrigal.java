/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author Aaron
 */
public class FuncionMadrigal {
    public static void main(String[] args) {
     
        int suma;
        int resta;
        int operacion;
        
                
        suma=suma(5, 7);
        //suma=12
        resta=resta(7, 5);
        //resta=2
        
            
        operacion=suma+resta;
        //operacion=12+2
        
        System.out.println(operacion);
        
    }
     
    //declaracion de mis funciones
    static int suma(int a, int b){
               
        return a+b;
    }
    
    static int resta(int a, int b){
               
        return a-b;
    }
    
    //funciones sin retorno
    static void multiplicacion(int a, int b){
        int resultado;
            resultado=a+b;
        
    }
    
}
