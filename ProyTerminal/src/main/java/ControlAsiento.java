/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class ControlAsiento {
    private String  idBus;
    private int  nF,  nC  ;
    private Asiento[][]   as = new Asiento[nF][nC];
    private double precio;

    public ControlAsiento() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                as[i][j] = new Asiento();
            }
        }
    }

    public ControlAsiento(String idBus, int nF, int nC, double precio) {
        this.idBus = idBus;
        this.nF = nF;
        this.nC = nC;
        this.precio = precio;
        for (int i = 0; i < this.nF; i++) {
            for (int j = 0; j < this.nC; j++) {
                as[i][j] = new Asiento();
            }
        }
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public int getnF() {
        return nF;
    }

    public void setnF(int nF) {
        this.nF = nF;
    }

    public int getnC() {
        return nC;
    }

    public void setnC(int nC) {
        this.nC = nC;
    }

    public Asiento[][] getAs() {
        return as;
    }

    public void setAs(Asiento[][] as) {
        this.as = as;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ControlAsiento{" + "idBus=" + idBus + ", nF=" + nF + ", nC=" + nC + ", precio=" + precio + '}';
    }
    
    void mostrar(){
        System.out.println(toString());
        for (int i = 0; i < this.nF; i++) {
            for (int j = 0; j < this.nC; j++) {
                as[i][j].mostrar();
            }
        }
    }
    
}
