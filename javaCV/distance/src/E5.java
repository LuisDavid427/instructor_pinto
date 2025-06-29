import java.util.Scanner;

public class E5 {
        public static int TH, TL, p;
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tarifa por hora: ");
        TH = scanner.nextInt();
        System.out.print("Ingresa tiempo laburado en horas: ");
        TL = scanner.nextInt();
        p=TH*TL;
        System.out.println("total pagar: "+p);
}
}
