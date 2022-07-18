
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        Gmail gmail = new Gmail();
        gmail.establecerDominio(e.obtenerUserName());
        
        Outlook outlook = new Outlook();
        outlook.establecerDominio(e.obtenerUserName());
        
        Yahoo yahoo = new Yahoo();
        yahoo.establecerDominio(e.obtenerUserName());
        
        Utpl utpl = new Utpl();
        utpl.establecerDominio(e.obtenerUserName());
        
        Gobierno gob = new Gobierno();
        gob.establecerDominio(e.obtenerUserName());
        
        
        Correo c = new Correo();
        c.establecerUserName(e.obtenerUserName());
        c.establecerDominio(gmail);
        c.establecerCorreo();
        
        Correo c2 = new Correo();
        c2.establecerDominio(outlook);
        c2.establecerCorreo();
        c2.establecerUserName(e.obtenerUserName());
        
        Correo c3 = new Correo();
        c3.establecerDominio(yahoo);
        c3.establecerCorreo();
        c3.establecerUserName(e.obtenerUserName());
        
        Correo c4 = new Correo();
        c4.establecerDominio(utpl);
        c4.establecerCorreo();
        c4.establecerUserName(e.obtenerUserName());
        
        Correo c5 = new Correo();
        c5.establecerDominio(gob);
        c5.establecerCorreo();
        c5.establecerUserName(e.obtenerUserName());
        
        
        lista.add(c);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
