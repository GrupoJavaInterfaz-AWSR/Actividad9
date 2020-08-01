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
public class GraficosComponent {

    private GraficosTemplate graficosTemplate;

    public GraficosComponent() {
        graficosTemplate = new GraficosTemplate(this);
    }

    public GraficosTemplate getGraficosTemplate() {
        return this.graficosTemplate;
    }

}
