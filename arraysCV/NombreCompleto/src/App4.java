
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] nombre = new String[1];
        String[] segundoN = new String[1];
        String[] apellido1 = new String[1];
        String[] apellido2 = new String[1];
        String a, b, c, d;

        
        System.out.println("ingrese primer nombre");
        nombre[0]=scan.nextLine();
        a=nombre[0];

        System.out.println("ingrese segundo nombre");
        segundoN[0]=scan.nextLine();
        b=segundoN[0];

        System.out.println("ingrese primer apellido");
        apellido1[0]=scan.nextLine();
        c=apellido1[0];

        System.out.println("ingrese segundo apellido");
        apellido2[0]=scan.nextLine();
        d=apellido2[0];

        System.out.println(a+" "+b+" "+c+" "+d);

    }
}
