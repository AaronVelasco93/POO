/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Validacion {

    public static String saludar(String nombre) {
        //Creacion del mensaje
        String saludo = "Hola Ing." + nombre;
        return saludo;
    }

    public static String error(String nombre) {
        //Creacion del mensaje
        String error = "Error de autentificacion." + nombre + " Tu nombre de usuario o password es incorrecto";
        return error;
    }

    public static void verificar(String usuario, String contrasenia) {

        //el user y el pass a comparar
        final String usuarioValido = "HuronMarron";
        final String contraseñaValida = "123ico";

        //validacion de datos
        if (usuarioValido.equals(usuario) && contraseñaValida.equals(contrasenia)) {

            // si son validos los datos de usuario y pass se muestra el siguiente mensaje 
            System.out.println(saludar(usuario));
            return;//termino de ejecucion
        }
        //si los datos no son validos se ejecuta esta linea
        //System.out.println(error(usuario));
        
        JOptionPane.showMessageDialog(null, error(usuario));
        

    }
    
    
    public static void main(String[] args) {
        
        
        String usuario= JOptionPane.showInputDialog("Ingresa tu user");
        String pass=JOptionPane.showInputDialog("Ingresa tu pass");
        
        //funciones verificar
        
        verificar(usuario, pass);
        
        
        
                
        
        
    }

}
