package jaro.javaapplication2;

import java.util.*;

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
//        organizarPrimos();
//        destacarMinMax();

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
        System.out.println(Arrays.toString(a));
    }

    static void remplazarValor() {
        int[] arr = new int[10];

        Codigo.llenarArreglo(arr, 1, 20);
        System.out.println(Arrays.toString(arr));

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

        int min = Codigo.getMinMax(a, "minimo");
        int max = Codigo.getMinMax(a, "maximo");

        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {//comparando para mostrar "minimo" al lado del numero menor
                System.out.printf("%d\tMinimo \n", a[i]);
                continue;//continua a la siguiente iteracion
            }
            if (a[i] == max) {//comparando para mostrar "maximo" al lado del numero mayor
                System.out.printf("%d\tMaximo \n", a[i]);
                continue;//continua a la siguiente iteracion
            }
            System.out.printf("%d  \n", a[i]);
        }

    }

    static void organizar(int[] numeros, String tipo) {
        int c1 = 0, c2 = 0, cant1 = 0, cant2 = 0;

        if (tipo.equalsIgnoreCase("par")) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    cant1++;
                } else {
                    cant2++;
                }
            }
        } else if (tipo.equalsIgnoreCase("primo")) {
            for (int i = 0; i < numeros.length; i++) {
                if (Codigo.esPrimo(numeros[i])) {
                    cant1++;
                } else {
                    cant2++;
                }
            }
        }

        int[] aux1 = new int[cant1];
        int[] aux2 = new int[cant2];

        if (tipo.equalsIgnoreCase("par")) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    aux1[c1] = numeros[i];
                    c1++;
                } else {
                    aux2[c2] = numeros[i];
                    c2++;
                }
            }
        } else if (tipo.equalsIgnoreCase("primo")) {
            for (int i = 0; i < numeros.length; i++) {
                if (Codigo.esPrimo(numeros[i])) {
                    aux1[c1] = numeros[i];
                    c1++;
                } else {
                    aux2[c2] = numeros[i];
                    c2++;
                }
            }
        }
        Codigo.miArrayCopy(aux1, aux2);
    }

    static void organizarParImpar() {
        int[] a = new int[10];
        Codigo.llenarArreglo(a, 1, 20);
        System.out.println("Arreglo ORIGINAL");
        System.out.println(Arrays.toString(a));
        System.out.println("Arreglo ordenado PAR-IMPAR");
        organizar(a, "par");
    }

    static void organizarPrimos() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arreglo ORIGINAL");
        System.out.println(Arrays.toString(arr));
        System.out.println("Arreglo ordenado PRIMOS primero");
        organizar(arr, "primo");

    }

    static void destacarMinMax() {
        int[] a = new int[20];

        Codigo.llenarArreglo(a, 1, 20);

        int min = Codigo.getMinMax(a, "minimo");
        int max = Codigo.getMinMax(a, "maximo");

        System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        Scanner sc = new Scanner(System.in);
        int destacar = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (destacar == 1) {
                if (a[i] == min) {//comparando para mostrar "minimo" al lado del numero menor
                    System.out.printf("**%d** ", a[i]);
                    continue;//continua a la siguiente iteracion
                }
            } else {
                if (a[i] == max) {//comparando para mostrar "maximo" al lado del numero mayor
                    System.out.printf("**%d** ", a[i]);
                    continue;//continua a la siguiente iteracion
                }
            }
            System.out.printf("%d ", a[i]);
        }
        System.out.println("");
    }
}
