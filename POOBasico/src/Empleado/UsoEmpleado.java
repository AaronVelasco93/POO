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
public class UsoEmpleado {
    
    public static void main(String[] args) {
        
        
        Empleado miEmpleado1 = new Empleado("Aaron Velasco",18500,2017,8,22);
        
        System.out.println("Nombre: "+ miEmpleado1.getDimeNombre()+"\n Suedo: "+miEmpleado1.getDimeSueldo()+"\n Ingreso: "+miEmpleado1.getAltaContrato());
        
        
        
    }
    
}
