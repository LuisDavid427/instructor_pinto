import java.util.Scanner;
public class notas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int promedio;
        System.out.print("Ingresa nota 1: ");
        nota1 = scanner.nextInt();
        System.out.print("Ingresa nota 2: ");
        nota2 = scanner.nextInt();
        System.out.print("Ingresa nota 3: ");
        nota3 = scanner.nextInt();
        promedio=nota1+nota2+nota3/3;
        System.out.print("el promedio es: "+promedio);
        scanner.close();
    }
}
