/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

/**
 *
 * @author Aaron
 */
public class Cuenta {
    
    double saldo; //El efectivo que va a tener mi usuario
    String nombre; // Nombre del titular
    String dni; // identificacion NO del titular
    double limite; // limite a deuda
    
    /*Contructor por defecto*/
    public Cuenta(String nombre, String dni){
        
         saldo=0;
        limite=-50;
        this.nombre=nombre;
        this.dni=dni;
    
    }
    
    /*metodo para mostrar la informacion*/
    
    public void mostrarInformacion(){
    
        System.err.println("Nombre: "+nombre);
        System.out.println("Dni: "+dni);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite a deuda: "+limite);
    }
    
    /*metodo para ingreso de dinero*/
    public void ingreso(double cant){
            saldo+=cant;
    }
    
    /*metodo para poder sacar el dinero*/
    
    boolean egreso(double cant){
        boolean operacionPosible;
        
        if((saldo - cant )>=limite){//cuando solictamos sacar dinero
              saldo-=cant; //de finir si podemos o no sacar el dinero
              operacionPosible=true;
        }else{
            System.out.println("No hay dinero suficiente");
            operacionPosible=false;
        }
          return (operacionPosible);
         
    }
    
    
    
    
    
    
    
    
    
    
}
