import java.util.Arrays;
import java.util.Scanner;

public class App1 {
    public static double a, b, c;
    public static Scanner scan = new Scanner(System.in);
    public static double[] datosOne = new double[10];
    public static double[] datosTwo = new double[10];
    public static void main(String[] args) throws Exception {
        int option;
        System.out.println("digite los valores de vector 1");
        for(int i=0; i < 10;i ++){
            System.out.println("digite valor "+(i+1));
            datosOne[i]=scan.nextDouble();
        }
        System.out.println("digite los valores de vector 2");
        for(int i=0; i < 10; i++){
            System.out.println("digite valor "+(i+1));
            datosTwo[i]=scan.nextDouble();
        }
        do{
        System.out.println("ingresa que operacion deseas hacer");
        System.out.println("1 si deseas sumar");
        System.out.println("2 restar");
        System.out.println("3 multiplicar");
        System.out.println("4 dividir");
        System.out.println("5 salir");
        option = scan.nextInt();
        
        switch(option){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                divition();
                break;
            default:
                break;
        }
        }while(option<5);

    }
    public static void suma(){
        scaner();
        c= 0;
        c=a+b;
        System.out.println("respuesta: "+c);
    }
    public static void resta(){
        scaner();
        c= 0;
        c=a+b;
        System.out.println("respuesta: "+c);
    }
    public static void multiplicacion(){
        scaner();
        c= 0;
        c=a+b;
        System.out.println("respuesta: "+c);
    }
    public static void divition(){
        scaner();
        c= 0;
        c=a/b;
        if(a!=0 && b!=0){
            System.out.println("respuesta: "+c);
        }
        else{
            System.out.println("no se puede hacer divisiones con 0");
        }
    }
    public static void scaner(){
        System.out.println("primer vector de numeros: "+Arrays.toString(datosOne));
        System.out.println("ingresa el numero que deseas utilizar del vector uno");
        int i = scan.nextInt()-1;
        a=datosOne[i];
        System.out.println("numero de vector uno seleccionado: "+a);

        System.out.println("segundo vector de numeros: "+Arrays.toString(datosTwo));
        System.out.println("ingresa el numero que deseas utilizar del vector dos");
        int j = scan.nextInt()-1;
        b=datosTwo[i];
        System.out.println("numero de vector dos seleccionado: "+b);
    }
}