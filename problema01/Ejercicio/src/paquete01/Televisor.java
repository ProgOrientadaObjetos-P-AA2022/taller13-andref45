package paquete01;
/**
 *
 * @author reroes
 */
public class Televisor {

    private String marca;
    private double precio;

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecio(double m) {
        precio = m;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return String.format("TV:%s\t%s",
                obtenerMarca(),
                obtenerPrecio());
    }
}
