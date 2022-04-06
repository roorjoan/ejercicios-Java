package jaro.poo;

import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JARO
 */
public class PruebaTemporizador {

    public static void main(String[] args) {
        DameHora oyente = new DameHora();
        Timer mi_temporizador = new Timer(5000, oyente);
        mi_temporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa en el boton para detener");
        System.exit(0);
    }
}

class DameHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Dando la hora cada 5 seg: " + ahora);
    }
}
