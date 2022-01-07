package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author JARO
 */
public class Uso_Empleado {

    public static void main(String[] args) {

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
