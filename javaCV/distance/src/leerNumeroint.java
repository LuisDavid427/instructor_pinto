import java.util.Scanner;
public class leerNumeroint {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int ne;
        int d;
        int r;
        int u;
        int q;
        System.out.print("Ingresa un numero entero de 2 cifras: ");
        ne = scanner.nextInt();
        d=(ne/10);
        u=ne%10;
        System.out.println("decenas: " + d);
        System.out.println("unidades: " + u);
    }
}
