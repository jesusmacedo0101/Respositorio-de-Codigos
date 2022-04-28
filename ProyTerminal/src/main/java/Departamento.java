/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Departamento {
    private String nomDep;
    private String idDepartamento;
    private Terminal[] ter=new Terminal[2];

    public Departamento(String nomDep, String idDepartamento,Terminal[] t) {
        this.nomDep = nomDep;
        this.idDepartamento = idDepartamento;
        this.ter=t;
    }
    
    public void Mostrar(){
        System.out.println("Nomb Dep: "+this.nomDep);
        System.out.println("Id  Dep: "+this.idDepartamento);
        System.out.println("****TERMINALES*****");
        for(int i=0;i<ter.length;i++){
            ter[i].Mostrar();
            System.out.println("***********");
        }
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Terminal[] getTer() {
        return ter;
    }

    public void setTer(Terminal[] ter) {
        this.ter = ter;
    }
    
}
