import java.util.Scanner;

public class CD {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int GB;
        int MB;
        int CD;
        System.out.print("Ingresa GB de el disco: ");
        GB = scanner.nextInt();
        MB=GB*1024;
        CD=((MB/700)+1);
        System.out.println("para hacer la copia de seguridad se necesitan "+CD+" CD");

        }
}
