/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automovil;

/**
 *
 * @author Aaron
 */
public class UsoCoche {
    public static void main(String[] args) {
        
        
        Coche miCoche = new Coche();
        
      //  System.out.println(miCoche.dime_datos_generales());
        
        /*Otra objeto*/
        
        Coche cocheBraulio = new Coche();
        
       // System.out.println(cocheBraulio.dime_datos_generales());
        
        /*vendimos el coche*/
        
        cocheBraulio.Propietario="Braulio";
        //System.out.println(cocheBraulio.dime_datos_generales());
        
        cocheBraulio.setColor("Negro");
        //System.out.println(cocheBraulio.dime_datos_generales());
        /*---------------------*/
        
        Coche cocheEduardo= new Coche("Eduardo", 4, 2000, 300, 250, 1000, "Azul");
        
        //System.out.println(cocheEduardo.dime_datos_generales());
        
        
        
        /*------------prueba---------------*/
        
        Coche cocheALEXEI = new Coche();
        System.out.println("Datos del Coche \n"+cocheALEXEI.dime_datos_generales());
        
        
        /*El inge Alexei compra el coche*/
        System.out.println("Configuracion y compra del automovil");
        cocheALEXEI.Propietario="ALEXEI BERNAL MARTINEZ";
        cocheALEXEI.setColor("Azul");
        cocheALEXEI.configura_Asiento("SI");
        cocheALEXEI.configura_clima("sI");
        System.out.println(cocheALEXEI.dime_asiento());
        System.out.println(cocheALEXEI.dime_clima());
        System.out.println("\n \n Datos del Coche [Configurado] \n"+cocheALEXEI.dime_datos_generales());
        System.out.println("Precion Final");
        System.out.println(cocheALEXEI.precio_coche());
        
        
        
        
        
    }
    
}
