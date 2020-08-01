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
public class EducacionComponent {

    private EducacionTemplate educacionTemplate;

    public EducacionComponent() {
        educacionTemplate = new EducacionTemplate(this);
    }

    public EducacionTemplate getEducacionTemplate() {
        return this.educacionTemplate;
    }

}
