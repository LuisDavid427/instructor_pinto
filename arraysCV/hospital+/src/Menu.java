import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar conductores");
            System.out.println("2. Registrar ambulancias");
            System.out.println("3. Registrar pacientes");
            System.out.println("4. Registrar personas fallecidas");
            System.out.println("5. Asignar conductores a ambulancias (CA)");
            System.out.println("6. Distribuir pacientes a clínicas (CAP)");
            System.out.println("7. Asignar conductores al carro fúnebre (CF)");
            System.out.println("8. Asignar muertos al carro fúnebre (muertosFunebre)");
            System.out.println("9. Mostrar todo el registro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    Lectura.scanConduc();
                    System.out.println("Conductores registrados con éxito.");
                    break;
                case 2:
                    Lectura.scanAmbu();
                    System.out.println("Ambulancias registradas con éxito.");
                    break;
                case 3:
                    Lectura.scanPaciente();
                    System.out.println("Pacientes registrados con éxito.");
                    break;
                case 4:
                    Lectura.scanMuertos();
                    System.out.println("Personas fallecidas registradas con éxito.");
                    break;
                case 5:
                    Metodos.CA();
                    System.out.println("Conductores asignados a ambulancias.");
                    break;
                case 6:
                    Metodos.distribuirPacientes();
                    break;
                case 7:
                    Metodos.CF();
                    System.out.println("Conductores asignados a carro fúnebre.");
                    break;
                case 8:
                    Metodos.muertosFunebre();
                    System.out.println("Muertos asignados a conductores con carro fúnebre.");
                    break;
                case 9:
                    Metodos.registro();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}
