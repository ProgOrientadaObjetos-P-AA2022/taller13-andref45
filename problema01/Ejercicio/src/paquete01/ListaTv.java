package paquete01;

import java.util.ArrayList;

/**
 *
 * @author andreflores
 */
public class ListaTv {

    private ArrayList<Televisor> tvs;
    private double totalP;
    private double tvCaro;
    private String marcas;

    public void establecerTelevisores(ArrayList<Televisor> lista) {
        tvs = lista;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return tvs;
    }

    public void calculartotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < obtenerTelevisores().size(); i++) {
            s = s + obtenerTelevisores().get(i).obtenerPrecio();
        }
        totalP = s;
    }

    public void establecerlistaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < obtenerTelevisores().size(); i++) {
            s = String.format("%s%s\n", s,
                    obtenerTelevisores().get(i).obtenerMarca());
        }
        marcas = s;
    }

    public void calcularTelevisorMasCaro() {
        tvCaro = 0;
        for (int i = 0; i < obtenerTelevisores().size(); i++) {
            if (obtenerTelevisores().get(i).obtenerPrecio() > tvCaro) {
                tvCaro = obtenerTelevisores().get(i).obtenerPrecio();
            }
        }
    }

    public double obtenertotalPrecioTvs() {
        return totalP;
    }

    public String obtenerlistaMarcasVendidas() {
        return marcas;
    }

    public double obtenerTelevisorMasCaro() {
        return tvCaro;
    }

    @Override
    public String toString() {
        String cadena = String.format("Listado de televisores:\n");
        for (int i = 0; i < obtenerTelevisores().size(); i++) {
            cadena = String.format(("%s%s\n"), cadena,
                    obtenerTelevisores().get(i));

        }
        cadena = String.format("%sTotal Precio: %.2f\n"
                + "Precio Televisor más caro: %.2f\n"
                + "Lista de marcas más vendidas: \n%s\n",
                cadena,
                obtenertotalPrecioTvs(),
                obtenerTelevisorMasCaro(),
                obtenerlistaMarcasVendidas());
        return cadena;
    }
}
