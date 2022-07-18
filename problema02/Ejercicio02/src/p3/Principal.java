/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.*;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();

        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();

        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();

        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();

        ArrayList<Matricula> matricula = new ArrayList();
        matricula.add(mcamp);
        matricula.add(mcolegio);
        matricula.add(mescuela);
        matricula.add(mjardin);
        matricula.add(mmaternal);

        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerMatriculas(matricula);
        tipos.establecerPromedioMatriculas();
        System.out.printf("Promedio de Tarifas: %.2f\n",
                tipos.obtenerPromedioMatriculas());
    }
}
