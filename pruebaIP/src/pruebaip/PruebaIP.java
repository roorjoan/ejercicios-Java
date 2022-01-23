package pruebaip;

import java.util.Scanner;

/*José Antonio Rodríguez Ortega*/
public class PruebaIP {

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 5, 6, 8};
        int[][] b = {{3, 2, 5, 2, 4}, {3, 1, 5, 2}};
//        System.out.println(mostrarOrdenModulo(a));
//        System.out.println(retornarElemento(a));
//        System.out.println(mayorNumero(a));
//        System.out.println(mejorNota(b));
//        System.out.println(peorNota(b));
//        System.out.println(promedioNotas(b));
//        System.out.println(cantidadAprobados(b));
//        System.out.println(cantidadDesaprobados(b));
//        System.out.println(seRepite(b, 5));
//        System.out.println(cualSeRepiteMas(b));
//        coordenada(b, 5);
//        System.out.println(getEvaluacion(b, 1, 0));

    }

    static int mostrarOrdenModulo(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de la libreta");
        int n = sc.nextInt();
        int pos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                pos = i;
            }
        }
        return pos + 1;
    }

    static int retornarElemento(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el índice");
        int indice = sc.nextInt();
        int elemento = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i == indice) {
                elemento = numeros[i];
            }
        }
        return elemento;
    }

    static int mayorNumero(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    static int mejorNota(int[][] notas) {
        int nota = notas[0][0];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (nota < notas[i][j]) {
                    nota = notas[i][j];
                }
            }
        }
        return nota;
    }

    static int peorNota(int[][] notas) {
        int nota = notas[0][0];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (nota > notas[i][j]) {
                    nota = notas[i][j];
                }
            }
        }
        return nota;
    }

    static double promedioNotas(int[][] notas) {
        int promedio = 0, suma = 0, contador = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
                contador++;
            }
        }
        promedio = suma / contador;

        return promedio;
    }

    static int cantidadAprobados(int[][] notas) {
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > 2) {
                    aprobados++;
                }
            }
        }

        return aprobados;
    }

    static int cantidadDesaprobados(int[][] notas) {
        int desaprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] <= 2) {
                    desaprobados++;
                }
            }
        }

        return desaprobados;
    }

    static int seRepite(int[][] a, int n) {
        int cant = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (n == a[i][j]) {
                    cant++;
                }
            }
        }
        return cant;
    }

    static int cualSeRepiteMas(int[][] notas) {
        int elquemas = 0, cant = 0, cant1 = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                cant = seRepite(notas, notas[i][j]);
                if (cant1 < cant) {
                    cant1 = cant;
                    elquemas = notas[i][j];
                }
            }
        }

        return elquemas;
    }

    static void coordenada(int[][] notas, int evaluacion) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (evaluacion == notas[i][j]) {
                    System.out.printf("La coordenada es (%d,%d)\n", i, j);
                    break;
                }
            }
        }
    }

    static int getEvaluacion(int[][] notas, int estudiante, int asignatura) {
        return notas[estudiante][asignatura];
    }
}
