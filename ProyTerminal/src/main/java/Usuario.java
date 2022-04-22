/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class Usuario extends  Persona{
    private String nomUs,password;

    public Usuario() {
        super();
    }
    
    public Usuario(String nomUs, String password, String nombre, String edad, String genero, String ci) {
        super(nombre, edad, genero, ci);
        this.nomUs = nomUs;
        this.password = password;
    }

    public String getNomUs() {
        return nomUs;
    }

    public void setNomUs(String nomUs) {
        this.nomUs = nomUs;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomUs=" + nomUs + ", password=" + password + '}';
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println(toString());
    }
}
