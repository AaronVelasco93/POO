/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOBasico;

/**
 *
 * @author Aaron
 */
public class Main {
    
    
     /*Aqui inicia el metodo Main*/ 
    public static void main(String[] args) {
        
        Persona ciudadano1 = new Persona();
        Persona ciudadano2 = new Persona();
        Persona ciudadano3 = new Persona();
        
        ciudadano1.nombre="Aaron Velasco";
        ciudadano1.edad=27;
        ciudadano1.estatura=1.76;
        
        
        
        ciudadano2.nombre="Henry";
        ciudadano2.edad=26;
        ciudadano2.estatura=1.80;
        ciudadano2.saludar();
        
        ciudadano3.nombre="Jose";
        ciudadano3.edad=27;
        ciudadano3.estatura=1.80;
        ciudadano3.saludar();
        
        
        
   
        
        
        System.out.println(ciudadano1.edad);
                
        
        
        
        /*
        // Primer ejemplo de creacion de Objetos
        
        
        Persona individuo;
            individuo = new Persona();
            
        Persona ciudadano = new Persona();
        
        individuo.nombre="Aaron";
        individuo.edad=20;
        individuo.estatura=1.75;
        
        
        System.out.println("El nombre de mi P1 es: "+individuo.nombre);
        System.out.println("La edad de mi P1 es: "+individuo.edad);
        System.out.println("La estatura de mi P1 es: "+individuo.estatura);
        
        System.out.println("--------------------------------------");
        individuo.saludar();
        individuo.cumplirAños();
        System.out.println("La edad de mi P1 es: "+individuo.edad);
        
        individuo.crecer(-.25);
        System.out.println("La estatura de mi P1 es: "+individuo.estatura);
        */    
        
        
    }
    
}
