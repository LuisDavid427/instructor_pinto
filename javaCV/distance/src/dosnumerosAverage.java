import java.util.Scanner;

public class dosnumerosAverage {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        double average;
        System.out.print("Ingresa numero 1: ");
        n1 = scanner.nextInt();
        System.out.print("Ingresa numero 2: ");
        n2 = scanner.nextInt();
        average=(n1+n2)/2;
        System.out.println("el promedio es: "+average);
    }
}
