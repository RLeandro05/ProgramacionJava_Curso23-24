package org.velazquez.U7.Entregable1920Tarde;


import java.io.*;
import java.util.*;

public class Coronavirus implements Serializable{
    Scanner sc = new Scanner(System.in);

    String enlacePACIENTESDAT = "C:\\Users\\liger\\Desktop\\programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7\\Entregable1920Tarde\\pacientes.dat";

    private List<Integer> listaCepas = new ArrayList<>();
    private Map<Integer, List<Paciente>> mapCodigoTOListaPaciente = new HashMap<>();
    private String nombreCientificoVirus = "COVID-19";
    private String localidadOrigenVirus = "Wuhan";

    public void addPaciente(int cepaPaciente, Paciente paciente) { // Método para añadir pacientes a la estructura

        aniadirPacienteAMapa(cepaPaciente, paciente);
    }
    public void aniadirPacienteAMapa(int cepaPaciente, Paciente paciente) {

        List<Paciente> listaAuxPacientes = new ArrayList<>();

        if (!listaCepas.contains(cepaPaciente)) { // Si no estaba su cepa, la añdimos
            listaCepas.add(cepaPaciente);
        }

        if (!mapCodigoTOListaPaciente.containsKey(cepaPaciente)) { // SI no estaba su cepa en el mapa, lo añadimos
            mapCodigoTOListaPaciente.put(cepaPaciente, listaAuxPacientes);
        }

        System.out.println("Lista de cepas: "+listaCepas);
        System.out.println("Por favor, seleccione el número de cepa de su paciente: ");
        int cepa = sc.nextInt(); // Escribimos la cepa del paciente que queremos añadir

        while (cepa != cepaPaciente) {

            System.out.println("El número de cepa no coincide. Por favor, seleccione el correcto: ");
            cepa = sc.nextInt(); // Si no es correcto, entramos y seguimos preguntando

            if (cepa == cepaPaciente) { // En cuanto se escriba el correcto, vemos primero si ese paciente está en la lista
                if (!mapCodigoTOListaPaciente.get(cepaPaciente).contains(paciente)) { // Si no estaba, lo añadimos
                    mapCodigoTOListaPaciente.get(cepaPaciente).add(paciente);

                    System.out.println("El paciente ha sido añadido a la lista.");
                } else { // En caso de que ya estuviese, se lo comentamos como error
                    System.out.println("El paciente ya estaba añadido a la lista.");
                }

                return; // Volvemos para no repetir dos veces el código
            }
        }

        // Mismo código en el caso de que se ponga la cepa correcta a la primera
        if (!mapCodigoTOListaPaciente.get(cepaPaciente).contains(paciente)) {

            mapCodigoTOListaPaciente.get(cepaPaciente).add(paciente);

            System.out.println("El paciente ha sido añadido a la lista.");
        } else {
            System.out.println("El paciente ya estaba añadido a la lista.");
        }
    }
    public void darDeAltaPaciente(Paciente paciente) { // Método para eliminar pacientes de la estructura

        if (mapCodigoTOListaPaciente.get(paciente.getCepaPaciente()).contains(paciente)) {
            mapCodigoTOListaPaciente.get(paciente.getCepaPaciente()).remove(paciente);

            System.out.println("Paciente con cepa '"+paciente.getCepaPaciente()+"' dado de alta correctamente.");
        } else {
            System.out.println("El paciente con cepa '"+paciente.getCepaPaciente()+"' no está en la lista de pacientes.");
        }
    }
    public void pacientesDeUnDoctor(int colegiadoMedico) { // Método para mostrar una lista de pacientes según el número de colegiado del médico

        List<Paciente> listaPacientesPorMedico = new ArrayList<>();
        List<Paciente> listaAux;

        for (Map.Entry<Integer, List<Paciente>> entrada : mapCodigoTOListaPaciente.entrySet()) {
            listaAux = entrada.getValue();

            for (Paciente paciente : listaAux) {
                if (paciente.getMedicoPaciente().getColegiadoMedico() == colegiadoMedico) {
                    listaPacientesPorMedico.add(paciente);
                }
            }
        }

        System.out.println("La lista de pacientes del médico con número e colegiado '"+colegiadoMedico+"' es: ");
        System.out.println(listaPacientesPorMedico);
    }
    public void pacientesporPeso(int cepaPaciente) { // Método para mostrar una lista de pacientes de una cepa ordenados por peso decrecientemente

        if (mapCodigoTOListaPaciente.containsKey(cepaPaciente)) {
            mapCodigoTOListaPaciente.get(cepaPaciente).sort(new PacientesOrdenadosPorPeso());

            System.out.println("Lista de pacientes de la cepa '"+cepaPaciente+"' ordenados por peso decrecientemente: ");
            System.out.println(mapCodigoTOListaPaciente.get(cepaPaciente));
        } else {
            System.out.println("No hay pacientes con la cepa '"+cepaPaciente+"'.");
        }
    }
    public void pacientesporEdad(int cepaPaciente) { // Método para mostrar una lista de pacientes de una cepa ordenados por edad decrecientemente

        if (mapCodigoTOListaPaciente.containsKey(cepaPaciente)) {
            mapCodigoTOListaPaciente.get(cepaPaciente).sort(new PacientesOrdenadosPorEdad());

            System.out.println("Lista de pacientes de la cepa '"+cepaPaciente+"' ordenados por edad decrecientemente: ");
            System.out.println(mapCodigoTOListaPaciente.get(cepaPaciente));
        } else {
            System.out.println("No hay pacientes con la cepa '"+cepaPaciente+"'.");
        }
    }
    public void cargarPacientes() { // Método para cargar pacientes desde el fichero pacientes.dat

        try {

            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(enlacePACIENTESDAT));

            mapCodigoTOListaPaciente = (Map<Integer, List<Paciente>>) lector.readObject();

            lector.close();

//            for (Map.Entry<Integer, List<Paciente>> entrada : mapCodigoTOListaPaciente.entrySet()) {
//
//                for (Paciente paciente : entrada.getValue()) {
//                    aniadirPacienteAMapa(paciente.getCepaPaciente(), paciente);
//                }
//            }

            System.out.println("Lista de pacientes cargados correctamente desde el fichero 'pacientes.dat'.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
    public void guardarPacientes() { // Método para guardar el mapa en el archivo binario

        try {

            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(enlacePACIENTESDAT));

            escritor.writeObject(mapCodigoTOListaPaciente);

            escritor.close();

            System.out.println("Lista de pacientes añadida al fichero 'pacientes.dat' correctamente.");
        } catch (IOException e) {
            System.out.println("Hubo errores en: "+e.getMessage());
        }
    }
    public void mostrarMapa() {
        System.out.println(mapCodigoTOListaPaciente);
    }
}
