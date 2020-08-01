/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component;

import app.services.servicesGraphics.ObjGraficosService;
import app.services.servicesGraphics.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ssrs_
 */
public class BarraRecientesTemplate extends JPanel {
//Declaración objetos gráficos

    //private JPanel pSuperior, pInferior;
    private JLabel lRecientes, lEslogan, lImagenUsuario, lIconoUsuario;

    //Declaracion objetos Decoradores
    private ImageIcon iFondo, iLogo, iUsuario, iClave, iOnedrive, iDimAux;
    private BarraRecientesComponent navegacionUsuarioComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public BarraRecientesTemplate(BarraRecientesComponent navegacionUsuarioComponent) {
        this.navegacionUsuarioComponent = navegacionUsuarioComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearJLabels();

        this.setSize(400, 760);
        this.setBackground(sRecursos.getColorNaranja());
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJLabels() {

        // LABEL RECIENTES--------------------------------------------------------------------
        this.lRecientes = sObjGraficos.construirJLabel(
                "PowerPoint", 40, 20, 250, 40, null, Color.WHITE, null, sRecursos.getFontTPrincipal(), "c"
        );
        this.add(lRecientes);

    }
}
