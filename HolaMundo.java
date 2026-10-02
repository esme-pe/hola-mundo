import java.util.Scanner;

public class HolaMundo {
    public static void main (String[] arg){
        Scanner datos = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = datos.nextLine();
        System.out.println("Dame tu edad");
        int edad = datos.nextInt();
        System.out.println("Tu nombre es: "+ nombre + " y tu edad es: "+ edad);
datos.close();
    }
}
