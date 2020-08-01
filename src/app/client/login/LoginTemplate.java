package app.client.login;

//@author AndresFWilT
import app.services.servicesGraphics.ObjGraficosService;
import app.services.servicesGraphics.RecursosService;

import java.awt.Color;
import static java.awt.Color.DARK_GRAY;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginTemplate extends JFrame {

    private static final long serialVersionUID = 7215779126893195799L;

    //Declaracion objetos graficos
    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones, lFondo, lUsuario, lClave, lOnedrive, lLogo;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox<String> cbTipoFondo;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;

    //Declaracion objetos Decoradores
    private ImageIcon iFondo, iLogo, iUsuario, iClave, iOnedrive, iDimAux;

    //Declaracion servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent loginComponent) {

        super("Login Usuario");
        this.setResizable(false);

        this.loginComponent = loginComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJComboBoxes();
        this.crearJButtons();
        this.crearJCheckBoxes();
        this.crearJLabels();

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    public void crearObjetosDecoradores() {
        iFondo = new ImageIcon("src/resources/Fondo.jpg");
        iLogo = new ImageIcon("src/resources/Logo.jpg");
        iUsuario = new ImageIcon("src/resources/usuario.jpg");
        iClave = new ImageIcon("src/resources/Clave.jpg");
        iOnedrive = new ImageIcon("src/resources/OneDrive.png");
    }

    private void crearJPanels() {
        pIzquierda = sObjGraficos.construirJPanel(0, 0, 600, 500, Color.WHITE, null);
        this.add(pIzquierda);

        pDerecha = sObjGraficos.construirJPanel(600, 0, 400, 500, Color.WHITE, null);
        this.add(pDerecha);
    }

    private void crearJTextFields() {
        tNombreUsuario = sObjGraficos.construirJTextField(
                "Nombre Usuario", (pDerecha.getWidth() - 260) / 2, 130, 260, 40,
                Color.WHITE, sRecursos.getColorNaranja(), sRecursos.getColorGrisOscuro(),
                null, sRecursos.getBorderInferiorNaranja(), "c"
        );
        pDerecha.add(tNombreUsuario);
    }

    private void crearJPasswordFields() {
        tClaveUsuario = sObjGraficos.construirJPasswordField(
                "clave Usuario", (pDerecha.getWidth() - 260) / 2, 260, 260, 40,
                null, sRecursos.getColorNaranja(), sRecursos.getColorGrisOscuro(), null, sRecursos.getBorderInferiorNaranja(), "c"
        );
        pDerecha.add(tClaveUsuario);
    }

    private void crearJComboBoxes() {
        cbTipoFondo = sObjGraficos.construirJComboBox(
                "Negro_Blanco_Gris", (pDerecha.getWidth() - 220) / 2, 210, 220, 30,
                Color.WHITE, sRecursos.getColorNaranja(), "c"
        );
        pDerecha.add(cbTipoFondo);
    }

    private void crearJButtons() {
        //BOTÓN ENTRAR-----------------------------------------------------------------------------
        bEntrar = sObjGraficos.construirJButton(
                "Entrar", (pDerecha.getWidth() - 250) / 2, 330,
                250, 45, sRecursos.getCMano(), null, null, sRecursos.getColorNaranja(),
                Color.WHITE, null, "c", true
        );
        bEntrar.addActionListener(loginComponent);
        pDerecha.add(bEntrar);

        //BOTÓN REGISTRARSE-----------------------------------------------------------------------
        bRegistrarse = sObjGraficos.construirJButton(
                "Registrarse", 230, 410, 145, 35, sRecursos.getCMano(), null,
                null, sRecursos.getColorNaranja(), Color.WHITE, null, "c", true
        );
        bRegistrarse.addActionListener(loginComponent);
        pDerecha.add(bRegistrarse);

        //BOTÓN OPCIÓN 1-----------------------------------------------------------------------------
        bOpcion1 = sObjGraficos.construirJButton(
                "Acerca de Power Point", 230, 410, 145, 35, sRecursos.getCMano(), null,
                null, Color.WHITE, sRecursos.getColorNaranja(), null, "c", true
        );
        bOpcion1.addActionListener(loginComponent);
        pIzquierda.add(bOpcion1);

        //BOTÓN OPCIÓN 2-----------------------------------------------------------------------------
        bOpcion2 = sObjGraficos.construirJButton(
                null, 10, 250, 30, 20, sRecursos.getCMano(), iDimAux, null,
                null, null, null, "c", false
        );
        pIzquierda.add(bOpcion2);
    }

    private void crearJCheckBoxes() {
        checkSi = sObjGraficos.construirJCheckBox(
                "Si", (pDerecha.getWidth() - 45) / 2 - 15, 375, 45, 25, sRecursos.getCMano(), null, null
        );
        pDerecha.add(checkSi);

        checkNo = sObjGraficos.construirJCheckBox(
                "No", (pDerecha.getWidth() + 45) / 2 - 15, 375, 45, 25, sRecursos.getCMano(), null, null
        );
        pDerecha.add(checkNo);

        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);
    }

    private void crearJLabels() {
        //LABEL LOGO-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iLogo.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
        );
        lLogo = sObjGraficos.construirJLabel(null, 50, 20, 40, 40, iDimAux, null, null, null, "c");
        pIzquierda.add(lLogo);

        //LABEL TITULO APP-----------------------------------------------------------------------------
        lTituloApp = sObjGraficos.construirJLabel(
                "Login de Usuario", 100, 20, 220, 30, null, Color.WHITE, null, sRecursos.getFontTPrincipal(), "c"
        );
        pIzquierda.add(lTituloApp);

        //LABEL ESLOGAN-----------------------------------------------------------------------------
        lEslogan = sObjGraficos.construirJLabel(
                "Te ayudamos en todo", (pDerecha.getWidth() - 130) / 2, 60, 130, 20,
                null, sRecursos.getColorGrisOscuro(), null, sRecursos.getFontSubtitulo(), "c"
        );
        pDerecha.add(lEslogan);

        //LABEL TITULO LOGIN-----------------------------------------------------------------------------
        lTituloLogin = sObjGraficos.construirJLabel(
                "Registra tus Datos", (pDerecha.getWidth() - 150) / 2, 80, 150, 30,
                null, sRecursos.getColorGrisOscuro(), null, sRecursos.getFontTitulo(), "c"
        );
        pDerecha.add(lTituloLogin);

        //LABEL CLAVE-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iClave.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        );
        lClave = sObjGraficos.construirJLabel(null, 40, 270, 30, 30, iDimAux, null, null, null, "c");
        pDerecha.add(lClave);

        //LABEL OneDrive-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iOnedrive.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)
        );
        lOnedrive = sObjGraficos.construirJLabel(null, 0, 0, 40, 745, iDimAux, null, null, null, "c");
        pIzquierda.add(lOnedrive);

        //LABEL FONDO-----------------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iFondo.getImage().getScaledInstance(600, 600, Image.SCALE_AREA_AVERAGING)
        );
        lFondo = sObjGraficos.construirJLabel(null, 0, 0, 600, 600, iDimAux, null, null, null, "c");
        pIzquierda.add(lFondo);

    }


    public JButton getBCerrar() {
        return this.bCerrar;
    }

    public JButton getBEntrar() {
        return this.bEntrar;
    }

    public JButton getBRegistrarse() {
        return this.bRegistrarse;
    }

    public JButton getBOpcion1() {
        return this.bOpcion1;
    }

    public JTextField getTNombreUsuario() {
        return this.tNombreUsuario;
    }

    public JPasswordField getTClaveUsuario() {
        return this.tClaveUsuario;
    }

    public JComboBox<String> getCbTipoUsuario() {
        return this.cbTipoFondo;
    }

    public JCheckBox getCheckSi() {
        return this.checkSi;
    }

    public JCheckBox getCheckNo() {
        return this.checkNo;
    }
}
