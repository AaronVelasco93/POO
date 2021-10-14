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
public class AnidacionIf {
    
    
    public static void main(String[] args) {
        
        int a=18;
        
        if (a==1){
            System.out.println("Lunes");
        }else if(a==2){
            System.out.println("Martes");
        }else if(a==3){
            System.out.println("Miercoles");
        }else if (a== 4){
            System.out.println("Jueves");
        }else if (a == 5){
            System.out.println("Viernes");
        }else{
            System.out.println("Numero no soportado:"+a);
        }
        
    }
    
}
