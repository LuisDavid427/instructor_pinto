import java.util.Scanner;

public class mil {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double s=1;
        while(s<1000){
            System.out.println((int)s);
            s=Math.pow(s, 2)+1;
        }
        }
}
