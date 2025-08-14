import java.util.Scanner;
public class E1 {
    public static int time, speed, distance;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tiempo: ");
        time = scanner.nextInt();
        System.out.print("Ingresa velocidad: ");
        speed = scanner.nextInt();
        distance=time*speed;
        System.out.println("distance is: "+distance);
    }
}
