
import java.util.Scanner;


public class EjercicioElMayor {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Proporciona el numero 1: ");
        int numero1=Integer.parseInt(scanner.nextLine());
        
        System.out.print("Proporciona el numero 2: ");
        int numero2=Integer.parseInt(scanner.nextLine());
        
        System.out.println("El numero mayor es ");
        System.out.println(numero1>numero2?numero1:numero2);
        if(numero1>numero2){
            System.out.println("El numero mayor es:\n"+numero1);
        }else{
            System.out.println("El numero mayor es\n"+numero2);
        }
                
    }
}
