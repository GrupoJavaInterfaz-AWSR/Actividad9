/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;

import javax.swing.ImageIcon;

/**
 *
 * @author ssrs_
 */
public class DiagramasComponent {

    private DiagramasTemplate diagramasTemplate;

    public DiagramasComponent() {
        diagramasTemplate = new DiagramasTemplate(this);
    }

    public DiagramasTemplate getDiagramasTemplate() {
        return this.diagramasTemplate;
    }
}
