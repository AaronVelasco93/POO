/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import static funciones.LlamarFunciones.saludar;
import static funciones.LlamarFunciones.despedida;

/**
 *
 * @author Aaron
 */
public class Funciones {
/**
*    static Tipo NombreFuncion(){
        cuerpo de mi funcion
   }
 Ejemplos de nombres de funciones con Camel
 suma(), variosSaludos(), muestraDatosCliente()
*    */
    
   
        
    public static void main(String[] args) {//Inicia main
        // TODO code application logic here

        variosSaludos(-1);//mando a llamar mi funcion
       
       // saludar();
       //despedida();
    }//terminal main
      
    //DECLARANDO FUNCIONES
    static void variosSaludos(int veces){//inicia mi funcion y tiene un parametro de entrada
       System.out.println("Fragmento de Codigo --  3 Saludos");

        for (int i = 1; i <= veces; i++) {
            System.out.println(i+"- Hola como estas esto es un saludo"); //fagemento de codigo
        } 
    }//termina mi funcion
    /**
     * Realizar un programa que 
     * haga 3 funciones
     * -Suma 
     * -Resta 
     * -Multiplicacion
     *
     * Requiere que se leean los 
     * datos por medio del teclado
     */
      

}
