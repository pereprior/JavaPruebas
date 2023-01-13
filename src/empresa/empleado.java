package empresa;

import java.util.*;

public class empleado {

    public empleado(String nombre, double sueldo, int anyo, int mes, int dia) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        id=nextId;
        nextId++;

        GregorianCalendar calendario = new GregorianCalendar(anyo,mes,dia);

        altaContrato = calendario.getTime();

    }

    public empleado(String nombre) {

        this(nombre, 30000, 2000,01,01);

    }

    public String getNombre() {

        return this.nombre;
    }

    public double getSueldo() {

        return this.sueldo;
    }

    public Date getFechaContrato() {

        return this.altaContrato;
    }

    public int getId() {

        return this.id;
    }

    public void subirSueldo(double porcentaje) {

        sueldo+=sueldo*porcentaje/100;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    private int id;
    private static int nextId = 1;

}
