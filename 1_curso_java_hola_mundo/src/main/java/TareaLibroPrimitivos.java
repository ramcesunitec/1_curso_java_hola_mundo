
import java.util.Scanner;


public class TareaLibroPrimitivos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String libro=scanner.nextLine();
        
        System.out.println("Proporciona el id: ");
        int id=Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporciona el precio: ");
        double precio=Double.parseDouble(scanner.nextLine());
        
        System.out.println("Proporciona el simbolo monetario: ");
        char simbolo=scanner.nextLine().charAt(0);
        
        System.out.println("Proporciona el envio gratuito: ");
        boolean envio=Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(libro+" #"+id+"\nPrecio: "+simbolo+precio+"\nEnvio Gratuito: "+envio);
    
    }
}