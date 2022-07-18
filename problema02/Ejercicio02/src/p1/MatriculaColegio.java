package p1;

/**
 *
 * @author reroes
 */
public class MatriculaColegio extends Matricula {

    @Override
    public void establecerTarifa() {
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }

    @Override
    public String toString() {
        String cadena = String.format("Colegio - Tarifa: %.2f",
                obtenerTarifa());
        return cadena;
    }
}
