package p3;

/**
 *
 * @author andreflores
 */
public class Outlook implements Dominio {

    private String correo;

    @Override
    public void establecerDominio(String g) {
        correo = String.format("%s@outlook.com", g);
    }

    @Override
    public String obtenerDominio() {
        return correo;
    }

}
