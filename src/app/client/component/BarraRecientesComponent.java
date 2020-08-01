/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ssrs_
 */
public class BarraRecientesComponent implements ActionListener {

    private BarraRecientesTemplate barraRecientesTemplate;

    public BarraRecientesComponent() {
        barraRecientesTemplate = new BarraRecientesTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
    
    public BarraRecientesTemplate getNavegacionUsuarioTemplate(){
        return barraRecientesTemplate;
    }

}
