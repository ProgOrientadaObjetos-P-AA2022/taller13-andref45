package p1;

/**
 *
 * @author andreflores
 */
public abstract class Matricula {

    protected double tarifa;

    public abstract void establecerTarifa();

    public double obtenerTarifa() {
        return tarifa;
    }

}
