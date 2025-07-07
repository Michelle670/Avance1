/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1;

public class Cliente {
    private String nombreCompleto;
    private Usuario usuario;

    public Cliente(String nombreCompleto, Usuario usuario) {
        this.nombreCompleto = nombreCompleto;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public Usuario getUsuario() {
        return usuario;
    }   
    public String obtenerDetalles() {
        return "Nombre del cliente: " + " " + nombreCompleto + " " + usuario.obtenerDetalles();
    }
}
