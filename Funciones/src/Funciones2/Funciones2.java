
package Funciones2;

public class Funciones2 {

    public static void main(String[] args) {
      
        /**
         *f(x)=(a+b)/c
         * a=15
         * b=suma(5,5);
         * C=9
         */
        
        int a, b, c;
        int x;
        
        a=15;
        b=adicion(5, 5);
        c=9;
        
        x=(a+b)/c;
        
        System.out.println(x);
              
        
    }
    // suma(5,5);
    static void suma(int x, int b) {
        
        int resultado;
        resultado = x+b;
        System.out.println("El resultado es: "+resultado);
                
    }
   /**
     * tipo nombreFuncione(parametro){
     * 
     * return(valor);
     * }
     * 
     * x=(((a+b)/15)-35)+c
     * 
     * z=x*.16
     * 
     */
     
    static int adicion(int x, int b){
            
        int resultado;
        resultado = x+b;
               
    return resultado;
             
    }
    
 



}
    



