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
public class DiapositivasComponent {

    private DiapositivasTemplate diapositivasTemplate;

    public DiapositivasComponent(String nombre, ImageIcon Diapositiva) {
        diapositivasTemplate = new DiapositivasTemplate(this, nombre, Diapositiva);
    }

    public DiapositivasTemplate getDiapositivasTemplate() {
        return this.diapositivasTemplate;
    }

}
