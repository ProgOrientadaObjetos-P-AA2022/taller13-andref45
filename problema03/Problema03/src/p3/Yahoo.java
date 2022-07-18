package p3;

/**
 *
 * @author andreflores
 */
public class Yahoo implements Dominio {

    private String correo;

    @Override
    public void establecerDominio(String g) {
        correo = String.format("%s@yahoo.com", g);
    }

    @Override
    public String obtenerDominio() {
        return correo;
    }
}
