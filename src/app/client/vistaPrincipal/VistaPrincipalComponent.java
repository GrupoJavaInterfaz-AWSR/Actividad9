package app.client.vistaPrincipal;

//@author AndresFWilt
import app.client.component.NavegacionEstilosComponent;
import app.client.component.BarraRecientesComponent;
import app.client.component.inicio.PresentacionesComponent;
import app.client.component.inicio.TemasComponent;
import app.client.component.inicio.EducacionComponent;
import app.client.component.inicio.GraficosComponent;
import app.client.component.inicio.DiagramasComponent;
import app.client.component.inicio.EmpresaComponent;
import app.client.component.inicio.InfografiaComponent;
import app.client.login.LoginComponent;
import java.awt.Frame;

public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;

    //Declaclaracion Componentes
    private NavegacionEstilosComponent navegacionEstilosComponent;
    private BarraRecientesComponent barraRecientesComponent;
    private LoginComponent loginComponent;
    private PresentacionesComponent presentacionesComponent;
    private TemasComponent temasComponent;
    private EducacionComponent educacionComponent;
    private GraficosComponent graficosComponent;
    private DiagramasComponent diagramasComponent;
    private EmpresaComponent empresaComponent;
    private InfografiaComponent infografiaComponent;

    public VistaPrincipalComponent(LoginComponent loginComponent) {
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        navegacionEstilosComponent = new NavegacionEstilosComponent(this);
        barraRecientesComponent = new BarraRecientesComponent();
        this.loginComponent = loginComponent;
        this.presentacionesComponent = new PresentacionesComponent();
        vistaPrincipalTemplate.getPNavegacion().add(
                navegacionEstilosComponent.getBattaTituloTemplate()
        );

        vistaPrincipalTemplate.getPRecientes().add(barraRecientesComponent.getNavegacionUsuarioTemplate()
        );

        vistaPrincipalTemplate.getPPrincipal().add(presentacionesComponent.getPresentacionTemplate());
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

    public void minimizar() {
        this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }

    public void moverVentana(int posicionX, int posicionY) {
        this.vistaPrincipalTemplate.setLocation(posicionX, posicionY);
    }

    public void mostrarComponente(String comando) {
        vistaPrincipalTemplate.getPPrincipal().removeAll();
        switch (comando) {
            case "Presentaciones":
                if (this.presentacionesComponent == null) {
                    this.presentacionesComponent = new PresentacionesComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            presentacionesComponent.getPresentacionTemplate()
                    );
                }
                break;
            case "Temas":
                if (this.temasComponent == null) {
                    this.temasComponent = new TemasComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            temasComponent.getTemasTemplate()
                    );
                }
                break;
            case "Educacion":
                if (this.educacionComponent == null) {
                    this.educacionComponent = new EducacionComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            educacionComponent.getEducacionTemplate()
                    );
                }
                break;
            case "Graficos":
                if (this.graficosComponent == null) {
                    this.graficosComponent = new GraficosComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            graficosComponent.getGraficosTemplate()
                    );
                }
                break;
            case "Diagramas":
                if (this.diagramasComponent == null) {
                    this.diagramasComponent = new DiagramasComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            diagramasComponent.getDiagramasTemplate()
                    );
                }
                break;
            case "Empresa":
                if (this.empresaComponent == null) {
                    this.empresaComponent = new EmpresaComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            empresaComponent.getEmpresaTemplate()
                    );
                }
                break;
            case "Infografia":
                if (this.infografiaComponent == null) {
                    this.infografiaComponent = new InfografiaComponent();
                } else {
                    vistaPrincipalTemplate.getPPrincipal().add(
                            infografiaComponent.getInfografiaTemplate()
                    );
                }
                break;
            case "Cambiar de cuenta":
                loginComponent.getLoginTemplate().setVisible(true);
                this.vistaPrincipalTemplate.setVisible(false);
                break;
            case "Minimizar":
                minimizar();
                break;
            case "Cerrar":
                System.exit(0);
                break;
            case "borrar":
                navegacionEstilosComponent.getBattaTituloTemplate().limpiarTexts();
                break;
        }
        this.vistaPrincipalTemplate.repaint();
    }
}
