
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaMaternal extends Matricula {

    @Override
    public void establecerTarifa() {
        tarifa = 50.2 + 40.2 + 80.2;
    }
    @Override
    public String toString() {
        String cadena = String.format("Maternal - Tarifa: %.2f",
                obtenerTarifa());
        return cadena;
    }
}
