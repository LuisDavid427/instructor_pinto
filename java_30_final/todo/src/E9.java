import java.util.Scanner;

public class E9 {
        public static int an, aa, e;
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa año de nacimiento: ");
        an = scanner.nextInt();
        System.out.print("Ingresa año actual: ");
        aa = scanner.nextInt();
        e=aa-an;
        if (e>17) {
            System.out.println("debe solicitar su CUIL");
        }
        else if (e<17) {
            System.out.println("no debe solicitar su CUIL");
        }
        else {
            System.out.println("debe solicitar su CUIL");
        }
    }
}
