package org.velazquez.U8.XML.Entregable1920;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {
    private Document documento;
    public RecorridoDOM(String nombreFichero) {
        try {
            File archivo = new File(nombreFichero); // Se referencia al archivo XML
            if (!archivo.exists()) {
                throw new IOException("El archivo " + nombreFichero + " no se encuentra."); // Lanza excepción si el archivo no existe
            }
            // Creación de las fábricas y constructores para analizar el archivo XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // Parsear el archivo XML y normalizar el documento
            documento = (Document) dBuilder.parse(archivo);
            documento.getDocumentElement().normalize();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public void numNodosHijos() {
        Element raiz = documento.getDocumentElement();

        NodeList listaNodos = raiz.getChildNodes();

        System.out.println("Hay " +listaNodos.getLength()+ " nodos hijos.");

        System.out.println("------------------------------------------------");

        for (int i = 0; i < listaNodos.getLength(); i++) {
            Node nodo = listaNodos.item(i);

            switch (nodo.getNodeType()) {
                case Node.ELEMENT_NODE:
                    Element elemento = (Element) listaNodos.item(i);
                    System.out.println("El hijo '" +elemento.getTagName()+ "' es un elemento.");
                    break;
                case Node.TEXT_NODE:
                    Text texto = (Text) listaNodos.item(i);
                    System.out.println("El hijo '" +texto.getWholeText()+ "' es un texto.");
                    break;
                case Node.COMMENT_NODE:
                    Comment comentario = (Comment) listaNodos.item(i);
                    System.out.println("El hijo '" +comentario.getTextContent()+ "' es un comentario.");
                    break;
            }
        }
    }
    public void mostrarXMLDom() {
        Element raiz = documento.getDocumentElement();

        NodeList listaNodosHijos = raiz.getChildNodes();

        for (int i = 0; i < listaNodosHijos.getLength(); i++) {
            Node nodoHijo = listaNodosHijos.item(i);

            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE) {
                Element elementoHijo = (Element) nodoHijo;

                System.out.println("Elemento '"+elementoHijo.getTagName()+"'");

                if (elementoHijo.hasChildNodes()) {

                    NamedNodeMap listaAtributosHijos = elementoHijo.getAttributes();

                    for (int j = 0; j < listaAtributosHijos.getLength(); j++) {
                        System.out.println("Atributo: "+listaAtributosHijos.item(j).getNodeName());
                        System.out.println("Valor: "+listaAtributosHijos.item(j).getNodeValue());
                    }

                    NodeList listaContenidoHijos = elementoHijo.getChildNodes();

                    for (int j = 0; j < listaContenidoHijos.getLength(); j++) {
                        Node nodoContenidoHijo = listaContenidoHijos.item(j);

                        switch (nodoContenidoHijo.getNodeType()) {
                            case Node.ELEMENT_NODE:
                                Element elemento = (Element) listaContenidoHijos.item(j);
                                System.out.println("Contiene el elemento: "+elemento.getTagName());
                                break;
                            case Node.TEXT_NODE:
                                Text texto = (Text) listaContenidoHijos.item(j);
                                System.out.println("Contiene el texto: "+texto.getWholeText());
                                break;
                            case Node.COMMENT_NODE:
                                Comment comentario = (Comment) listaContenidoHijos.item(j);
                                System.out.println("Contiene el comentario: "+comentario.getTextContent());
                                break;
                        }

                    }
                }

                System.out.println("------------------------------------------------");
            }
        }
    }
    public void mostrarContenidoEtiqueta(String s) {

        NodeList listaNodosHijos = documento.getElementsByTagName(s);

        if (listaNodosHijos.getLength() > 0) {
            System.out.println("Hay '"+listaNodosHijos.getLength()+"' ocurrencias con la etiqueta '"+s+"'.");
            System.out.println();

            for (int i = 0; i < listaNodosHijos.getLength(); i++) {
                Node nodoHijo = listaNodosHijos.item(i);

                if (nodoHijo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoHijo = (Element) nodoHijo;

                    System.out.println("Elemento '"+elementoHijo.getTagName()+"'");

                    if (elementoHijo.hasChildNodes()) {

                        NamedNodeMap listaAtributosHijos = elementoHijo.getAttributes();

                        for (int j = 0; j < listaAtributosHijos.getLength(); j++) {
                            System.out.println("Atributo: "+listaAtributosHijos.item(j).getNodeName());
                            System.out.println("Valor: "+listaAtributosHijos.item(j).getNodeValue());
                        }

                        NodeList listaContenidoHijos = elementoHijo.getChildNodes();

                        for (int j = 0; j < listaContenidoHijos.getLength(); j++) {
                            Node nodoContenidoHijo = listaContenidoHijos.item(j);

                            switch (nodoContenidoHijo.getNodeType()) {
                                case Node.ELEMENT_NODE:
                                    Element elemento = (Element) listaContenidoHijos.item(j);
                                    System.out.println("Contiene el elemento: "+elemento.getTagName());
                                    break;
                                case Node.TEXT_NODE:
                                    Text texto = (Text) listaContenidoHijos.item(j);
                                    System.out.println("Contiene el texto: "+texto.getWholeText());
                                    break;
                                case Node.COMMENT_NODE:
                                    Comment comentario = (Comment) listaContenidoHijos.item(j);
                                    System.out.println("Contiene el comentario: "+comentario.getTextContent());
                                    break;
                            }

                        }
                    }

                    System.out.println("------------------------------------------------");
                }
            }
        } else {
            System.out.println("¡AVISO! No hay ninguna ocurrencia con la etiqueta '"+s+"'.");
        }
    }
}
