package jaro.poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author JARO
 */
public class Uso_Persona {

    public static void main(String[] args) {
        Persona[] laspersonas = new Persona[3];
        laspersonas[0] = new Empleado2("jose", 3410, 2018, 9, 12);
        laspersonas[1] = new Alumno("antonio", "Ing. Informatica");
        laspersonas[2] = new Empleado2("rodriguez", 4010, 2021, 12, 1);

        for (Persona lapersona : laspersonas) {
            System.out.printf("Nombre %s - Datos %s\n", lapersona.getNombre(), lapersona.info());
        }
    }
}

abstract class Persona {//clase abstracta

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String info();//metodo abstracto
}

class Empleado2 extends Persona {

    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idsig = 1;

    public Empleado2(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre);//contructor de la clase padre
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
        altaContrato = calendario.getTime();
        id = idsig;
        idsig++;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    public String info() {
        return "Id " + idsig + " sueldo " + sueldo + " alta contrato " + altaContrato;
    }
}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String info() {
        return "carrera " + carrera;
    }
}
