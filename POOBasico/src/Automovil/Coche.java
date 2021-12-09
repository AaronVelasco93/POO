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
public class Coche {
    
    //variables
    String Propietario;
    private int ruedas;// Con private se encapsula la informacion
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
   
    //Constructores
   public Coche(String Propietario, int ruedas, int largo, int ancho, int motor, int peso_plataforma, String color) {
        this.Propietario = Propietario;
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
        this.color = color;
    }
   
   public Coche() {
        Propietario="Agencia";
        ruedas =4;
        largo =2000;
        ancho =300;
        motor=1600;
        color="---";
        peso_plataforma=500;
        

    }

     
   /*METODOS DE ACCESO*/
   
   public String getColor(){ //getter
   
       return color;
   }
   
   public void setColor(String color){ // setter
       this.color=color;
   }
   
   
   public String dime_datos_generales(){//getter

       return "Propiedad de: "+Propietario+" \nLa plataforma del veiculo tiene "+ruedas+" Ruedas "+
       ".Mide "+largo/1000 +" metros con un ancho de "+ancho+
       " cm y un peso de plataforma de "+peso_plataforma+" kg \n Color: "+color;       
   }
   
   
   public void configura_Asiento (String asiento_cuero){
       
       if(asiento_cuero.equalsIgnoreCase("si")){
           this.asientos_cuero=true;
       }else{
           this.asientos_cuero=false;
       }
       
   }
   
   public String dime_asiento(){
       if(asientos_cuero=true){
           return "El coche tiene asientos de Cuero";
       }else{
           return "El coche no cuenta con asientos de Cuero";
       }
    }
   
   
   public void configura_clima( String clima ){
       
       if(clima.equalsIgnoreCase("si")){
           this.climatizador=true;
       }else{
           this.climatizador= false;
       }
   
   }
     
   public String dime_clima(){
       if(climatizador=true){
           return "El coche tiene aire acondicionado";
       }else{
           return "El coche no cuenta con aire acondicionado";
       }
    }
   
   
   /*metodo para caluclar el precio del coche*/
   
   
   public int precio_coche(){
   
       int precio_final=100000;

       if(asientos_cuero==true){
           precio_final+=15000;
       }
       if(climatizador == true){
           precio_final+=15000;
       }
       
       return precio_final;
       
   }
   
   
   
}
