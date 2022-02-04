package poo;

/**
 *
 * @author JARO
 */
public class Furgoneta extends Coche {

    private int capacidad_carga, plazas_extras;

    public Furgoneta(int capacidad_carga, int plazas_extras) {
        super();//llama al constructor de la clase padre
        this.capacidad_carga = capacidad_carga;
        this.plazas_extras = plazas_extras;
    }

    public String infoFurgoneta() {
        return "Capacidad de carga " + capacidad_carga + " y plazas extras " + plazas_extras;
    }
}
