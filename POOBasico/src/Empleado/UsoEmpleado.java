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
        
        /*
        Empleado miEmpleado1 = new Empleado("Aaron Velasco",18500,2017,8,22);
        
        System.out.println("Nombre: "+ miEmpleado1.getDimeNombre()+
        "\n Suedo: "+miEmpleado1.getDimeSueldo()+
        "\n Ingreso: "+miEmpleado1.getAltaContrato());*/
        
        
        //usando la herencia
        Jefe aaron_RHH = new Jefe("Ing. Aaron Velasco", 20000, 2020, 10, 10);
        
        
        Empleado [] misEmpleados = new Empleado[5];
        
        misEmpleados[0] = new Empleado("Alan", 9000, 2018, 12, 5);
        misEmpleados[1] = new Empleado("Jonathan Velasco", 10000, 2015, 2003, 23);
        misEmpleados[2] = new Empleado("Maria de Jesus", 15000, 2012, 1, 5);
        misEmpleados[3] = new Empleado("Misael", 22000, 2017, 8, 8);
        misEmpleados[4] = aaron_RHH;//polimorfismo
        
        
        /*imprimiendo un solo registro*/
        //System.out.println(misEmpleados[1].getDimeSueldo());
        /*
        //CON FOR NORMAL    
        
        for (int i = 0; i <misEmpleados.length; i++) {
            
            System.out.println(misEmpleados[i].getDimeNombre()
                    +misEmpleados[i].getDimeSueldo()
                    +"Fecha de contratacion: "
                    +misEmpleados[i].getAltaContrato());
        }
        
        //subir sueldo
        
        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].subeSueldo(5);
        }
        */
      
        //For mejorado
    
        for (Empleado misEmpleado : misEmpleados) {
                misEmpleado.subeSueldo(5);
            
        }
        System.out.println("Se sube a todo el personal un 5% de su sueldo"+
                    "\n menos directivos");       
        
        
        for (Empleado misEmpleado : misEmpleados) {
         
             System.out.println(misEmpleado.getDimeNombre()
                    +misEmpleado.getDimeSueldo()
                    +"Fecha de contratacion: "
                    +misEmpleado.getAltaContrato());
        }
        System.out.println("----------------------------------");    
        
        System.out.println("Nombre del Jefe: "+aaron_RHH.getDimeNombre());
        System.out.println("Sueldo del Jefe"+aaron_RHH.dame_sueldo_patron());
        
        aaron_RHH.etableceIncentivo(4000);
        
        System.out.println("Se aplica incentivo: "+aaron_RHH.dame_sueldo_patron());
        
        
        
        
    }
    
}
