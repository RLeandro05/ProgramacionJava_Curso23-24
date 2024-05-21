package org.velazquez.U8.XML.Tarea3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ArbolDOMPersonas {
    private Document documento; // Documento XML que se manipulará

    // Constructor que carga el archivo XML
    public ArbolDOMPersonas(String nombreFichero) {
        try {
            File archivo = new File(nombreFichero); // Se referencia al archivo XML
            if (!archivo.exists()) {
                throw new IOException("El archivo " + nombreFichero + " no se encuentra."); // Lanza excepción si el archivo no existe
            }
            // Creación de las fábricas y constructores para analizar el archivo XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // Parsear el archivo XML y normalizar el documento
            documento = dBuilder.parse(archivo);
            documento.getDocumentElement().normalize();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            documento = null; // Si ocurre un error, el documento se establece como null
        }
    }

    // Método para imprimir el contenido del documento XML
    public void parse() {
        if (documento == null) {
            System.out.println("El documento no ha sido cargado correctamente.");
            return;
        }
        try {
            // Preparación de la transformación para imprimir el documento en formato legible
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Propiedad para indentar el output

            DOMSource dom = new DOMSource(documento);
            StreamResult streamResult = new StreamResult(System.out); // Resultado se enviará a la consola

            transformer.transform(dom, streamResult); // Transformación del documento a un stream legible
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    // Método para incrementar la edad de una persona específica en el documento XML
    public void incrementarEdadPersona(Personas persona) {
        if (documento == null) {
            System.out.println("El documento no ha sido cargado correctamente.");
            return;
        }
        // Obtener la lista de nodos que tengan el tag "persona"
        NodeList nodeList = documento.getElementsByTagName("persona");
        boolean personaEncontrada = false;
        // Iterar sobre cada nodo para encontrar la persona con el nombre especificado
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodo = nodeList.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) { // Verificar que sea un nodo de tipo ELEMENT
                Element elemento = (Element) nodo;
                // Comparar el nombre de la persona
                if (elemento.getElementsByTagName("nombre").item(0).getTextContent().equals(persona.getNombre())) {
                    // Obtener y actualizar el elemento de la edad
                    Element edadElement = (Element) elemento.getElementsByTagName("edad").item(0);
                    int nuevaEdad = Integer.parseInt(edadElement.getTextContent()) + 1; // Incrementar la edad
                    edadElement.setTextContent(String.valueOf(nuevaEdad)); // Establecer el nuevo valor de la edad
                    personaEncontrada = true;
                    break; // Salir del bucle una vez encontrada la persona
                }
            }
        }
        if (!personaEncontrada) {
            System.out.println("La persona con nombre " + persona.getNombre() + " no fue encontrada.");
        }
    }

    // Método para guardar el documento XML en un archivo
    public void guardarDocumento(String nombreFichero) {
        if (documento == null) {
            System.out.println("El documento no ha sido cargado correctamente.");
            return;
        }
        try {
            // Preparación de la transformación para guardar el documento en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Propiedad para indentar el output

            DOMSource dom = new DOMSource(documento);
            StreamResult streamResult = new StreamResult(new File(nombreFichero)); // Resultado se enviará a un archivo

            transformer.transform(dom, streamResult); // Transformación y guardado del documento

            System.out.println("Documento guardado correctamente.");
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}