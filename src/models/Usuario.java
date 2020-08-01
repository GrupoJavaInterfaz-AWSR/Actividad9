/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.ImageIcon;

/**
 *
 * @author ssrs_
 */
public class Usuario {

    private String nombreUsuario;
    private String claveUsuario;
    private ImageIcon imagenUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public ImageIcon getImagenUsuario() {
        return imagenUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public void setImagenUsuario(ImageIcon imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }
}
