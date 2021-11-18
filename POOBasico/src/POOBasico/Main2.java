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
public class Main2 {
    public static void main(String[] args) {
        
        //usando el constrcutor 1
        Persona Ciudadano2= new Persona();
        Ciudadano2.edad=15;
        Ciudadano2.nombre="Jose";
        Ciudadano2.estatura=1.85;
        
        //Usando el Constrcutor 2
        Persona ciudadano = new Persona("Aaron", 1.85, 25);
        
        
        //Usando el constrcutor 3
        
        Persona ciudadano3 = new Persona("Jose");
            ciudadano3.saludar();
            System.out.println(ciudadano3.edad);
            
        
    }
    
}
