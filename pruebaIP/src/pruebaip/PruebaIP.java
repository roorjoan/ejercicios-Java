package pruebaip;

import java.util.Scanner;

/*José Antonio Rodríguez Ortega*/
public class PruebaIP {

    public static void main(String[] args) {

        //se pueden declarar los arreglos dentro de las funciones
        //aqui se pueden llamar las funciones de la siguiente manera
        // nombreDeLaFuncion();
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

    //se pueden declarar todas las funciones de la siguiente manera
    //static void nombreDeLaFuncion(){ aqui va el codigo }
    static int mostrarOrdenModulo(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de la libreta");
        int n = sc.nextInt();//entrada de datos por teclado
        int pos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {//se compara si el numero entrado por teclado es igual al valor del arreglo
                pos = i;//se guarda la posicion del valor buscado
            }
        }
        return pos;//se devuelve la posicion(lo mismo q un System.out.println(pos)  )
    }

    static int retornarElemento(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el índice");
        int indice = sc.nextInt();
        int elemento = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i == indice) {//comparando el indice del arreglo con el indice entrado por teclado
                elemento = numeros[i];//se guarda el valor del arreglo si el indice coincide
            }
        }
        return elemento;//se devuelve el valor del arreglo guardado
    }

    static int mayorNumero(int[] numeros) {//ejercicio de buscar el mayor numero
        int mayor = numeros[0];//guardando la primera posicion del arreglo para luego compararla

        for (int i = 1; i < numeros.length; i++) {//empieza el for en 1 porque ya la primera posicion se analizo
            if (mayor < numeros[i]) {//verificando si la pos actual es mayor q la anterior
                mayor = numeros[i];//se guarda el valor de la pos actual 
            }
        }
        return mayor;//se devuelve el valor
    }

    static int mejorNota(int[][] notas) {//esta funcion es parecida a la anterior //mayorNumero()... pero con arreglos bidimencionales
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

    static int peorNota(int[][] notas) {//esta funcion es la de buscar el menor valor del arreglo
        int nota = notas[0][0];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (nota > notas[i][j]) {//solo cambia la condicion para buscar el menor
                    nota = notas[i][j];
                }
            }
        }
        return nota;
    }

    static double promedioNotas(int[][] notas) {
        int promedio = 0, suma = 0, contador = 0;//declarando las variables

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];//se van sumando los valores en cada vuelta del ciclo y se guarda en la variable suma
                contador++;//incremento del contador para saber el total de elementos del arreglo para sacar el promedio
            }
        }
        promedio = suma / contador;//calculo del promedio

        return promedio;
    }

    static int cantidadAprobados(int[][] notas) {
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > 2) {//se verifica si la nota en la pos es mayor q 2, si es verdadero entonces esta aprobado
                    aprobados++;//se incrementa la variable aprobados
                }
            }
        }

        return aprobados;
    }

    static int cantidadDesaprobados(int[][] notas) {//parecido al anterior solo cambia la condicion
        int desaprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] <= 2) {//si es menor o igual q 2 esta desaprobado
                    desaprobados++;
                }
            }
        }

        return desaprobados;
    }

    static int seRepite(int[][] a, int n) {//es necesario pasar el numero n por parametro en la funcion
        int cant = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (n == a[i][j]) {//se verifica si el numero n es igual q el valor del arreglo en i,j
                    cant++;//incremento, para saber cuantas veces se repite ese valor
                }
            }
        }
        return cant;//es necesario q se devuelva el valor con el return
    }

    static int cualSeRepiteMas(int[][] notas) {
        int elquemas = 0, cant = 0, cant1 = 0;//declarando las variables

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                cant = seRepite(notas, notas[i][j]);//se llama a la funcion seRepite(n) para obtener la cantidad de veces
                //que se repite el numero de la pos i,j
                if (cant1 < cant) {//se compara para saber si el numero de la pos actual se repite mas veces q el siguiente valor
                    cant1 = cant;//si es mayor se guarda la cantidad de veces que se repite para comparar el la siguiente vuelta
                    elquemas = notas[i][j];//se guarda el numero de la pos actual
                }
            }
        }

        return elquemas;
    }

    static void coordenada(int[][] notas, int evaluacion) {//se debe entrar por parametro la evaluacion
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (evaluacion == notas[i][j]) {//buscar si la evaluacion pasada por parametro es igual a la evaluacion de la pos i,j
                    System.out.printf("La coordenada es (%d,%d)\n", i, j);//se muestra la evaluacion de la pos actual
                    break;//intruccion para romper el ciclo una vez q se encuentre la evaluacion
                }
            }
        }
    }

    static int getEvaluacion(int[][] notas, int estudiante, int asignatura) {//entrada por parametro de los valores estudiante y asignatura
        return notas[estudiante][asignatura];//se muestra el valor de la matrix en i=estudiante y j=asignatura
    }
}
