/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ControlPrincipal {
    private Departamento dep[]=new Departamento[9];
    private Usuario us[]=new Usuario[50];
    
    public ControlPrincipal(Departamento[] d,Usuario[] u){
        this.dep=d;
        this.us=u;
    }
    
    public void Mostrar(){
        System.out.println("/******Depàrtamento******");
        for (Departamento dep1 : this.dep) {
            dep1.Mostrar();
        }
        System.out.println("*******Usuario**********");
        for(Usuario u:this.us ){
            u.mostrar();
        }
    }

    public Departamento[] getDep() {
        return dep;
    }

    public void setDep(Departamento[] dep) {
        this.dep = dep;
    }

    public Usuario[] getUs() {
        return us;
    }

    public void setUs(Usuario[] us) {
        this.us = us;
    }
    
}
