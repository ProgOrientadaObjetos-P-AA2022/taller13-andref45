package p3;

/**
 *
 * @author andreflores
 */
public class Utpl implements Dominio {

    private String correo;

    @Override
    public void establecerDominio(String g) {
        correo = String.format("%s@utpl.edu.ec", g);
    }

    @Override
    public String obtenerDominio() {
        return correo;
    }

}
