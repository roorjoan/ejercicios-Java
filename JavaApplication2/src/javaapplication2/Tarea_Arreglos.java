package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author JARO
 */
public class Tarea_Arreglos {

    //funciones
    static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void llenarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
//------------------------------------------------------------------------------
//        System.out.println("\033[31m Ejercicio 7.8");
//        System.out.println("a) Mostrar el valor del elemento 6 del arreglo f");
//        int[] f = {2, 4, 7, 6, 3, 1, 8};
//        //mostrar arreglo f
//        mostrarArreglo(f);
//        System.out.println("\n");
//        for (int i = 0; i < f.length; i++) {
//            if (i == 5) {
//                System.out.println("Sexto elemento " + f[i]);
//            }
//        }
//------------------------------------------------------------------------------
//        System.out.println("b) Inicializar con 8 cada uno de los cinco elementos del arreglo entero unidimensional g");
//        int[] g = new int[5];
//        for (int i = 0; i < g.length; i++) {
//            g[i] = 8;
//        }
//        //mostrar g
//        mostrarArreglo(g);
//------------------------------------------------------------------------------        
//        System.out.println("c) Sumar el total de los 100 elementos del arreglo c de punto flotante.");
//        double[] c = new double[10];
//        //dandole valores al arreglo
//        for (int i = 0; i < c.length; i++) {
//            c[i] = Math.random() * 100;
//        }
//        //mostrar c
//        for (int i = 0; i < c.length; i++) {
//            System.out.printf("%.2f%n",c[i]);
//        }
//
//        double ressuma = 0;
//        for (int i = 0; i < c.length; i++) {
//            ressuma += c[i];
//        }
//        System.out.printf("La suma de los elementos del arreglo es %.2f%n", ressuma);
//------------------------------------------------------------------------------
//        System.out.println("d) Copiar el arreglo a de 11 elementos en la primera porción del arreglo b, el cual contiene 34 elementos");
//        int[] a = new int[11];
//        int[] b = new int[34];
//        int[] ab = new int[a.length + b.length];
//        //dandole valores al arreglo a
//        llenarArreglo(a);
//        mostrarArreglo(a);
//        System.out.println();
//        //dandole valores al arreglo b
//        llenarArreglo(b);
//        mostrarArreglo(b);
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            ab[i] = a[i];
//        }
//        int contador=0;
//        for (int i = a.length; i < ab.length; i++) {
//            ab[i] = b[contador];
//            contador++;
//        }
//        mostrarArreglo(ab);
//------------------------------------------------------------------------------
//        System.out.println("e) Determinar e imprimir los valores menor y mayor contenidos en el arreglo w con 99 elementos de punto flotante");
//        double[] w = new double[10];
//        //dandole valores al arreglo w
//        for (int i = 0; i < w.length; i++) {
//            //numero random del 0 al 10
//            w[i] = Math.random() * 10;
//        }
//        //mostrar w
//        for (int i = 0; i < w.length; i++) {
//            System.out.printf("%.2f%n",w[i]);
//        }
//        //mostrar menor valor y mayor valor
//        double menor = w[0];
//        double mayor = w[0];
//        for (int i = 1; i < w.length; i++) {
//            if (menor > w[i]) {
//                menor = w[i];
//            }
//            if (mayor < w[i]) {
//                mayor = w[i];
//            }
//        }
//        System.out.printf("Menor %.2f%n" , menor);
//        System.out.printf("Mayor %.2f%n" , mayor);
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//        System.out.println("\033[31m Ejercicio 7.9");
        //a) Escriba una instrucción que declare y cree a t.
        int[][] t = new int[2][3];
//        //b) ¿Cuántas filas tiene t?
//        System.out.println("El arreglo t tiene " + t.length + " filas");
//        //c) ¿Cuántas columnas tiene t?
//        System.out.println("El arreglo t tiene " + t[0].length + " columnas");
        //d) ¿Cuántos elementos tiene t?
        int elementos = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                elementos++;
            }
        }
//        System.out.println("El arreglo t tiene " + elementos + " elementos");
//        //e) Escriba expresiones de acceso para todos los elementos en la fila 1 de t.
//        t[0][0] = 0;
//        t[0][1] = 1;
//        t[0][2] = 1;
//        //f) Escriba expresiones de acceso para todos los elementos en la columna 2 de t.
//        t[0][1] = 2;
//        t[1][1] = 3;
//        //g) Escriba una sola instrucción que asigne cero al elemento de t en la fila 0 y la columna 1.
//        //t[0][1] = 0;
//        //h) Escriba una serie de instrucciones que inicialice cada elemento de t con cero. No utilice una instrucción de repetición.
//        t[0][0] = 0;
//        t[0][1] = 0;
//        t[0][2] = 0;//primera fila...lo demas es algo tedioso
//        //i) Escriba una instrucción for anidada que inicialice cada elemento de t con cero.
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                t[i][j] = 0;
//            }
//        }
        //j) Escriba una instrucción for anidada que reciba como entrada del usuario los valores de los elementos de t.
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                System.out.println("Quedan " + elementos + " posiciones del arreglo por completar");
//                t[i][j] = (int) (teclado.nextInt());
//                elementos--;
//            }
//
//        }
//        System.out.println("Arreglo completado!!!");
//        //k) Escriba una serie de instrucciones que determine e imprima el valor más pequeño en t.
//        int minimo = t[0][0];
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                if (minimo > t[i][j]) {
//                    minimo = t[i][j];
//                }
//            }
//        }
//        System.out.println("Valor mas pequeño " + minimo);
//        //l) Escriba una instrucción printf que muestre los elementos de la primera fila de t. No utilice repetición.
//        System.out.printf("Primera fila de t: %d %d %d", t[0][0], t[0][1], t[0][2]);
//        System.out.println();
//        //m) Escriba una instrucción que totalice los elementos de la tercera columna de t. No utilice repetición.
//        System.out.printf("Suma de la 3ra columna de t: %d", t[0][2] + t[1][2]);
//        System.out.println();

        /*n) Escriba una serie de instrucciones para imprimir el contenido de t en formato tabular. Enliste los índices de
columna como encabezados a lo largo de la parte superior, y enliste los índices de fila a la izquierda de cada fila.*/
//        System.out.print("|-----------------------|");
//        for (int i = 0; i < t.length; i++) {
//            System.out.println();
//            for (int j = 0; j < t[i].length; j++) {
//                System.out.printf("     %d", t[i][j]);
//            }
//        }
//        System.out.println();
//        System.out.print("|-----------------------|");
//------------------------------------------------------------------------------
//        System.out.println("\n");
    }
}
