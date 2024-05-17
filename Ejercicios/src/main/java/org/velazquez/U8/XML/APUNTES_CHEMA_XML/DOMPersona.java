package org.velazquez.U8.XML.APUNTES_CHEMA_XML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMPersona {
    public static void main(String[] args) {

        try {

            // Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =
                    db.parse(new File("C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\XML\\APUNTES_CHEMA_XML\\personasXML.xml"));

            // Cojo directamente las etiquetas persona
            NodeList nl = doc.getElementsByTagName("persona"); // Lista de nodos que guarda todas las etiquetas con el nombre persona

            System.out.println("En este fichero tengo " + nl.getLength() + " etiquetas persona");

            // Voy a tratar cada una de estas etiquetas persona
            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i); // Iteramos cada nodo de la lista

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nl.item(i);
                    System.out.println("Estoy en una etiqueta: " + e.getTagName());

                    if (e.hasChildNodes()) {

                        System.out.println(
                                "Y esta etiqueta tiene a su vez " + e.getChildNodes().getLength() + " nodos hijos");

                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {

                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Uno de los nodos hijos es la etiqueta " + eHijo.getTagName());
                                System.out.println("Cuyo contenido es: " + eHijo.getTextContent());
                            }
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }

}
