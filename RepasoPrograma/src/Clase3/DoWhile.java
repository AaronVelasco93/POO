/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

/**
 *
 * @author Aaron
 */
public class DoWhile {
    public static void main(String[] args) {
         /*
        *DO-while
        * do{
            intruccion
        *   }while (Condicion)
        *        
        */
        
        /*contador 10*/
        
        int contador =0;//declaramos variable
        
        do{//instruccion
            System.out.println("Numero: "+(contador+1));
            contador +=1;
            
            
        }while(contador<10);//valuamos la condicion
        
        
        
    }
    
}
