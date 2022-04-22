/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class Pasajero extends  Persona{
    private boolean tipoPas , equipaje     ;

    public Pasajero() {
        super();
    }

    public Pasajero(boolean tipoPas, boolean equipaje, String nombre, String edad, String genero, String ci) {
        super(nombre, edad, genero, ci);
        this.tipoPas = tipoPas;
        this.equipaje = equipaje;
    }
    
    
    
}
