import java.util.Scanner;
public class E6 {
    public static double s, a, b, c, area;
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa lado a: ");
    a = scanner.nextDouble();
    System.out.print("Ingresa lado b: ");
    b = scanner.nextDouble();
    System.out.print("Ingresa lado c: ");
    c = scanner.nextDouble();
    s=(a+b+c)/2;
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("area es: "+area);
    }
}
