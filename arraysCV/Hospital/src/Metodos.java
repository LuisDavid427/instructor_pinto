import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Metodos {
    public static String[] ambulancias= new String[10]; 
    public static List<Conductor> conductores = new ArrayList<>();
    public static String[][] pacientes = new String[10][10];
    public static String[] muertos = new String[15];
    public static String[] carroFunebre ={"carro funebre"};
    public static Random random = new Random();
    public static String[] comCA = new String[10];
    public static String[][] comCAP = new String[10][10];
    public static String[] comMuertos = new String[15];
    public static String[] comCarroFCM = new String[15];
    public static String[] comCarroFC = new String[15];
    public static String[][] copiaPacientes = new String[10][10];
    public static String[] copiaComCarroFC = new String[15];

    public static void registro(){
        for(int i=0; i<conductores.size(); i++){
            System.out.println(conductores.get(i).toString());
        }
        System.out.println("Ambulancias registradas:");
        System.out.println(Arrays.toString(ambulancias));
        System.out.println("Pacientes registrados:");
        System.out.println(Arrays.deepToString(pacientes));
        System.out.println("Personas fallecidas registradas:");
        System.out.println(Arrays.toString(muertos));
        System.out.println("conductores con sus ambulancias:");
        System.out.println(Arrays.toString(comCA));
        System.out.println("conductores con sus pacientes:");
        System.out.println(Arrays.deepToString(comCAP));
        System.out.println("conductores con sus carro funebre:");
        System.out.println(Arrays.toString(comCarroFC));
        System.out.println("conductores con sus personas fallecidas:");
        System.out.println(Arrays.toString(comMuertos));


    }
    
    public static void CA(){ 
        for(int i=0; i<10; i++){
            comCA[i] = conductores.get(i).toString() + "es el conductor de la ambulancia: "+ ambulancias[i]; 
        }
    }
    public static void CAP(){
        for (int i = 0; i < pacientes.length; i++) {
            for (int j = 0; j < pacientes[i].length; j++) {
                copiaPacientes[i][j] = pacientes[i][j];
            }
        }
        for(int i=0; i<10; i++){
            for(int j= 0; j<10;j++){
                boolean asignado = false;
                while (!asignado) {
                    int ip = random.nextInt(10);
                    int jp = random.nextInt(10);
                    if (copiaPacientes[ip][jp] != null && !copiaPacientes[ip][jp].isEmpty()){
                        comCAP[i][j] = comCA[i]+" recoje a "+copiaPacientes[ip][jp];
                        copiaPacientes[ip][jp] = ""; 
                        asignado = true;
                    }
                }
            }
        }
    }
    public static void CF(){
        for(int i=0; i<15; i++){
            comCarroFC[i] = conductores.get(i).toString() + " es el conductor del carro funebre: "+ carroFunebre[0]; 
        }
    }
    public static void muertosFunebre(){
        for (int i = 0; i <15; i++) {
                copiaComCarroFC[i] = comCarroFC[i];
            }
        for(int i=0; i<15; i++){
            boolean asignado = false;
            while(!asignado){
                int ip = random.nextInt(15);
                if(copiaComCarroFC[ip] != null && !copiaComCarroFC[ip].isEmpty()){
                    asignado = true;
                    comMuertos[i] = comCarroFC[ip]+" lleva a la persona fallecida: "+ muertos[i];
                    copiaComCarroFC[ip] = ""; 
                    asignado = true;
                }
            }
        }
    }
   
}
