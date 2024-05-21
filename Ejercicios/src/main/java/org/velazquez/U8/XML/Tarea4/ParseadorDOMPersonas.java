package org.velazquez.U8.XML.Tarea4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
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
                listaNodos = doc.getElementsByTagName(etiqueta);
            }

            System.out.println("Al parecer, esta etiqueta está presente un número de '"+listaNodos.getLength()+"' veces.");

            System.out.println("------------------------------------------------------------------------------");

            System.out.println("Vamos a recorrer las etiquetas con dicho nombre.");

            for (int i = 0; i < listaNodos.getLength(); i++) {
                Node nodo = listaNodos.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) listaNodos.item(i);
                    System.out.println("Este nodo es un elemento '"+elemento.getTagName()+"'.");

                    NamedNodeMap listaAtributos = elemento.getAttributes();

                    if (listaAtributos.getLength() > 0) {
                        System.out.println("¡Sorpresa! Este elemento contiene atributos.");

                        for (int j = 0; j < listaAtributos.getLength(); j++) {
                            Node atributo = listaAtributos.item(j);

                            System.out.println("Atributo: "+atributo.getNodeName());
                            System.out.println("Valor: " +atributo.getNodeValue());
                        }

                    }
                }

                System.out.println("------------------------------------------------------------------------------");
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
