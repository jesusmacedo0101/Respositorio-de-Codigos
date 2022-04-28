/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Terminal {
    private String nomTerminal;
    private String ubicacion;
    private String idTerminal;
    private Agencia ag[]=new Agencia[10];
    private int nroAgencia;

    public Terminal(String nomTerminal, String ubicacion, String idTerminal, int nroAgencia,Agencia[] a) {
        this.nomTerminal = nomTerminal;
        this.ubicacion = ubicacion;
        this.idTerminal = idTerminal;
        this.nroAgencia = nroAgencia;
        this.ag=a;
    }
    public void Mostrar(){
        System.out.println("Nom Terminal"+this.nomTerminal);
        System.out.println("Ubicacion: "+this.ubicacion);
        System.out.println("id Terminal "+this.idTerminal);
        System.out.println("NroAgencia: "+this.nroAgencia);
        System.out.println("AGENCIA*************");
        for(int i=0;i<this.nroAgencia;i++){
            this.ag[i].Mostrar();
        }
    }
    public String getNomTerminal() {
        return nomTerminal;
    }

    public void setNomTerminal(String nomTerminal) {
        this.nomTerminal = nomTerminal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(String idTerminal) {
        this.idTerminal = idTerminal;
    }

    public Agencia[] getAg() {
        return ag;
    }

    public void setAg(Agencia[] ag) {
        this.ag = ag;
    }

    public int getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(int nroAgencia) {
        this.nroAgencia = nroAgencia;
    }
    
}
