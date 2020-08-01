/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;

import app.services.servicesGraphics.ObjGraficosService;
import app.services.servicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author ssrs_
 */
public class PresentacionesTemplate extends JPanel {

    private PresentacionesComponent presentacionesComponent;
    private ObjGraficosService objGraficosService;
    private RecursosService recursosService;
    private JPanel PDipositiva0, PDiapositiva1, PDiapositiva2, PDiapositiva3;
    private ImageIcon IDiapositiva0, IDiapositiva1, IDiapositiva2, IDiapositiva3;
    //private String TDiagrama1, TDiagrama2, TDiagrama3, TDiagrama4;

    public PresentacionesTemplate(PresentacionesComponent presentacionesComponent) {
        this.presentacionesComponent = presentacionesComponent;
        this.presentacionesComponent.getClass();
        this.objGraficosService = ObjGraficosService.getService();
        this.recursosService = RecursosService.getService();
        this.crearJPaneles();
        this.crearobjetosDecoradores();
        this.crearContenidoDiagrama1();
        this.crearContenidoDiagrama2();
        this.crearContenidoDiagrama3();
        this.crearContenidoDiagrama4();
        this.setSize(960, 1040);
        this.setBackground(recursosService.getColorGrisFondo());
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPaneles() {
        this.PDipositiva0 = objGraficosService.construirJPanel(
                20, 0, 222, 150, recursosService.getColorGrisFondo(), null
        );
        this.add(PDipositiva0);
        this.PDiapositiva1 = objGraficosService.construirJPanel(
                252, 0, 222, 150, recursosService.getColorGrisOscuro(), null
        );
        this.add(PDiapositiva1);
        this.PDiapositiva2 = objGraficosService.construirJPanel(
                484, 0, 222, 150, recursosService.getColorNaranja(), null
        );
        this.add(PDiapositiva2);
        this.PDiapositiva3 = objGraficosService.construirJPanel(
                716, 0, 222, 150, recursosService.getColorNegro(), null
        );
        this.add(PDiapositiva3);
    }

    public void crearobjetosDecoradores() {
        this.IDiapositiva0 = new ImageIcon("src/resources/PIDiapositiva0.jpg");
        this.IDiapositiva1 = new ImageIcon("src/resources/PIDiapositiva1.jpg");
        this.IDiapositiva2 = new ImageIcon("src/resources/PIDiapositiva2.jpg");
        this.IDiapositiva3 = new ImageIcon("src/resources/PIDiapositiva3.jpg");
    }

    public void crearContenidoDiagrama1() {
        this.PDipositiva0.add(new DiapositivasComponent(
                "Presentacion en blanco",
                IDiapositiva0).getDiapositivasTemplate());
    }

    public void crearContenidoDiagrama2() {
        this.PDiapositiva1.add(new DiapositivasComponent(
                "Galería",
                IDiapositiva1).getDiapositivasTemplate());
    }

    public void crearContenidoDiagrama3() {
        this.PDiapositiva2.add(new DiapositivasComponent(
                "Paquete",
                IDiapositiva2).getDiapositivasTemplate());
    }

    public void crearContenidoDiagrama4() {
        this.PDiapositiva3.add(new DiapositivasComponent(
                "Letras en madera",
                IDiapositiva3).getDiapositivasTemplate());
    }
}
