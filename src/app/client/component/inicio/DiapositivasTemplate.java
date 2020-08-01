/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;

import app.services.servicesGraphics.ObjGraficosService;
import app.services.servicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ssrs_
 */
public class DiapositivasTemplate extends JPanel {

    private DiapositivasComponent diapositivasComponent;
    private ObjGraficosService objGraficosService;
    private RecursosService recursosService;
    private JLabel IDiapositiva, TDiapositiva;
    private ImageIcon iDimAux;
    private Color Gris, GrisLetras;
    private Cursor mano;

    public DiapositivasTemplate(DiapositivasComponent diapositivasComponent, String nombre, ImageIcon Diapositiva) {

        this.diapositivasComponent = diapositivasComponent;
        this.diapositivasComponent.getClass();

        IDiapositiva = new JLabel();
        TDiapositiva = new JLabel(nombre);

        this.add(IDiapositiva);
        this.add(TDiapositiva);

        Gris = new Color(225, 225, 225);
        GrisLetras = new Color(160, 160, 160);
        mano = new Cursor(Cursor.HAND_CURSOR);
        iDimAux = new ImageIcon(Diapositiva.getImage().getScaledInstance(210, 110, Image.SCALE_DEFAULT));

        IDiapositiva.setIcon(iDimAux);
        IDiapositiva.setLocation(0, 0);
        IDiapositiva.setLayout(null);
        IDiapositiva.setSize(210, 110);

        TDiapositiva.setLayout(null);
        TDiapositiva.setForeground(GrisLetras);
        TDiapositiva.setBounds(5, 120, 222, 10);

        this.setSize(222, 150);
        this.setBackground(Gris);
        this.setCursor(mano);
        this.setBorder(null);
        this.setLayout(null);
        this.setVisible(true);
    }

}
