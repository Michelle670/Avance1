/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avance1;
import javax.swing.JOptionPane;
public class Avance1 {
    public static void main(String[] args) {
  
        Usuario usuario1 = new Usuario("saratg", "1234");
        Usuario usuario2 = new Usuario("andresbf", "5678");

        Cliente cliente1 = new Cliente("Sara Torres", usuario1);
        Cliente cliente2 = new Cliente("Andrés Brenes", usuario2);

        String usuarioIngresado = JOptionPane.showInputDialog("Ingrese su usuario:");
        String claveIngresada = JOptionPane.showInputDialog("Ingrese su clave:");

        if (cliente1.getUsuario().validarLogin(usuarioIngresado, claveIngresada)) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + cliente1.getNombre());
        } else if (cliente2.getUsuario().validarLogin(usuarioIngresado, claveIngresada)) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + cliente2.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos.");
        }
    }
}