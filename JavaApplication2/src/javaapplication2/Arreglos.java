package javaapplication2;

import java.util.Scanner;

/**
 * Ejercicios sobre Arreglos
 *
 * @author JARO
 */
public class Arreglos {

    public static void main(String[] args) {
//        potenciarNumeros();
//        rotarArreglo();
//        remplazarValor();
//        maxMin();
//        organizarParImpar();
    }

    static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void mostrarArreglo(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void potenciarNumeros() {
        int[] numero = new int[10];
        int[] cuadrado = new int[10];
        int[] cubo = new int[10];

        double exp2 = 2;
        double exp3 = 3;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10); //llenar arreglo numeros con valores aleatorios entre 0 y 100
            double base = numero[i];
            cuadrado[i] = (int) Math.pow(base, exp2);//se calcula el cuadrado del numero
            cubo[i] = (int) Math.pow(base, exp3);//se calcula el cubo del numero
        }

        //mostrar los valores
        System.out.println("numero\tcuadrado\tcubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%d\t%d\t\t%d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }

    static void rotarArreglo() {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escriba %d números para completar el arreglo\n", a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int ultimo = a[a.length - 1];//se guarda la ultima pos(4)
        for (int i = a.length - 1; i > 0; i--) {//recorrido inverso
            a[i] = a[i - 1];
        }
        a[0] = ultimo;
        mostrarArreglo(a);
    }

    static void remplazarValor() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);//llenar el arreglo con numeros aleatorios 0-20
        }

        mostrarArreglo(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es el numero que desea cambiar? :");
        int n1 = sc.nextInt();
        System.out.print("Cual es el nuevo valor? :");
        int n2 = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n1) {
                arr[i] = n2;
                System.out.printf("'%d' ", arr[i]);
            } else {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println("");
    }

    static void maxMin() {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();//llenando el arreglo con valores entrados por el teclado
        }

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

        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {//comparando para mostrar "minimo" al lado del numero menor
                System.out.printf("%d  Minimo \n", a[i]);
                continue;//continua a la siguiente iteracion
            }
            if (a[i] == max) {//comparando para mostrar "maximo" al lado del numero mayor
                System.out.printf("%d  Maximo \n", a[i]);
                continue;//continua a la siguiente iteracion
            }
            System.out.printf("%d  \n", a[i]);
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
        mostrarArreglo(ab);
    }

    static void organizarParImpar() {
        int[] numeros = new int[20];
        int c1 = 0, c2 = 0, cantPares = 0, cantImp = 0;

        //llenar el arreglo y contar los pares e impares
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
            if (numeros[i] % 2 == 0) {
                cantPares++;
            } else {
                cantImp++;
            }
        }
        int[] pares = new int[cantPares];
        int[] impares = new int[cantImp];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[c1] = numeros[i];//asignar los valores pares al arreglo pares
                c1++;
            } else {
                impares[c2] = numeros[i];//asignar los valores impares al arreglo impares
                c2++;
            }
        }
        System.out.println("Arreglo ALEATORIO original");
        mostrarArreglo(numeros);
        System.out.println("Arreglo PARES");
        mostrarArreglo(pares);
        System.out.println("Arreglo IMPARES");
        mostrarArreglo(impares);
        System.out.println("Unión de arreglos PARES-IMPARES");
        unirArreglos(pares, impares);
    }

    static void torosVacas() {
        int[] secreto = new int[4];
        int[] numero = new int[4];
        Scanner sc = new Scanner(System.in);
        int intentos, pos;

    }
}
