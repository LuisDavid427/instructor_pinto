import java.util.Scanner;

public class E30 {
    public static int n1, n2;
    public static double average;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa numero 1: ");
        n1 = scanner.nextInt();
        System.out.print("Ingresa numero 2: ");
        n2 = scanner.nextInt();
        average=(n1+n2)/2;
        System.out.println("el promedio es: "+average);
    }
}
