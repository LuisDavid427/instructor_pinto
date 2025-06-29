import java.util.Arrays;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] array = new String[10];
        for(int i=0; i < 10;i ++){
            System.out.println("digite nombre "+(i+1));
            array[i]=scan.nextLine();
        }
        System.out.println("lista de nombres ingresados: ");
        for(String n : array){
            System.out.println(n);
        }
    }
}
