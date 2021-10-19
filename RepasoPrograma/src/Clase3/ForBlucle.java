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
public class ForBlucle {

    public static void main(String[] args) {

        /*
         * for (inicializacion; condicion; inccremento){
        
         bloque de intrucciones
            
         }
         *
         */
        /*
         int i;
        
         //i=4
         //1
         //2
         //3
         for ( i = 1; i <= 10; i++) {
         System.out.println("valor: "+i);
         }*/
        //declaracion de variables
        /*
         int i;
         int j;

         for (i = 1; i <= 4; i++) {
            
         System.out.println("---------Ejecucion I -" + i + "----------");
         for (j = 1; j <= 3; j++) {
         System.out.println("Ejecucion de j: " + j);
         }
            
         }
         */
        
        for (int i = 0; i <= 2; i++) { //blucle Externo
            System.out.println("-----Bucle Externo, i=" + i+"-----");

            for (int j = 0; j <= 3; j++) {//Bucle Medio
                System.out.println("Blucle medio j=" + j);

                for (int k = 0; k <= 4; k++) {//Bucle interno
                    System.out.println("Blucle interno k=" + k);

                }
            }

        }

    }

}
