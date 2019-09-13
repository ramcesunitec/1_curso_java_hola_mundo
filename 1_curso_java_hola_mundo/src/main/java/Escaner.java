
import java.util.Scanner;


public class Escaner {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Proporciona el usuario");
        var usuario = scanner.nextLine();
        System.out.println("Usuario: " + usuario);
        
    }
}
