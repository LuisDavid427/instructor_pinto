import java.util.Scanner;

public class E13 {
    public static double l1, l2, l3;

    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa lado 1: ");
    l1 = scanner.nextDouble();
    System.out.print("Ingresa lado 2: ");
    l2 = scanner.nextDouble();
    System.out.print("Ingresa lado 3: ");
    l3 = scanner.nextDouble();

    if (l1!=l2 && l1!=l3 && l3!=l1) {
        System.out.println("es un triangulo escaleno");
    }
    else if (l1==l2 && l1==l3) {
        System.out.println("es un triangulo equilatero");
    }
    else {
        System.out.println("es un triangulo isoceles");
    }
    }
}
