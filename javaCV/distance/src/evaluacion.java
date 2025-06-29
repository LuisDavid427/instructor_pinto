import java.util.Scanner;

public class evaluacion {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pf;
        int rc;
        int ri;
        int rb;
        int prc;
        int pri;
        System.out.print("ingresa numero de respuestas correctas: ");
        rc = scanner.nextInt();
        System.out.print("ingresa numero de respuestas incorrectas: ");
        ri = scanner.nextInt();
        System.out.print("ingresa numero de respuestas en blanco: ");
        rb = scanner.nextInt();
        prc=rc*4;
        pri=ri*-1;
        pf=prc+pri;
        System.out.println("el puntaje final es: "+pf);
    }
}
