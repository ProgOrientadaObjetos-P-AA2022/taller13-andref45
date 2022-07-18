package p3;

/**
 *
 * @author andreflores
 */
public class Gobierno implements Dominio {

    private String correo;

    @Override
    public void establecerDominio(String g) {
        correo = String.format("%s@gob.ec.gob", g);
    }

    @Override
    public String obtenerDominio() {
        return correo;
    }

}
