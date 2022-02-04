package javaapplication2;

import java.util.*;

/**
 *
 * @author JARO
 */
public class Matrix {

    public static void main(String[] args) {
        sumatoriaMatrix();
    }

    static void llenarMatrix(int[][] a, int desde, int hasta) {
        int aux = hasta - 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * aux + desde);
            }
        }
    }

    static void mostrarMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("");
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]);
            }
        }
        System.out.println("");
    }

    static int sumRow(int[][] m, int row) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma += m[row][j];
            }
            break;
        }
        return suma;
    }

    static int sumCol(int[][] m, int col) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][col];
            }
            break;
        }
        return suma;
    }

    static void sumatoriaMatrix() {
        int[][] m = new int[2][3];
        llenarMatrix(m, 0, 9);
        mostrarMatrix(m);
        System.out.printf("Suma fila 1 (%d)\nSuma fila 2 (%d)\n", sumRow(m, 0), sumRow(m, 1));
        System.out.printf("Suma columna 1 (%d)\nSuma columna 2 (%d)\nSuma columna 3 (%d)\n", sumCol(m, 0), sumCol(m, 1), sumCol(m, 2));
    }
}
