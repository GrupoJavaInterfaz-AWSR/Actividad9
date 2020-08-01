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
public class TemasTemplate extends JPanel {

    private TemasComponent temasComponent;

    public TemasTemplate(TemasComponent temasComponent) {
        this.temasComponent = temasComponent;
        this.temasComponent.getClass();
        this.setSize(960, 640);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }

}
