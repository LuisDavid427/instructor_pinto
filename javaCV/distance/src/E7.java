import java.util.Scanner;

public class E7 {
        public static int GB, MB, CD;
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa GB de el disco: ");
        GB = scanner.nextInt();
        MB=GB*1024;
        CD=((MB/700)+1);
        System.out.println("para hacer la copia de seguridad se necesitan "+CD+" CD");

        }
}
