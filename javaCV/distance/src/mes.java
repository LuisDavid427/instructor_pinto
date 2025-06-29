import java.util.Scanner;

public class mes {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("ingresa numero : ");
        n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("enero");
                    break;
                case 2:
                    System.out.println("febrero");
                    break;
                case 3:
                    System.out.println("marzo");
                    break;
                case 4:
                    System.out.println("abril");
                    break;
                case 5:
                    System.out.println("enero");
                    break;
                case 6:
                    System.out.println("febrero");
                    break;
                case 7:
                    System.out.println("marzo");
                    break;
                case 8:
                    System.out.println("abril");
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }
