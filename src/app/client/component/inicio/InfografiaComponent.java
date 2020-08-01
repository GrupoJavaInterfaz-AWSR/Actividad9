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
public class InfografiaComponent {
    private InfografiaTemplate infografiaTemplate;

    public InfografiaComponent() {
        infografiaTemplate = new InfografiaTemplate(this);
    }

    public InfografiaTemplate getInfografiaTemplate() {
        return this.infografiaTemplate;
    }    
}
