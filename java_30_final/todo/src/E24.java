import java.util.Scanner;

public class E24 {
    public static double s=1;
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        while(s<1000){
            System.out.println((int)s);
            s=Math.pow(s, 2)+1;
        }
        }
}
