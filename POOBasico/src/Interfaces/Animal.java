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
public class Animal {
    
    
    private int tamanio;
    private int peso;
    private String tipo_epecie;

    
    //constructor
    public Animal(int tamanio, int peso, String tipo_epecie) {
        this.tamanio = tamanio;
        this.peso = peso;
        this.tipo_epecie = tipo_epecie;
    }

    //Metodos de Acceso
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo_epecie() {
        return tipo_epecie;
    }

    public void setTipo_epecie(String tipo_epecie) {
        this.tipo_epecie = tipo_epecie;
    }
    
    //Metodo de uso general
    
    public String dameDatosAnimal(){
        return "Nombre Especie"+tipo_epecie+" Peso: "+peso+"kg"
                +" Tamaño: "+tamanio;
    }
    
    
    
    
    
    
}
