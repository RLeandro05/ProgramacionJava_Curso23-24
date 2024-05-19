package org.velazquez.U8.XML.Tarea1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseadorDOMPersonas {

    public static void parse(String nomFile) {
        Scanner sc = new Scanner(System.in);

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(nomFile));

            System.out.println("Escriba una etiqueta y verás cuántas hay: ");
            String etiqueta = sc.next();

            NodeList listaNodos = doc.getElementsByTagName(etiqueta);

            while (listaNodos.getLength() == 0) {
                System.out.println("Parece que no hay etiquetas con el nombre '"+etiqueta+"'.");
                System.out.println("Escriba otra: ");
                etiqueta = sc.next();
            }

            System.out.println("Al parecer, esta etiqueta está presente un número de '"+listaNodos.getLength()+"' veces.");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
