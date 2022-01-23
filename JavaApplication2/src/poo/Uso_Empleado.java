package poo;

import java.util.*;

/**
 *
 * @author JARO
 */
public class Uso_Empleado {

    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Jose A", 3410, 2019, 11, 05);
//        Empleado empleado2 = new Empleado("Antonio R", 4000, 2017, 12, 15);
//
//        empleado1.subirSueldo(5);
//        empleado2.subirSueldo(5);
//
//        System.out.println("Nombre " + empleado1.getNombre() + " - Sueldo " + empleado1.getSueldo());
//        System.out.println("Nombre " + empleado2.getNombre() + " - Sueldo " + empleado2.getSueldo());
//        System.out.println("Empleado " + empleado1.getNombre() + " - " + empleado1.getAltaContrato());
//        System.out.println("Empleado " + empleado2.getNombre() + " - " + empleado2.getAltaContrato());

        Empleado[] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Jose A", 3410, 2019, 11, 05);
        misEmpleados[1] = new Empleado("Antonio R", 4000, 2017, 12, 15);
        misEmpleados[2] = new Empleado("Rodriguez O");
        misEmpleados[3] = new Empleado("Ortega");

        for (Empleado e : misEmpleados) {
            e.subirSueldo(5);
        }
        for (Empleado e : misEmpleados) {
            System.out.printf("Empleado %s tiene un sueldo de %s\n", e.getNombre(), e.getSueldo());
        }

    }
}

class Empleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public Empleado(String nombre) {
        this(nombre, 3000, 2000, 01, 01);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void subirSueldo(double porciento) {
        double aumento = sueldo * porciento / 100;
        sueldo += aumento;
    }

}
