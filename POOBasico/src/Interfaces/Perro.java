/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Aaron
 */
//Implementado interfaces

public class Perro  extends Animal implements AccionesAnimales{
    
    //atributos o caracteristcas de mi perro
    
    private String Nombre;
    private int NumeroPlaca;
    private String DireccionCasa;

    public Perro( String Nombre, int NumeroPlaca, String DireccionCasa, int tamanio, int peso, String tipo_epecie) {
        super(tamanio, peso, tipo_epecie);
        this.Nombre=Nombre;
        this.NumeroPlaca=NumeroPlaca;
        this.DireccionCasa=DireccionCasa;
      
    }
    
    //metodos de acceso

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(int NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }

    public String getDireccionCasa() {
        return DireccionCasa;
    }

    public void setDireccionCasa(String DireccionCasa) {
        this.DireccionCasa = DireccionCasa;
    }
    
    
    //metodo general
    
    public void datoPerro(){
        System.out.println("El perro se llama "+Nombre+" Su numoer de placa es: "+ NumeroPlaca+"Vive en: " +DireccionCasa+" ");
    
    }

    
    //metodos abstractos
    
    @Override
    public String NombreCientifico(String nombreCietifico) {
        this.nombreCientifico=nombreCietifico;
        return "El nombre cientifico de mi perro es: "+nombreCietifico;
    
    }
    
      
    
    
    @Override
    public int promedioAnioVida(int aniosVida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String nombreCientifico;
    
    
    
    
    
    
    
    
}
