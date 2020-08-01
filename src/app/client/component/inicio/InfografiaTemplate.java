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
public class InfografiaTemplate extends JPanel {

    private InfografiaComponent infografiaComponent;

    public InfografiaTemplate(InfografiaComponent infografiaComponent) {
        this.infografiaComponent = infografiaComponent;
        this.infografiaComponent.getClass();
        this.setSize(960, 640);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
