package jaro.poo;

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

        Jefatura jefe = new Jefatura("JARO", 4010, 2018, 9, 12);
        jefe.setIncentivo(500);

        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Jose A", 3410, 2019, 11, 05);
        misEmpleados[1] = new Empleado("Antonio R", 4000, 2017, 12, 15);
        misEmpleados[2] = new Empleado("Rodriguez O");
        misEmpleados[3] = new Empleado("Ortega");

        misEmpleados[4] = jefe;//polimorfismo
        misEmpleados[5] = new Jefatura("yoyo", 2200, 2000, 2, 28);

        Jefatura jefa = (Jefatura) misEmpleados[5];//casting
        jefa.setIncentivo(1500);

        for (Empleado e : misEmpleados) {
            e.subirSueldo(5);
        }

        System.out.println(jefa.tomarDecision("Subir el sueldo a todos"));//utilizando metodo de la interfaz Jefes
        Arrays.sort(misEmpleados);//ordena el array de objetos Empleados por sueldo
        for (Empleado e : misEmpleados) {
            System.out.printf("Empleado %s tiene un sueldo de %s\n", e.getNombre(), e.getSueldo());
        }
    }
}

class Empleado implements Comparable {

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

    public int compareTo(Object obj) {//implementando el metodo de la interfaz
        Empleado e = (Empleado) obj;//casting del obj
        if (this.sueldo < e.sueldo) {
            return -1;
        }
        if (this.sueldo > e.sueldo) {
            return 1;
        }
        return 0;
    }

}

final class Jefatura extends Empleado implements Jefes {

    private int incentivo;

    public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }

    public void setIncentivo(int incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        double sueldo_jefe = super.getSueldo();//sobreescribiendo el metodo de la clase padre
        return sueldo_jefe + incentivo;
    }

    public String tomarDecision(String decision) {//implementando el metodo de la interfaz Jefes
        return "EL jefe tomó la desicion de: " + decision;
    }

}
