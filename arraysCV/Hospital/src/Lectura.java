import java.util.Scanner;

public class Lectura {
    public static Scanner scan = new Scanner(System.in);
    public static Metodos m = new Metodos();
    
    public static int counter=0;

    public static void scanConduc(){
        for(int i = 0; i<10;i++){
            Conductor c = new Conductor();
            System.out.println("digite el nombre del conductor numero: "+(i+1));
            c.nombre = scan.nextLine();
            System.out.println("digite el telefono del conductor numero: "+(i+1));
            c.telefono = scan.nextLine();
            m.conductores.add(c);
        }

    }
    public static void scanPaciente(){
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10; j++){
            counter++;
            System.out.println("digite el nombre del pasiente del la posicion"+counter);
            m.pacientes[i][j] = scan.nextLine();
            }
        }
    }
    public static void scanAmbu(){
        for(int i = 0; i<10;i++){
            System.out.println("digite el numero de la ambulacia numero: "+(i+1));
            m.ambulancias[i] = scan.nextLine();
        }
    }
    public static void scanMuertos(){
        for(int i = 0; i<15;i++){
            System.out.println("digite el nombre de la persona fallecida numero: "+(i+1));
            m.muertos[i] = scan.nextLine();
        }
    }


}
