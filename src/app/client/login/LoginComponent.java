/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

/**
 *
 * @author AndresFWilT
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.servicesLogic.UsuarioService;

public class LoginComponent implements ActionListener {

    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private UsuarioService sUsuario;

    public LoginComponent() {
        this.loginTemplate = new LoginTemplate(this);
        sUsuario = UsuarioService.getService();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginTemplate.getBEntrar()) {
            this.enviarDatosUsuario();
        }
        if (e.getSource() == loginTemplate.getBCerrar()) {
            System.exit(0);
        }
        if (e.getSource() == loginTemplate.getBOpcion1()) {
            JOptionPane.showMessageDialog(null, "Boton Opcion", "Advertencia", 1);
        }
        if (e.getSource() == loginTemplate.getBRegistrarse()) {
            JOptionPane.showMessageDialog(null, "Boton Registro", "Advertencia", 1);
        }
    }

    public void enviarDatosUsuario() {
        String nombreUsuario = loginTemplate.getTNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.getTClaveUsuario().getPassword());
        String check = "";
        if (sUsuario.verificarDatosUsuario(nombreUsuario, claveUsuario)) {
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso", "Advertencia", 1);
            entrar();
        } else {
            JOptionPane.showMessageDialog(null, "Algo quedo mal", "Advertencia", 2);
        }
    }

    public void entrar() {
        if (vistaPrincipalComponent == null) {
            vistaPrincipalComponent = new VistaPrincipalComponent(this);
        } else {
            vistaPrincipalComponent.getVistaPrincipalTemplate().setVisible(true);
            loginTemplate.setVisible(false);
        }
    }

    public LoginTemplate getLoginTemplate() {
        return this.loginTemplate;
    }
}
