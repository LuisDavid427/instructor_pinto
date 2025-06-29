import java.util.Scanner;
public class E17 {
    public static int ne, d, r, u, q;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero de 2 cifras: ");
        ne = scanner.nextInt();
        d=(ne/10);
        u=ne%10;
        System.out.println("decenas: " + d);
        System.out.println("unidades: " + u);
    }
}
