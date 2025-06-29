import java.util.Scanner;

public class E28 {
    public static int nv = 0, nl = 0, counter;
    public static char l;

        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for(counter=1;counter<=10;counter ++){
            System.out.print("Ingresa caracter numero: "+counter+": " );
            l = scanner.next().charAt(0);
            switch (Character.toLowerCase(l)) {
                case 'a':
                    nv+=1;
                    break;
                case 'e':
                    nv+=1;
                    break;
                case 'i':
                    nv+=1;
                    break;
                case 'o':
                    nv+=1;
                    break;
                case 'u':
                    nv+=1;
                    break;
                default:
                    nl+=1;
                    break;
        }
        }
        System.out.println("el numero de vocales son: "+nv);
        System.out.println("el numero de consonantes son: "+nl);
    }
}
