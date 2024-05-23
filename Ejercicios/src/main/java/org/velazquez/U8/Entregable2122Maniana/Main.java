package org.velazquez.U8.Entregable2122Maniana;

import org.velazquez.U8.XML.Tarea3.DOMModificado;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String url = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\Entregable2122Maniana\\alumnos.xml";

        String dni = "";
        String nombre = "";
        String apellido = "";
        String direccion = "";


        List<Alumno> listaAlumnos = new ArrayList<>();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document documento = db.parse(url);

            Element raiz = documento.getDocumentElement();

            NodeList listaNodosHijos = raiz.getChildNodes();

            for (int i = 0; i < listaNodosHijos.getLength(); i++) {
                Node nodoHijo = listaNodosHijos.item(i);

                if (nodoHijo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoHijo = (Element) nodoHijo;

                    NamedNodeMap listaAtributosHijo = elementoHijo.getAttributes();

                    for (int j = 0; j < listaAtributosHijo.getLength(); j++) {
                        dni = listaAtributosHijo.item(j).getNodeValue();
                    }

                    NodeList listaNietos = elementoHijo.getChildNodes();

                    for (int j = 0; j < listaNietos.getLength(); j++) {
                        Node nodoNieto = listaNietos.item(j);

                        if (nodoNieto.getNodeType() == Node.ELEMENT_NODE) {
                            Element elementoNieto = (Element) nodoNieto;

                            if (elementoNieto.getTagName().equals("nombre")) {
                                nombre = elementoNieto.getTextContent();
                            }
                            if (elementoNieto.getTagName().equals("apellido")) {
                                apellido = elementoNieto.getTextContent();
                            }
                            if (elementoNieto.getTagName().equals("direccion")) {
                                direccion = elementoNieto.getTextContent();
                            }
                        }
                    }

                    Alumno alumno = new Alumno(dni, nombre, apellido, direccion);

                    listaAlumnos.add(alumno);
                }
            }


        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lista de alumnos: ");
        System.out.println(listaAlumnos);

        System.out.println("--------------------------------------------------------");

        listaAlumnos.sort(new OrdenarAlumnosPorDNI());
        System.out.println("Lista de alumnos ordenados por dni: ");
        System.out.println(listaAlumnos);

        //-------------------------------------------------------------

        DOMModificado dom = new DOMModificado();

        System.out.println("--------------------------------------------------------");

        dom.crearNuevoXML(listaAlumnos);
    }
}
