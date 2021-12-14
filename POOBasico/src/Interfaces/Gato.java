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
public class Gato implements AccionesAnimales{
    
    private String TipoPelo;
    private String Color;
    private String Nombre;

    public Gato(String TipoPelo, String Color, String Nombre) {
        this.TipoPelo = TipoPelo;
        this.Color = Color;
        this.Nombre = Nombre;
    }

    public String getTipoPelo() {
        return TipoPelo;
    }

    public void setTipoPelo(String TipoPelo) {
        this.TipoPelo = TipoPelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String NombreCientifico(String nombreCietifico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int promedioAnioVida(int aniosVida) {
        
        this.vida=aniosVida;
        return aniosVida;
    
    }
    
    
    private int vida;
    
        
}
