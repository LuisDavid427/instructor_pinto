import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tiempo: ");
        int time = scanner.nextInt();
        System.out.print("Ingresa velocidad: ");
        int speed = scanner.nextInt();
        int distance=time*speed;
        System.out.println("distance is: "+distance);
        scanner.close();
    }
}
