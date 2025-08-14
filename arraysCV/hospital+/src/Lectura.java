import java.util.Scanner;

public class Lectura {
    public static Scanner scan = new Scanner(System.in);
    public static Metodos m = new Metodos();
    public static int counter = 0;

    public static void scanConduc() {
        for (int i = 0; i < 10; i++) {
            Conductor c = new Conductor();
            System.out.println("Digite el nombre del conductor número " + (i + 1) + ":");
            c.nombre = scan.nextLine();
            System.out.println("Digite el teléfono del conductor número " + (i + 1) + ":");
            c.telefono = scan.nextLine();
            m.conductores.add(c);
        }
    }

    public static void scanPaciente() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                counter++;
                System.out.println("Digite el nombre del paciente en la posición " + counter + ":");
                m.pacientes[i][j] = scan.nextLine();
            }
        }
    }

    public static void scanAmbu() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el número o nombre de la ambulancia número " + (i + 1) + ":");
            m.ambulancias[i] = scan.nextLine();
        }
    }

    public static void scanMuertos() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite el nombre de la persona fallecida número " + (i + 1) + ":");
            m.muertos[i] = scan.nextLine();
        }
    }
}
