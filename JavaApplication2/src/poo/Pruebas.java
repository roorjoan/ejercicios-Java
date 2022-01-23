package poo;

/**
 *
 * @author JARO
 */
public class Pruebas {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Jose");
        empleados[1] = new Empleado("Antonio");
        empleados[1].setSeccion("RRHH");
        empleados[2] = new Empleado("Rodriguez");

        for (Empleado empleado : empleados) {
            System.out.println(empleado.infoEmpleado());
        }

    }
}

class Empleado {

    private final String nombre;
    private String seccion;
    private int id;
    public static int idsig = 1;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.seccion = "Administración";
        id = idsig;
        idsig++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String infoEmpleado() {
        return "El nombre del empleado es " + id + " " + nombre + " y la sección " + seccion;
    }
}
