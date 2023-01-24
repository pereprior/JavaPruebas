package empresa;

import java.util.*;

public class empleado implements Comparable, Interfaz {

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

    @Override
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

    @Override
    public int compareTo(Object o) {
        empresa.empleado otroEmpleado = (empresa.empleado) o;

        if (this.sueldo<otroEmpleado.sueldo) {
            return -1;
        }

        if (this.sueldo>otroEmpleado.sueldo) {
            return 1;
        }

        return 0;
    }
}
