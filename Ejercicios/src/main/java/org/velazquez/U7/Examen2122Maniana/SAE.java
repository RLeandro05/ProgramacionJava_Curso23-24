package org.velazquez.U7.Examen2122Maniana;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SAE implements Serializable{

    String enlaceSAEDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Examen2122Maniana\\sae.dat";
    Map<Integer, Oferta> mapCodigoTOOferta = new HashMap<>();

    public boolean addOferta(Oferta o) {

        if (!mapCodigoTOOferta.containsKey(o.getCodigoOferta())) {
            mapCodigoTOOferta.put(o.getCodigoOferta(), o);
            System.out.println("Oferta con código '"+o.getCodigoOferta()+"' añadida correctamente.");

            return true;
        } else {
            System.out.println("Oferta con código '"+o.getCodigoOferta()+"' ya existente.");
        }

        return false;
    }
    public boolean addTrabajador(Integer codigo, Trabajadores t) {

        if (!mapCodigoTOOferta.containsKey(codigo)) {
            System.out.println("Código de oferta '"+codigo+"' no existente en la lista de ofertas.");
            return false;
        } else {
            if (!mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta().contains(t)) {
                mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta().add(t);
                System.out.println("Trabajador añadido correctamente a la lista de trabajadores de la oferta con código '"+codigo+"'.");
            } else {
                System.out.println("Trabajador ya existente en la lista de trabajadores de la oferta con código '"+codigo+"'.");

                return false;
            }
        }

        return true;
    }
    public boolean removeTrabajador(Integer codigo, Trabajadores t) {

        if (!mapCodigoTOOferta.containsKey(codigo)) {
            System.out.println("Código de oferta '"+codigo+"' no existente en la lista de ofertas.");
            return false;
        } else {
            if (mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta().contains(t)) {
                mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta().remove(t);
                System.out.println("Trabajador dado de baja correctamente en la lista de trabajadores de la oferta con código '"+codigo+"'.");
            } else {
                System.out.println("Trabajador no existente en la lista de trabajadores de la oferta con código '"+codigo+"'.");

                return false;
            }
        }

        return true;
    }
    public void mostrarTrabajadores(Integer codigo) {

        if (!mapCodigoTOOferta.containsKey(codigo)) {
            System.out.println("Oferta con código '"+codigo+"' no existente en la lista de ofertas.");
        } else {
            if (mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta().isEmpty()) {
                System.out.println("La lista de trabajadores de la oferta con  código '"+codigo+"' está vacía. No hay trabajadores en ella.");
            } else {
                mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta().sort(new OrdenarTrabajadoresPorApellidos());

                System.out.println("Lista de trabajadores de la oferta con código '"+codigo+"':");
                System.out.println(mapCodigoTOOferta.get(codigo).getListaTrabajadoresporOferta());
            }
        }
    }
    public int cantidadOfertas(String dni) {
        int contadorOfertas = 0;

        for (Map.Entry<Integer, Oferta> entrada : mapCodigoTOOferta.entrySet()) {

            for (Trabajadores trabajador : entrada.getValue().getListaTrabajadoresporOferta()) {

                if (trabajador.getDniTrabajador().equals(dni)) {
                    contadorOfertas++;
                    break;
                }
            }
        }

        System.out.println("El trabajador con dni '"+dni+"' está en '"+contadorOfertas+"' ofertas.");

        return contadorOfertas;
    }
    public void mostrarOfertas() {
        List<Oferta> listaAuxOfertas = new ArrayList<>();

        for (Map.Entry<Integer, Oferta> entrada : mapCodigoTOOferta.entrySet()) {
            listaAuxOfertas.add(entrada.getValue());
        }

        listaAuxOfertas.sort(new OrdenarOfertasporNumTrabajadores());

        System.out.println("Lista de ofertas ordenadas por número de trabajadores: ");

        for (Oferta oferta : listaAuxOfertas) {
            System.out.println("Código de la oferta: "+oferta.getCodigoOferta());
            System.out.println("Descripción de la oferta: "+oferta.getDescripcionOferta());
            System.out.println("Cubierta de la oferta: "+oferta.isCubiertaOferta());
            // System.out.println("Número de trabajadores de la oferta: "+oferta.getListaTrabajadoresporOferta().size());
            System.out.println("-------------------------------------------------------------------------");
        }
    }
    public void guardarDatos() {

        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlaceSAEDAT));

            escritor.writeObject(mapCodigoTOOferta);

            escritor.close();

            System.out.println("Lista de ofertas guardadas correctamente en el fichero 'sae.dat'.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
    public void cargarDatos() {
         try {
             ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlaceSAEDAT));

             mapCodigoTOOferta = (Map<Integer, Oferta>) lector.readObject();

             lector.close();

             System.out.println("Lista de ofertas cargadas correctamente del fichero 'sae.dat'.");
         } catch (IOException | ClassNotFoundException e) {
             System.out.println("Hubo errores en: "+e.getMessage());
         }
    }
}
