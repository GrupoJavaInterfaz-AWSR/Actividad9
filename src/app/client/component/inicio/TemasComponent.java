/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component.inicio;

/**
 *
 * @author ssrs_
 */
public class TemasComponent {

    private TemasTemplate inicioTemplate;

    public TemasComponent() {
        inicioTemplate = new TemasTemplate(this);
    }

    public TemasTemplate getTemasTemplate() {
        return this.inicioTemplate;
    }
}
