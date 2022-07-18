
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela  extends Matricula {

    @Override
    public void establecerTarifa(){
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }
    @Override
    public String toString() {
        String cadena = String.format("Escuela - Tarifa: %.2f",
                obtenerTarifa());
        return cadena;
    }
}
