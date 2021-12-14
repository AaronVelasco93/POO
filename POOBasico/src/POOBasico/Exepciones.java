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
public class Exepciones {
    
    public static void main(String[] args) {
        
        int nums[] = new int [4];
        
        try {
                System.out.println("Antes de que se genere la exepcion");
            
                nums[7]=10;
            
                
        } catch (Exception e) {
        
                //captura de la exepcion
            
                System.out.println("Indice fuera de los limites de tu arreglo"+e);
        }
        
    
        
        
        
    }
    
}
