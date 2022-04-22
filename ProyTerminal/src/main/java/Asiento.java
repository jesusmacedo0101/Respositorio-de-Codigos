/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class Asiento {
    private Pasajero pas = new Pasajero();
    private String nroAsiento;

    public Asiento() {
    }

    public Asiento(String nroAsiento, Pasajero pasajero) {
        this.nroAsiento = nroAsiento;
        this.pas = pasajero;
    }

    public Pasajero getPas() {
        return pas;
    }

    public void setPas(Pasajero pas) {
        this.pas = pas;
    }

    public String getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(String nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    @Override
    public String toString() {
        return "Asiento{" + "nroAsiento=" + nroAsiento + '}';
    }

    
    
    void mostrar(){
        System.out.println(toString());
        pas.mostrar();
    }
    
    
    
    
}
