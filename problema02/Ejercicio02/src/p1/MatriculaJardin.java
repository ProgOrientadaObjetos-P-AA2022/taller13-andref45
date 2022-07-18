
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

}
