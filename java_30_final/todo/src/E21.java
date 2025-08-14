import java.util.Scanner;
public class E21 {
    public static int ep, men = 0, may = 0, cantP, counter;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero de personas a las cuales les desea calcular la edad: ");
        cantP = scanner.nextInt();
        for(counter=0;counter<cantP;counter++){
            System.out.print("Ingresa la edad de la persona: ");
            ep = scanner.nextInt();
            if(ep<=18){
                may +=1;
            }
            else{
                men+=1;
            }
        }
        System.out.println("los mayores de edad son: "+may+" y los menores son: "+men);
    }
}
