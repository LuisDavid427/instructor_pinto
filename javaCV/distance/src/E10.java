import java.util.Scanner;

public class E10 {
        public static int e1, e2, de;
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa edad del hermano 1: ");
        e1 = scanner.nextInt();
        System.out.print("Ingresa edad del hermano 2: ");
        e2 = scanner.nextInt();
        if (e1>e2) {
            de=e1-e2;
            System.out.println("El hermano 1 es mayor por " + de + " años");
        }
        else if (e1<e2) {
            de=e2-e1;
            System.out.println("El hermano 2 es mayor por " + de + " años");
        }
        else {
            System.out.println("Ambos hermanos tienen la misma edad");
            
        }
    }
}
