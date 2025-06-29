import java.util.Scanner;

public class edad {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int an;
        int aa;
        int e;
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
        scanner.close();
    }
}
