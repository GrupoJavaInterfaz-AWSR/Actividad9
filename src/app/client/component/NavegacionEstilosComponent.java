/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.servicesLogic.UsuarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import models.Usuario;

/**
 *
 * @author ssrs_
 */
public class NavegacionEstilosComponent implements ActionListener, MouseListener, MouseMotionListener {

    private NavegacionEstilosTemplate navegacionEstilosTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private UsuarioService sUsuario;
    private Usuario usuarioLogeado;
    private int posicionInicialX, posicionInicialY;
    private String Componente;

    public NavegacionEstilosComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.sUsuario = UsuarioService.getService();
        this.usuarioLogeado = sUsuario.getUsuarioLogeado();
        navegacionEstilosTemplate = new NavegacionEstilosTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand().trim());
        vistaPrincipalComponent.mostrarComponente(ae.getActionCommand().trim());
    }

    public void mouseListener(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        this.vistaPrincipalComponent.moverVentana(
                e.getXOnScreen() - posicionInicialX, e.getYOnScreen() - posicionInicialY
        );
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        String Componente = String.valueOf(e.getComponent());
        if (Componente.equals("javax.swing.JTextField[,10,45,680x25,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=java.awt.Color[r=0,g=0,b=0],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=0,columnWidth=0,command=,horizontalAlignment=CENTER]")) {
            vistaPrincipalComponent.mostrarComponente("borrar");
            vistaPrincipalComponent.mostrarComponente("borrar");
        }
    }

    public NavegacionEstilosTemplate getBattaTituloTemplate() {
        return navegacionEstilosTemplate;
    }

    public void mousePressed(MouseEvent me) {
        posicionInicialX = me.getX() + 250;
        posicionInicialY = me.getY();
    }

    public void mouseReleased(MouseEvent me) {

    }

    public void mouseEntered(MouseEvent me) {

    }

    public void mouseExited(MouseEvent me) {

    }

    public Usuario getUsuario() {
        return this.usuarioLogeado;
    }
}
