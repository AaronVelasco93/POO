/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Aaron
 */
public class Jefe extends Empleado{

    private double incentivo;//Nuevo atributo pertenece al jefe
    
    public Jefe(String nombre, double sueldo, int anios, int mes, int dia) {
        super(nombre, sueldo, anios, mes, dia);
    }

    //Metodos de acceso
    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    
    
    //metodo de uso General
    
    public void etableceIncentivo(double incentivo){
        this.incentivo= incentivo;
    }
    
    public double dame_sueldo_patron(){
        double sueldoJefe = super.dameSueldo();
        
        return sueldoJefe + incentivo;
                
    }
    
    
    
    
    
    
    
}
