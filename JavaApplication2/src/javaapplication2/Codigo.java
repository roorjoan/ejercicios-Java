package javaapplication2;

/**
 *
 * @author JARO
 */
import java.util.*;

public class Codigo {

    public static void main(String args[]) {
//        colores RGB
        System.out.print("\033[31m rojo");
        System.out.print("\033[32m verde");
        System.out.print("\033[36m azul");

//        numero aleatorio math.random()*hasta-desde
        int r1 = (int) (Math.random() * 101 + 1);//del 1 al 100

//        metodos para arrays
        int[] arr1 = {0, 2, 4, 6, 8, 10};
        int[] arr2 = {0, 2, 4, 6, 8, 10};
        int[] arr3 = {10, 8, 6, 4, 2, 0};
        boolean result1 = Arrays.equals(arr1, arr2);//compara si los arrays son iguales TRUE
        boolean result2 = Arrays.equals(arr1, arr3);//compara si los arrays son iguales FALSE
        //-----------------------------------------------------------
        int[] source = {12, 1, 5, - 2, 16, 14, 18, 20, 25};
        int[] dest = Arrays.copyOfRange(source, 3, 7);//copia una porcion del arreglo source al dest (pos 3-pos 6)
        //-----------------------------------------------------------
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));//convierte a string un array
        //-----------------------------------------------------------
        int[] numbers2 = {12, 1, 5, - 2, 16, 14};

        Arrays.sort(numbers2);//ordena el array ascendentemente
        //------------------------------------------------------------
        int[] myInt = {21, 23, 34, 45, 56, 78, 99};//el arreglo debe estar ordenado
        int foundIndex = Arrays.binarySearch(myInt, 78);//busca al numero 78 en el arreglo y devuelve su posicion
        int foundIndex2 = Arrays.binarySearch(myInt, 39);/*la salida sera -4. el signo negativo indica q no existe
        y el 4(seria 4 - 1 = 3) es la pos donde deberia estar*/
    }

    static void llenarArreglo(int[] a, int desde, int hasta) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * hasta + desde);
        }
    }

    static void unirArreglos(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            ab[i] = a[i];//arraycopy manual
        }
        int contador = 0;
        for (int i = a.length; i < ab.length; i++) {
            ab[i] = b[contador];
            contador++;
        }
        System.out.println(Arrays.toString(ab));
    }

    static void miArrayCopy(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        System.arraycopy(a, 0, ab, 0, a.length);
        System.arraycopy(b, 0, ab, a.length, b.length);
        System.out.println(Arrays.toString(ab));
    }

    static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        int contador = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        return contador <= 1;
    }

    static int getMinMax(int[] a, String opcion) {
        int min = a[0];//asignando el primer valor del arreglo para comparar(minimo) con los restantes numeros
        int max = a[0];//asignando el primer valor del arreglo para comparar(maximo) con los restantes numeros

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {//buscando el minimo
                min = a[i];
            }
            if (max < a[i]) {//buscando el maximo
                max = a[i];
            }
        }
        if (opcion.equalsIgnoreCase("minimo")) {
            return min;
        } else if (opcion.equalsIgnoreCase("maximo")) {
            return max;
        }
        return -1;
    }
}
