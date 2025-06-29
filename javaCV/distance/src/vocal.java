import java.util.Scanner;
public class vocal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int ne;
    System.out.print("Ingresa un numero del 1 al 5: ");
    ne = scanner.nextInt();
    switch (ne) {
        case 1:
            System.out.println("a");
            break;
        case 2:
            System.out.println("e");
            break;
        case 3:
            System.out.println("i");
            break;
        case 4:
            System.out.println("o");
            break;
        case 5:
            System.out.println("u");
            break;
        default:
            System.out.println("el dato ingresado no es valido para este programa");
            break;
    }
}
}
