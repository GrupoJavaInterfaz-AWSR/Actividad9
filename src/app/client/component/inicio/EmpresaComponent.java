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
public class EmpresaComponent {

    private EmpresaTemplate empresaTemplate;

    public EmpresaComponent() {
        empresaTemplate = new EmpresaTemplate(this);
    }

    public EmpresaTemplate getEmpresaTemplate() {
        return this.empresaTemplate;
    }
}
