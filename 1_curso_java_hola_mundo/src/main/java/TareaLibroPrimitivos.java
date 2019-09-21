
import java.util.Scanner;


public class TareaLibroPrimitivos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Proporciona el nombre: ");
        String libro=scanner.nextLine();
        
        System.out.print("Proporciona el id: ");
        int id=Integer.parseInt(scanner.nextLine());
        
        System.out.print("Proporciona el precio: ");
        double precio=Double.parseDouble(scanner.nextLine());
        
        System.out.print("Proporciona el simbolo monetario: ");
        char simbolo=scanner.nextLine().charAt(0);
        
        System.out.print("Proporciona el envio gratuito: ");
        boolean envio=Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println("\n"+libro+" #"+id+"\nPrecio: "+simbolo+precio+"\nEnvio Gratuito: "+envio);
    }
}