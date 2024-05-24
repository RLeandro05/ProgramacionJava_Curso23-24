package org.velazquez.U8.Ligero_Picon_U8_Entregable;

import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessPosts {
    Document documento;

    public ProcessPosts() {
    }

    public void parseDOM(String filename) { // Método para cargar el xml en memoria

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            documento = db.parse(filename); // Cargar documento

            documento.getDocumentElement().normalize(); // Normalizar

            System.out.println("Fichero xml parseado correctamente.");
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e.getMessage());
        }

    }
    public void addPost(Post post) {

        Node raiz = documento.getDocumentElement();

        Element nuevoPost = documento.createElement("post");
        raiz.appendChild(nuevoPost);

        Element titulo = documento.createElement("titulo");
        nuevoPost.appendChild(titulo);
        titulo.setTextContent(post.getTitle());

        Element link = documento.createElement("link");
        nuevoPost.appendChild(link);
        link.setTextContent(post.getLink());

        Element description = documento.createElement("description");
        nuevoPost.appendChild(description);
        description.setTextContent(post.getDescription());

        Element pubDate = documento.createElement("pubDate");
        nuevoPost.appendChild(pubDate);
        pubDate.setTextContent(post.getPubdate());

        Element guid = documento.createElement("guid");
        nuevoPost.appendChild(guid);
        guid.setTextContent(post.getListGuids());
        guid.setAttribute("isPermaLink", "true");

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tf.newTransformer();
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        }

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

        DOMSource origenDOM = new DOMSource(raiz);

        File postsXML =
                new File("C:\\Users\\DAW_M\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\Ligero_Picon_U8_Entregable\\posts.xml");
        StreamResult destino = new StreamResult(postsXML);

        try {
            transformer.transform(origenDOM, destino);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Con exito");


    }
    public List<Post> getPosts() {
        List<Post> listaPosts = new ArrayList<>();

        String title ="";
        String link = "";
        String description = "";
        String pubdate = "";
        String guid = "";

        Element raiz = documento.getDocumentElement();

        NodeList listaNodosHijos = raiz.getChildNodes();

        for (int i = 0; i < listaNodosHijos.getLength(); i++) {
            Node nodoHijo = listaNodosHijos.item(i);

            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE) {
                Element elementoHijo = (Element) nodoHijo;

                NodeList listaNodosNietos = elementoHijo.getChildNodes();

                for (int j = 0; j < listaNodosNietos.getLength(); j++) {
                    Node nodoNieto = listaNodosNietos.item(j);

                    if (nodoNieto.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementoNieto = (Element) nodoNieto;

                        switch (elementoNieto.getTagName()) {
                            case "title":
                                title = elementoNieto.getTextContent();
                                break;
                            case "link":
                                link = elementoNieto.getTextContent();
                                break;
                            case "description":
                                description = elementoNieto.getTextContent();
                                break;
                            case "pubDate":
                                pubdate = elementoNieto.getTextContent();
                                break;
                            case "guid":
                                guid = elementoNieto.getTextContent();
                        }
                    }
                }

                Post post = new Post(title, link, description, pubdate, guid);

                listaPosts.add(post);
            }
        }

        System.out.println("Lista de posts del fichero xml: ");

        return listaPosts;

    }
    public String convertToJSON() {
        String url = "C:\\Users\\DAW_M\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8\\Ligero_Picon_U8_Entregable\\posts.json";
        Gson gson = new Gson();

        String jsonPosts = gson.toJson(getPosts());

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(url));

            escritor.write(jsonPosts);

            escritor.close();

            System.out.println("CRREADO ARCHIVO .JSON");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------");

        return jsonPosts;

    }
}
