package p1;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula {

    @Override
    public void establecerTarifa() {
        tarifa = 100.2 + 30.2 + 90.2;
    }

    @Override
    public String toString() {
        String cadena = String.format("Campamento - Tarifa: %.2f",
                obtenerTarifa());
        return cadena;
    }
}
