import java.util.Scanner;

public class vocalNo {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char caracter;
        char semaforo='V';

        while(semaforo=='V'){
            System.out.print("Ingresa caracter: ");
            caracter = scanner.next().charAt(0);

            switch (Character.toLowerCase(caracter)) {
                case 'a':
                semaforo='R';
                    break;
                case 'e':
                semaforo='R';
                    break;
                case 'i':
                semaforo='R';
                    break;
                case 'o':
                semaforo='R';
                    break;
                case 'u':
                semaforo='R';
                    break;
                default:
                semaforo='V';
            }    
        }  
    }
}

