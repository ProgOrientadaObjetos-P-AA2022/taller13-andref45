
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends Matricula {

    @Override
    public void establecerTarifa() {
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }
    @Override
    public String toString() {
        String cadena = String.format("Jardin - Tarifa: %.2f",
                obtenerTarifa());
        return cadena;
    }
}
