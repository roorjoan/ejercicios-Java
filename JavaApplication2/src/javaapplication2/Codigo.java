package javaapplication2;

/**
 *
 * @author JARO
 */
public class Codigo {

    public static void main(String args[]) {
//        colores RGB
        System.out.print("\033[31m rojo");
        System.out.print("\033[32m verde");
        System.out.print("\033[36m azul");

        int[] a = new int[10];
//        dandole valores al arreglo a
        for (int i : a) {
            a[i] = (int) Math.round(Math.random() * 100);
            System.out.println("\033[31m rojo " + a[i] + " ");
        }

//        numero aleatorio math.random()*(hasta-desde+1)+desde
        int r = (int) (Math.random() * (100 - 10 + 1) + 10);
        int r1 = (int) (Math.random() * 101 + 1);

    }
}
