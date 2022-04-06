package jaro.estudio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejemplo de uso de la clase ArrayList
 *
 * @author JARO
 */
public class Uso_ArrayList {

    public static void main(String[] args) {
//        ArrayList<String> s = new ArrayList<String>();
//        System.out.println("numero de elementos " + s.size());
//        s.add("rojo");
//        s.add("verde");
//        s.add("azul");
//        System.out.println("numero de elementos " + s.size());
//        System.out.println(s);
//        System.out.printf("elemento de la posicion %d es %s\n", 2, s.get(1));
//
//        ArrayList<Integer> n = new ArrayList<Integer>();
//        n.add(18);
//        n.add(22);
//        n.add(-30);
//        n.add(144);
//        n.add(69);
//        System.out.println("contenido de la lista de numeros");
////        for (int i = 0; i < n.size(); i++) {
////            System.out.println(n.get(i));
////        }
//        for (Integer numero : n) {
//            System.out.println(numero);
//        }
//        System.out.print("que numero desea eliminar? ");
        Scanner sc = new Scanner(System.in);
//        Integer valor = sc.nextInt();
//        n.remove(valor);
//        System.out.printf("se ha eliminado el %d de la lista\n", valor);
//        System.out.println(n);
//        n.add(100);
//        n.add(100);
//        System.out.println("reemplazando la ultima posicion");
//        System.out.println(n);
//        n.set(n.size() - 1, sc.nextInt());
//        System.out.println("reemplazando elemento de la posicion 1");
//        n.add(1, sc.nextInt());
//        System.out.println(n);
//        System.out.println("eliminando los numeros menores que 100");
//        n.removeIf(nu -> nu < 100);
//        System.out.println(n);

        //------------------------------------------------------------
        ArrayList<Gato> g = new ArrayList<Gato>();

        g.add(new Gato("paco", "mestizo", true, "calle 5"));
        g.add(new Gato("rob", "siames", true, "calle 7"));
        g.add(new Gato("michu"));
        g.add(new Gato("doraemon", "mestizo", false, "Japon"));
        g.add(new Gato("michuu 1"));

        System.out.println(g.size());
        g.trimToSize();

        for (Gato gato : g) {
            System.out.println(gato.Info());
        }

//        System.out.print("desea eliminar a los gatos callejeros? s/n: ");
//        String res = sc.nextLine();
//        if (res.equalsIgnoreCase("s")) {
//            g.removeIf(du ->);
//        }
//        for (Gato gato : g) {
//            System.out.println(gato);
//        }
    }
}

class Gato extends Mascota implements Animal, Comparable<Gato> {

    private String nombre;
    private String raza;

    public Gato(String nombre, String raza, boolean duenio, String direccion) {
        super(duenio, direccion);
        this.nombre = nombre;
        this.raza = raza;
    }

    public Gato(String nombre) {
        this(nombre, "sin raza", false, "sin direccion");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String Sonido() {
        return "Miauuuuuuuu";
    }

    @Override
    public String Info() {
        return "Datos: " + nombre + ", " + raza + ", " + hasDuenio() + ", " + getDireccion();
    }

    //tiene error
    @Override
    public int compareTo(Gato g) {
        return (this.nombre).compareTo(g.getNombre());
    }

}

class Mascota {

    private boolean duenio;
    private String direccion;

    public Mascota(boolean duenio, String direccion) {
        this.duenio = duenio;
        this.direccion = direccion;
    }

    public boolean hasDuenio() {
        return duenio;
    }

    public void setDuenio(String due) {
        if (due.equalsIgnoreCase("si")) {
            this.duenio = true;
        } else {
            this.duenio = false;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

interface Animal {

    public String Sonido();

    public String Info();
}
