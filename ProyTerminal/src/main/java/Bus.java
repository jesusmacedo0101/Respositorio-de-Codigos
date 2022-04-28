/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Bus {
    private String tipoBus;
    private String modelo;
    private String placa;
    private String idBus;
    private String idCont1;
    private String idCont2;
    public Bus(){
    
    }
    public Bus(String tipoBus, String modelo, String placa, String idBus, String idCont1, String idCont2) {
        this.tipoBus = tipoBus;
        this.modelo = modelo;
        this.placa = placa;
        this.idBus = idBus;
        this.idCont1 = idCont1;
        this.idCont2 = idCont2;
    }
    public void Mostrar(){
        System.out.println("Tipo bus: "+this.tipoBus);
        System.out.println("Modelo "+this.modelo);
        System.out.println("Placa "+this.placa);
        System.out.println("id Bus "+this.idBus);
        System.out.println("id con 1"+this.idCont1);
        System.out.println("id Con 2"+this.idCont2);
    }
    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public String getIdCont1() {
        return idCont1;
    }

    public void setIdCont1(String idCont1) {
        this.idCont1 = idCont1;
    }

    public String getIdCont2() {
        return idCont2;
    }

    public void setIdCont2(String idCont2) {
        this.idCont2 = idCont2;
    }
    
}
