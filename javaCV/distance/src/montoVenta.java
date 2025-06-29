import java.util.Scanner;

public class montoVenta {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int mv;
        int tb;

        System.out.print("Ingresa el monto de venta: ");
        mv = scanner.nextInt();

        if (mv >= 0 && mv <= 1000) {
            tb = mv * 0 / 100;
            System.out.println("El total a pagar es: " + tb);
        } else if (mv > 1000 && mv <= 5000) {
            tb = mv * 3 / 100;
            System.out.println("El total a pagar es: " + tb);
        } else if (mv > 5000 && mv <= 20000) {
            tb = mv * 5 / 100;
            System.out.println("El total a pagar es: " + tb);
        } else if (mv > 20000) {
            tb = mv * 8 / 100;
            System.out.println("El total a pagar es: " + tb);
        } else {
            System.out.println("Monto no válido");
        }
        scanner.close();
    }
}
