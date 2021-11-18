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
public class Persona {
    
    //definimos nuestros atributos
    String nombre;
    double estatura;
    int edad;
    
    
    //Constructor 1
    Persona(){
    }
    
    //Contructor 2
    Persona(String nombre, double estatura, int edad){
        this.nombre=nombre;
        this.estatura=estatura;
        this.edad=edad;
    }
    
    //Constrcutor 3
    Persona(String nombre){
        this.nombre=nombre;
        estatura=0;
        edad=0;
    }
    
    //Metodo1
    void saludar (){
        System.out.println("Hola mi nombre es "+ nombre);
        System.out.println("Encantado de conocerte");
    }
    
    //Metodo2
    void cumplirAños(){
        edad++;
    }
    
    //Metodo3
    void crecer(double incremento){
    
        //estatura=estatura+incremento;
        estatura+=incremento;
        
    }
    
    
    
  
    
    
    
}
