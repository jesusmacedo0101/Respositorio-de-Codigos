/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Empleado extends Persona{
    private String tipoEmpleado;
    
    public Empleado(String a,String b,String c,String d,String e ){
        super(a,b,c,d);
        this.tipoEmpleado=e;
    }
    public void Mostrar(){
        super.mostrar();
        System.out.println("Tipo de empleando: "+this.tipoEmpleado);
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    
}
