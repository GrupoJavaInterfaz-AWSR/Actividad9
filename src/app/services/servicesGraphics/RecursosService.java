package app.services.servicesGraphics;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorNaranja, colorGrisOscuro, colorNegro, colorGrisFondo, colorGrisLetras;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontBotones, fontDiagramas;
    private Cursor cMano;
    private Border borderInferiorNaranja;
    private ImageIcon iMinimizar, iCerrar;

    static private RecursosService servicio;

    private RecursosService() {
        colorNegro = new Color(44, 13, 10);
        colorNaranja = new Color(197, 78, 48);
        colorGrisOscuro = new Color(80, 80, 80);
        colorGrisFondo = new Color(225, 225, 225);
        colorGrisLetras = new Color(160, 160, 160);
        fontTPrincipal = new Font("Segoe UI", Font.PLAIN, 40);
        fontTitulo = new Font("Montserrat", Font.PLAIN, 18);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
        fontDiagramas = new Font("Calibri", Font.BOLD, 12);
        fontBotones = new Font("Calibri", Font.BOLD, 12);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        borderInferiorNaranja = BorderFactory.createMatteBorder(0, 0, 2, 0, colorNaranja);
        iMinimizar = new ImageIcon("src/resources/Minimizar.jpg");
        iCerrar = new ImageIcon("src/resources/Cerrar.png");

    }

    public Color getColorNegro() {
        return colorNegro;
    }

    public Color getColorNaranja() {
        return colorNaranja;
    }

    public Color getColorGrisOscuro() {
        return colorGrisOscuro;
    }

    public Color getColorGrisFondo() {
        return colorGrisFondo;
    }

    public Color getColorGrisLetras() {
        return colorGrisLetras;
    }

    public Font getFontTPrincipal() {
        return fontTPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public Font getFontDiagramas() {
        return fontDiagramas;
    }

    public Cursor getCMano() {
        return cMano;
    }

    public Font getFontBotones() {
        return fontBotones;
    }

    public Border getBorderInferiorNaranja() {
        return borderInferiorNaranja;
    }

    public ImageIcon getIMinimizar() {
        return iMinimizar;
    }

    public ImageIcon getIcerrar() {
        return iCerrar;
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }
}
