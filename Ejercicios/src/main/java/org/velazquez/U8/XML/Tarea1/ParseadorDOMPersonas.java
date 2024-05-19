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
                listaNodos = doc.getElementsByTagName(etiqueta);
            }

            System.out.println("Al parecer, esta etiqueta está presente un número de '"+listaNodos.getLength()+"' veces.");

            System.out.println("------------------------------------------------------------------------------");

            System.out.println("Vamos a recorrer las etiquetas con dicho nombre.");

            for (int i = 0; i < listaNodos.getLength(); i++) {
                Node nodo = listaNodos.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) listaNodos.item(i);
                    System.out.println("Estamos en un elemento, el cual es la etiqueta: '"+elemento.getTagName()+"'.");

                    System.out.println("------------------------------------------------------------------------------");

                    System.out.println("Vamos a ver si tiene elementos hijos...");
                    System.out.println("Escaneando....");

                    NodeList listaHijos = nodo.getChildNodes();

                    if (elemento.hasChildNodes()) {
                        System.out.println("El elemento '"+elemento.getTagName()+"' tiene "+listaHijos.getLength()+" hijos.");
                    }

                    System.out.println("------------------------------------------------------------------------------");

                    if (listaNodos.getLength() > 0) {
                        System.out.println("Veamos uno a uno los elementos hijos de la etiqueta '"+elemento.getTagName()+"'.");

                        for (int j = 0; j < listaHijos.getLength(); j++) {

                            if (listaHijos.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element elementoHijo = (Element) listaHijos.item(j);
                                System.out.println("Nos encontramos con el elemento hijo '"+elementoHijo.getTagName()+"'.");
                                if (elementoHijo.hasChildNodes()) {

                                    NodeList listaHijosHijos = listaHijos.item(j).getChildNodes();

                                    for (int k = 0; k < listaHijosHijos.getLength(); k++) {
                                        if (listaHijosHijos.item(k).getNodeType() == Node.ELEMENT_NODE) {
                                            Element elementoHijoHijo = (Element) listaHijosHijos.item(k);
                                            System.out.println("Tenemos el siguiente elemento de los hijos del elemento '"+elementoHijo.getTagName()+"': '"+elementoHijoHijo.getTagName()+" - "+elementoHijoHijo.getTextContent()+"'");
                                        }
                                    }
                                } else {
                                    System.out.println("Siendo su valor de: '"+elementoHijo.getTextContent()+"'.");
                                }

                                System.out.println("------------------------------------------------------------------------------");
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
