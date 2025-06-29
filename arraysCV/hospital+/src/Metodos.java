import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Metodos {
    public static String[] ambulancias = new String[10];
    public static List<Conductor> conductores = new ArrayList<>();
    public static String[][] pacientes = new String[10][10];
    public static String[] muertos = new String[15];
    public static String[] carroFunebre = {"carro funebre"};

    public static String[] comCA = new String[10];
    public static String[][] comCAP = new String[3][34];
    public static String[] comMuertos = new String[15];
    public static String[] comCarroFC = new String[15];

    public static void registro() {
        for (Conductor c : conductores) {
            System.out.println(c);
        }
        System.out.println("Ambulancias registradas:");
        System.out.println(Arrays.toString(ambulancias));

        System.out.println("Pacientes registrados:");
        System.out.println(Arrays.deepToString(pacientes));

        System.out.println("Personas fallecidas registradas:");
        System.out.println(Arrays.toString(muertos));

        System.out.println("Conductores con sus ambulancias:");
        System.out.println(Arrays.toString(comCA));

        System.out.println("Pacientes asignados a clínicas:");
        for (int i = 0; i < comCAP.length; i++) {
            for (int j = 0; j < comCAP[i].length; j++) {
                if (comCAP[i][j] != null) {
                    System.out.println(comCAP[i][j]);
                }
            }
        }

        System.out.println("Conductores con carro fúnebre:");
        System.out.println(Arrays.toString(comCarroFC));

        System.out.println("Muertos asignados a conductores:");
        System.out.println(Arrays.toString(comMuertos));
    }

    public static void CA() {
        for (int i = 0; i < 10; i++) {
            comCA[i] = conductores.get(i) + " es el conductor de la ambulancia: " + ambulancias[i];
        }
    }

    public static void distribuirPacientes() {
        int[] distancias = {55, 45, 35};     
        int[] cupos = {34, 33, 33};          
        int[] recorridos = new int[conductores.size()];
        int[] kilometros = new int[conductores.size()];
        int pacientesNoAtendidos = 0;

        
        List<String> listaPacientes = new ArrayList<>();
        for (int i = 0; i < pacientes.length; i++) {
            for (int j = 0; j < pacientes[i].length; j++) {
                if (pacientes[i][j] != null && !pacientes[i][j].isEmpty()) {
                    listaPacientes.add(pacientes[i][j]);
                }
            }
        }

        int indexPaciente = 0;
        int[] ordenClinicas = {0, 2, 1};

        for (int c : ordenClinicas) {
            int maxCupo = cupos[c];
            int pacienteAsignado = 0;

            while (pacienteAsignado < maxCupo && indexPaciente < listaPacientes.size()) {
                boolean asignado = false;

                for (int i = 0; i < conductores.size(); i++) {
                    int nuevaDistancia = kilometros[i] + distancias[c];
                    if (recorridos[i] < 8 && nuevaDistancia <= 400) {
                        comCAP[c][pacienteAsignado] = conductores.get(i) + " lleva a " + listaPacientes.get(indexPaciente) + " a clínica " + (c + 1);
                        recorridos[i]++;
                        kilometros[i] = nuevaDistancia;
                        indexPaciente++;
                        pacienteAsignado++;
                        asignado = true;
                        break;
                    }
                }

                if (!asignado) {
                    System.out.println("No se encontró conductor para transportar al paciente #" + (indexPaciente + 1));
                    pacientesNoAtendidos++;
                    indexPaciente++;
                    pacienteAsignado++; 
                }
            }
        }

        System.out.println("Pacientes que no se pudieron transportar: " + pacientesNoAtendidos);
    }

    public static void CF() {
        for (int i = 0; i < 15; i++) {
            int conductorIndex = i % conductores.size();
            comCarroFC[i] = conductores.get(conductorIndex) + " es el conductor del carro funebre: " + carroFunebre[0];
        }
    }

    public static void muertosFunebre() {
        for (int i = 0; i < 15; i++) {
            comMuertos[i] = comCarroFC[i] + " lleva a la persona fallecida: " + muertos[i];
        }
    }
}
