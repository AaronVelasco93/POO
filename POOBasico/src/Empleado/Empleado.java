/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aaron
 */
public class Empleado {
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    public Empleado(String nombre, double sueldo,int anios, int mes, int dia ){
    
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anios, mes - 1,dia);
       altaContrato=calendario.getTime();
    }
    
    
    public Empleado(String nombre){//constructor
        this.nombre=nombre;
    }

    public String getDimeNombre() {//getter
        return "El nombre es: "+nombre;
    }
    
    public double dameSueldo(){
        return sueldo;
    }
    
    
    public String getDimeSueldo() { //getter
        return "El suedo es de: "+sueldo;
    }

    public Date getAltaContrato() {//getter
        return altaContrato;
    }
    
    
    public void subeSueldo(double porcentaje){ //metodo
        
        double aumento = (sueldo* porcentaje)/100;
        
        sueldo+=aumento;//sueldo = sueldo+aumento
    }
    
    
    
    
    
}
