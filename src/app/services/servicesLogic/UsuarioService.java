/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.services.servicesLogic;

import logic.ControlUsuarios;
import models.Usuario;

/**
 *
 * @author ssrs_
 */
public class UsuarioService {

    private static UsuarioService servicio;
    private ControlUsuarios cUsuario;
    private String usuarioLogeado;

    public UsuarioService() {
        cUsuario = new ControlUsuarios();
    }

    public boolean verificarDatosUsuario(String nombreUsuario, String claveUsuario) {
        if (cUsuario.verificarUsuario(nombreUsuario, claveUsuario)) {
            this.usuarioLogeado = nombreUsuario;
            return true;
        }
        return false;
    }

    public Usuario getUsuarioLogeado() {
        return cUsuario.devolverUsuario(usuarioLogeado);
    }

    public static UsuarioService getService() {
        if (servicio == null) {
            servicio = new UsuarioService();
        }
        return servicio;
    }

}
