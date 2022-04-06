package jaro.poo;

import java.util.Scanner;

/**
 *
 * @author JARO
 */
public class Uso_Vehiculo {

    public static void main(String[] args) {
//        Coche renault = new Coche();
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("El coche tiene %d ruedas y ", renault.getRuedas());
//        System.out.printf("su peso es de %d \n", renault.getPeso());
//        System.out.print("Escriba el color del coche a continuación: ");
//        String nuevo_color = sc.nextLine();
//        renault.setColor(nuevo_color);
//        System.out.printf("El nuevo color del coche es %s\n", renault.getColor());
//        System.out.println(renault.infoCoche());
//        System.out.print("Desea instalarle asientos de cueros al coche?: ");
//        String es_cuero=sc.nextLine();
//        renault.setAsientos_cuero(es_cuero);
//        System.out.println(renault.isAsientos_cuero());

        Coche ford = new Coche();
        ford.setColor("rojo");
        System.out.println(ford.infoCoche());

        Furgoneta furgo = new Furgoneta(450, 7);
        furgo.setColor("azul");
        System.out.println(furgo.infoCoche() + " " + furgo.infoFurgoneta());
    }
}
