package jaro.poo;

/**
 *
 * @author JARO
 */
public class Coche {

    private int ruedas, largo, ancho, motor, peso, peso_total;
    private String color;
    private boolean asientos_cuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    public String infoCoche() {
        return "El coche tiene " + ruedas
                + " ruedas, su color es " + color
                + " y tienen un peso base de " + peso + " kg";
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isAsientos_cuero() {
        if (asientos_cuero) {
            return "El coche posee asientos de cuero";
        } else {
            return "El coche NO posee asientos de cuero";
        }
    }

    public void setAsientos_cuero(String asientos_cuero) {
        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String isClimatizador() {
        if (climatizador) {
            return "El coche posee climatizador";
        } else {
            return "El coche NO posee climatizador";
        }
    }

    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

}
