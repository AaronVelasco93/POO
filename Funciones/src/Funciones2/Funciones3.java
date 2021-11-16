/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones2;

/**
 *
 * @author Aaron
 */
public class Funciones3 {
    
    
    static void demoSobrec (){
        
            System.out.println("funcion sin parametros y con Void");
        }
    
    static void demoSobrec(int numero ){
            System.out.println("Funcion con un parametro: "+ numero);
        } 
    
    static int demoSobrec( int numero1, int numero2 ){
                int suma;
                    suma=numero1+numero2;
            return suma;
        }   
    
    static double demoSobrec(double x, double y ){
            double total;
                total=x+y;
            return total;
       }
    
    
    public static void main(String[] args) {
        
        
        demoSobrec();
        
        demoSobrec(10);
        
 //------------------------
        
        int suma, numero, datoFuncion;
        
        numero =56;
        datoFuncion=demoSobrec(3, 24);
        
        System.out.println(datoFuncion);
        
        suma= datoFuncion +numero;
        
        System.out.println(suma);
        
 //---------------------------
        
        
        
        System.out.println(demoSobrec(12.5, 15.56));
        
    }
            
    
    
}
