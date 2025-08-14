import java.util.Scanner;
public class E4 {
    public static int Cequipos, puntajePG=3, puntajePE=1, puntajePP=0, pG, pE, pP, puntajeTot, counter;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
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