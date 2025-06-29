import java.util.Scanner;

public class diez_letras {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int nv=0;
        int nl=0;
        char l;
        int counter;
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
