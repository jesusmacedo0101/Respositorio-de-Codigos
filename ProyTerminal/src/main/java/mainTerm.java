/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class mainTerm {
    public static void main(String[] args) {
        Empleado e = new Empleado("", "", "", "", "");
        Empleado e1 = new Empleado("", "", "", "", "");
        Empleado e2 = new Empleado("", "", "", "", "");
        Empleado e3 = new Empleado("", "", "", "", "");
        Empleado e4 = new Empleado("", "", "", "", "");
        Empleado e5 = new Empleado("", "", "", "", "");
        Empleado e6 = new Empleado("", "", "", "", "");
        Empleado e7 = new Empleado("", "", "", "", "");
        Empleado e8 = new Empleado("", "", "", "", "");
        Empleado e9 = new Empleado("", "", "", "", "");
        Empleado e10 = new Empleado("", "", "", "", "");
        
        
        Pasajero p = new Pasajero(true, true, "", "", "", "");
        Pasajero p1 = new Pasajero(true, true, "", "", "", "");
        Pasajero p2= new Pasajero(true, true, "", "", "", "");
        Pasajero p3 = new Pasajero(true, true, "", "", "", "");
        Pasajero p4 = new Pasajero(true, true, "", "", "", "");
        Pasajero p5 = new Pasajero(true, true, "", "", "", "");
        Pasajero p6 = new Pasajero(true, true, "", "", "", "");
        Pasajero p11 = new Pasajero(true, true, "", "", "", "");
        Pasajero p7 = new Pasajero(true, true, "", "", "", "");
        Pasajero p8 = new Pasajero(true, true, "", "", "", "");
        Pasajero p9 = new Pasajero(true, true, "", "", "", "");
        Pasajero p10 = new Pasajero(true, true, "", "", "", "");
        
        Bus b = new Bus("", "", "", "", "", "");
        Bus b1 = new Bus("", "", "", "", "", "");
        Bus b2 = new Bus("", "", "", "", "", "");
        Bus b3 = new Bus("", "", "", "", "", "");
        Bus b4 = new Bus("", "", "", "", "", "");
        Bus b5 = new Bus("", "", "", "", "", "");
        Bus b6 = new Bus("", "", "", "", "", "");
        Bus b7 = new Bus("", "", "", "", "", "");
        Bus b8 = new Bus("", "", "", "", "", "");
        Bus b9 = new Bus("", "", "", "", "", "");
        
        
        Usuario  u = new Usuario("", "", "", "", "", "");
        Usuario  u1 = new Usuario("", "", "", "", "", "");
        Usuario  u2 = new Usuario("", "", "", "", "", "");
        Usuario  u3 = new Usuario("", "", "", "", "", "");
        Usuario  u4 = new Usuario("", "", "", "", "", "");
        Usuario  u5 = new Usuario("", "", "", "", "", "");
        Usuario  u6 = new Usuario("", "", "", "", "", "");
        Usuario  u7 = new Usuario("", "", "", "", "", "");
        Usuario  u8 = new Usuario("", "", "", "", "", "");
        Usuario  u9 = new Usuario("", "", "", "", "", "");
        Usuario  u10 = new Usuario("", "", "", "", "", "");
        Usuario  u11 = new Usuario("", "", "", "", "", "");
        
        Usuario[] vu = {u,u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11};
        
        Asiento a = new Asiento("", p1);
        Asiento a1 = new Asiento("", p10);
        Asiento a2 = new Asiento("", p2);
        Asiento a3 = new Asiento("", p3);
        Asiento a4 = new Asiento("", p5);
        Asiento a6 = new Asiento("", p10);
        Asiento a5 = new Asiento("", p1);
        Asiento a7 = new Asiento("", p9);
        Asiento a8 = new Asiento("", p8);
        Asiento a9 = new Asiento("", p11);
        Asiento a10 = new Asiento("", p8);
        Asiento a11 = new Asiento("", p10);
        Asiento a12 = new Asiento("", p9);
        Asiento a14 = new Asiento("", p7);
        Asiento a13 = new Asiento("", p7);
        Asiento a19= new Asiento("", p8);
        Asiento a15 = new Asiento("", p10);
        Asiento a16 = new Asiento("", p10);
        Asiento a17 = new Asiento("", p10);
        Asiento a18 = new Asiento("", p10);
        
        Asiento[][] as = {{a,a2,a3},{a4,a5,a6},{a7,a8,a9},{a10,a11,a12}};
        Asiento[][] as1 = {{a13,a14,a15},{a16,a17,a6},{a7,a8,a9},{a10,a11,a12}};
        Asiento[][] as2 = {{a,a2,a3},{a4,a5,a6},{a7,a8,a9},{a10,a11,a12}};
        Asiento[][] as3 = {{a,a2,a3},{a4,a5,a6},{a7,a8,a9},{a10,a11,a12}};
        // as.mostrar();
        ControlAsiento ca1 = new ControlAsiento("p", 4, 3, 10, as);
        ControlAsiento ca2 = new ControlAsiento("p", 4, 3, 10, as1);
        ControlAsiento ca3 = new ControlAsiento("p", 4, 3, 10, as2);
        ControlAsiento ca4 = new ControlAsiento("p", 4, 3, 10, as3);
        
        ControlAsiento[] cas1 = {ca1,ca2};
        ControlAsiento[] cas2 = {ca1,ca2};
        
        Empleado[][] em = {{e,e1,e2},{e,e1,e2},{e,e1,e2}};
        Bus[] bs = {b,b1,b2,b4};
        
        Agencia ag = new Agencia("", "", em, bs,cas1);
        Agencia ag1 = new Agencia("", "", em, bs,cas2);
        Agencia ag2 = new Agencia("", "", em, bs,cas1);
        
        // ag.Mostrar();
        Agencia[] va = {ag,ag1,ag2};
        
        Terminal t1 = new Terminal("", "", "", 3, va);
        Terminal t2 = new Terminal("", "", "", 3, va);
        Terminal t3 = new Terminal("", "", "", 3, va);
        
        Terminal[] vt = { t1, t2};
        
        Departamento dp1 = new Departamento("La Paz", "", vt);
        Departamento dp2 = new Departamento("Santa Cruz", "", vt);
        
        Departamento[] vd = {dp1, dp2};
        
        ControlPrincipal cp = new ControlPrincipal(vd, vu);
        cp.Mostrar();
        
        
        
    }
}
