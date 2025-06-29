import java.util.Scanner;

public class E3 {
        public static int pf, rc, ri, rb, prc, pri;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
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
