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
public class CajeroMain {
    
    public static void main(String[] args) {
        
        Cuenta cAaron = new Cuenta("Aaron Velasco", "413112576");
        cAaron.limite = -100;//el maximo de credito a menor es de -$100
        cAaron.ingreso(500);// ingreso a la cuenta de $500
        cAaron.egreso(300);//sacamos $300 y nos quedan $200
        cAaron.mostrarInformacion();
        
        System.out.println("Sacar $300: " + cAaron.egreso(300));
        
        cAaron.mostrarInformacion();
    }
    
}
