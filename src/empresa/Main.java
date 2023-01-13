package empresa;

public class Main {

    public static void main(String[] args) {

        /*
        empleado manuel = new empleado("Manuel Prior",85000.7,1990,12,17);
        empleado papu = new empleado("Papu Gomez",9500,1995,6,2);
        empleado juan = new empleado("Juan Carlos",10,1941,3,15);

        papu.subirSueldo(10);
        manuel.subirSueldo(5);

        System.out.println("Nombre: " + manuel.getNombre() + " - Sueldo: " + manuel.getSueldo() + " - Fecha de alta: " + manuel.getFechaContrato());
        System.out.println("Nombre: " + papu.getNombre() + " - Sueldo: " + papu.getSueldo() + " - Fecha de alta: " + papu.getFechaContrato());
        System.out.println("Nombre: " + juan.getNombre() + " - Sueldo: " + juan.getSueldo() + " - Fecha de alta: " + juan.getFechaContrato());
        */

        empleado[] misEmpleados=new empleado[3];
        misEmpleados[0] = new empleado("Manuel Prior",85000.7,1990,12,17);
        misEmpleados[1] = new empleado("Papu Gomez",9500,1995,6,2);
        misEmpleados[2] = new empleado("Juan Carlos");

        for (empleado e: misEmpleados) {
            e.subirSueldo(50);
            System.out.println("Id: " + e.getId() +" - Nombre: " + e.getNombre() + " - Sueldo: " + e.getSueldo() + " - Fecha de alta: " + e.getFechaContrato());
        }

    }

}