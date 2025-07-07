/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1;
public class Usuario {
    private String nombreUsuario;
    private String clave;
    
    public Usuario(String nombreUsuario, String clave){
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }
     public boolean validarLogin(String usuarioIngresado, String claveIngresada) {
        return nombreUsuario.equals(usuarioIngresado) && clave.equals(claveIngresada);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
     public String obtenerDetalles() {
        return "Usuario: " + nombreUsuario + "Clave: " + clave;
    }
}

