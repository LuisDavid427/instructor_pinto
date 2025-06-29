import java.util.Scanner;

public class E22 {
    public static int pn, sn, counter, p = 0;

        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa primer numero: ");
        pn = scanner.nextInt();
        System.out.print("Ingresa segundo numero: ");
        sn = scanner.nextInt();
        for(counter=0;counter<=sn;counter++){
            p = p + pn;
        }
        System.out.println("El resultado es: " + p);
    }
}
        
    
    

