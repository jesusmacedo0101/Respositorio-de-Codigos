/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Agencia {
    private Empleado[][] em=new Empleado[3][10];
    private Bus[] bus=new Bus[10];
    private String idAgencia;
    private String nomAgencia;
    private ControlAsiento[] ca=new ControlAsiento[10];

    public Agencia(String idAgencia, String nomAgencia,Empleado[][] em,Bus[] bus,ControlAsiento[] ca) {
        this.idAgencia = idAgencia;
        this.nomAgencia = nomAgencia;
        this.em=em;
        this.bus=bus;
        this.ca=ca;
    }
    public void Mostrar(){
        System.out.print("Id Agencia: "+this.idAgencia);
        System.out.println("Nombre Agencia: "+this.nomAgencia);
        System.out.println("****Empleados******");
        for(int i=0;i<em.length;i++){
            System.out.println("****TIPO EMPLEADO***");
            for(int j=0;j<em[i].length;j++){
                this.em[i][j].Mostrar();
            }
            System.out.println("*********************");  
        }
        System.out.println("*******BUSES************");
        for (Bus bu : bus) {
            bu.Mostrar();
        }
        System.out.println("**********ControlAsiento***************");
        for(ControlAsiento c:ca){
            c.mostrar();
        }
        System.out.println("*****************************");
    }
    public Empleado[][] getEm() {
        return em;
    }

    public void setEm(Empleado[][] em) {
        this.em = em;
    }

    public Bus[] getBus() {
        return bus;
    }

    public void setBus(Bus[] bus) {
        this.bus = bus;
    }

    public String getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNomAgencia() {
        return nomAgencia;
    }

    public void setNomAgencia(String nomAgencia) {
        this.nomAgencia = nomAgencia;
    }

    public ControlAsiento[] getCa() {
        return ca;
    }

    public void setCa(ControlAsiento[] ca) {
        this.ca = ca;
    }
    
}
