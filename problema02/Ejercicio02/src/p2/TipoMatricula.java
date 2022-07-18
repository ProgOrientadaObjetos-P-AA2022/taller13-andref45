package p2;

import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> c) {
        matriculas = c;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();

    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Listado de Matrículas:\n");
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            cadena = String.format("%s%s\n", cadena, 
                    obtenerMatriculas().get(i));
        }
        cadena = String.format("%sPromedio de matriculas: %.2f\n", 
                cadena, obtenerPromedioMatriculas());
                
        return cadena;
    }
}
