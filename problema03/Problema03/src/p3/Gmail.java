
package p3;

/**
 *
 * @author andreflores
 */
public class Gmail implements Dominio{
    
    private String correo;

    @Override
    public void establecerDominio(String g) {
        correo = String.format("%s@gmail.com", g);
    }

    @Override
    public String obtenerDominio() {
        return correo;
    }
}
