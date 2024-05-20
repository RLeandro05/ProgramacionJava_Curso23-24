package org.velazquez.U8.XML.Tarea2;

import java.io.*;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class OperacionesconPersonas implements Serializable {

    String listaPersonasDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\XML\\Tarea2\\listaPersonas.xml";

    String FichPersonaDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\XML\\Tarea2\\FichPersona.dat";

    public OperacionesconPersonas() {
    }

    public void almacenarPersonas(List<Persona> listaPersonas) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(FichPersonaDAT));

            escritor.writeObject(listaPersonas);

            escritor.close();

            System.out.println("Lista de personas añadida correctamente");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }

    public void crearXML () {

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(FichPersonaDAT));

            List<Persona> listaPersonas = (List<Persona>) lector.readObject();

            lector.close();

            System.out.println("Lista de personas cargadas desde el fichero 'FichPersonas.dat'.");

            System.out.println("---------------------------------------------------");

            System.out.println("Pasamos a crear el fichero XML...");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); // Creamos una nuevca instancia desde el Document Builder Factory
            DocumentBuilder db = dbf.newDocumentBuilder(); // Lo añadimos a un Document Builder

            Document doc = db.newDocument(); // Creamos un documento que será el nuevo XML

            // Pasamos a crear la estructura del XML

            Element raiz = doc.createElement("personas"); // Creamos una etiqueta raiz
            doc.appendChild(raiz); // Metemos la etiqueta raiz como hijo del documento, para así empezar a crear hijos en ella

            for (Persona p : listaPersonas) { // Iteramos cada persona de la lista de personas antes creada
                Element persona = doc.createElement("persona"); // Creamos un elemento hijo de la raiz personas
                raiz.appendChild(persona); // La añadimos

                Element nombrePersona = doc.createElement("nombre");
                persona.appendChild(nombrePersona);
                nombrePersona.appendChild(doc.createTextNode(p.getNombre())); // Si queremos añadir texto en la etiqueta, le añadimos un  nodo de texto llamando al método Get de cada atributo de la persona

                Element edadPersona = doc.createElement("edad");
                persona.appendChild(edadPersona);
                edadPersona.appendChild(doc.createTextNode(String.valueOf(p.getEdad())));
            }

            // Haremos pasos parecidos con el transformer al igual que con el DocumentBuilderFactory
            TransformerFactory tff = TransformerFactory.newInstance(); // Creamos una nueva instancia de TransformerFactory
            Transformer tf = tff.newTransformer(); // Creamos un nuevo Transformer

            DOMSource dom = new DOMSource(doc); // Creamos un DOMSource en el que añadimos el documento en el que hemos estado trabajando
            StreamResult sr = new StreamResult(new File(listaPersonasDAT)); // Creamos un StreamReuslt en el que añadimos el nombre del nuevo archivo que crearemos

            tf.transform(dom, sr); // Con el transformer, transformamos el dom y el StreamResult, creando el fichero XML que queremos

            System.out.println("Archivo XML con nombre 'listaPersonas.xml' creado correctamente con la lista de personas.");


        } catch (IOException | ClassNotFoundException | ParserConfigurationException | TransformerException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
}
