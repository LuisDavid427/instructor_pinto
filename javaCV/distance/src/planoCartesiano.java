import java.util.Scanner;

public class planoCartesiano {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double d;
        int aa;
        int ab;
        int oa;
        int ob;
        System.out.print("Ingresa abcisa de a: ");
        aa = scanner.nextInt();
        System.out.print("Ingresa abcisa de b: ");
        ab = scanner.nextInt();
        System.out.print("Ingresa ordenada a: ");
        oa = scanner.nextInt();
        System.out.print("Ingresa ordenada b: ");
        ob = scanner.nextInt();
        d=Math.sqrt(Math.pow((ab-aa), 2)+Math.pow((ob-oa), 2));
        System.out.println("distancia es: "+d);
        }
}
