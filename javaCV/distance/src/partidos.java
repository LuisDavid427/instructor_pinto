import java.util.Scanner;
public class partidos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Cequipos;
        int puntajePG=3;
        int puntajePE=1;
        int puntajePP=0;
        int pG;
        int pE;
        int pP;
        int puntajeTot;
        int counter;
        System.out.print("Ingresa cuantos equipos son: ");
        Cequipos = scanner.nextInt();
        for(counter=1;counter<=Cequipos;counter++){
            System.out.println("Ingresa datos de equipo: "+counter);
            System.out.print(" Ingresa partidos ganados: ");
            pG = scanner.nextInt()*puntajePG;
            System.out.print("Ingresa partidos empatados: ");
            pE = scanner.nextInt()*puntajePE;
            System.out.print("Ingresa partidos perdidos: ");
            pP = scanner.nextInt()*puntajePP;
            puntajeTot=pG+pE+pP;
            System.out.println("puntaje total de equipo: "+counter+" es: "+puntajeTot);
        }
    }
}