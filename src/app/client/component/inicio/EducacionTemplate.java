/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ssrs_
 */
public class EducacionTemplate extends JPanel {

    private EducacionComponent educacionComponent;

    public EducacionTemplate(EducacionComponent educacionComponent) {
        this.educacionComponent = educacionComponent;
        this.educacionComponent.getClass();
        this.setSize(960, 640);
        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setVisible(true);
    }

}
