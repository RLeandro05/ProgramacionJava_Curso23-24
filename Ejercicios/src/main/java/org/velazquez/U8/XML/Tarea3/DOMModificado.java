package org.velazquez.U8.XML.Tarea3;

import org.velazquez.U8.Entregable2122Maniana.Alumno;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.util.List;

public class DOMModificado {
    Document documento;
    public DOMModificado() {
    }

    public void crearNuevoXML (List<Alumno> listaALumnos) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            documento = db.newDocument();

            Element raiz = documento.createElement("personas");
            documento.appendChild(raiz);

            Element persona = documento.createElement("persona");
            raiz.appendChild(persona);

            Attr atributoPersona = documento.createAttribute("dni");
            atributoPersona.setValue("8888888X");
            persona.setAttributeNode(atributoPersona);

            Element nombrePersona = documento.createElement("nombre");
            persona.appendChild(nombrePersona);
            nombrePersona.appendChild(documento.createTextNode("Luis"));

            Element apellidoPersona = documento.createElement("apellido");
            persona.appendChild(apellidoPersona);
            apellidoPersona.appendChild(documento.createTextNode("Ruiz"));

            Element direccionPersona = documento.createElement("direccion");
            persona.appendChild(direccionPersona);
            direccionPersona.appendChild(documento.createTextNode("Alli"));

            Element institutoPersona = documento.createElement("instituto");
            persona.appendChild(institutoPersona);
            institutoPersona.appendChild(documento.createTextNode("IES VELAZQUEZ"));

            for (Alumno alumno : listaALumnos) {
                persona = documento.createElement("persona");
                raiz.appendChild(persona);

                atributoPersona = documento.createAttribute("dni");
                atributoPersona.setValue(alumno.getDniAlumno());
                persona.setAttributeNode(atributoPersona);

                nombrePersona = documento.createElement("nombre");
                persona.appendChild(nombrePersona);
                nombrePersona.appendChild(documento.createTextNode(alumno.getNombreAlumno()));

                apellidoPersona = documento.createElement("apellido");
                persona.appendChild(apellidoPersona);
                apellidoPersona.appendChild(documento.createTextNode(alumno.getApellidoAlumno()));

                direccionPersona = documento.createElement("direccion");
                persona.appendChild(direccionPersona);
                direccionPersona.appendChild(documento.createTextNode(alumno.getDireccionAlumno()));

                institutoPersona = documento.createElement("instituto");
                persona.appendChild(institutoPersona);
                institutoPersona.appendChild(documento.createTextNode("IES VELAZQUEZ"));
            }

            TransformerFactory trf = TransformerFactory.newInstance();
            Transformer tr = trf.newTransformer();

            DOMSource dom = new DOMSource(documento);
            StreamResult sr = new StreamResult("C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\Entregable2122Maniana\\alumnos_modificado.xml");

            tr.transform(dom, sr);

            System.out.println("Archivo 'alumnos_modificado.xml' creado correctamente.");

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
