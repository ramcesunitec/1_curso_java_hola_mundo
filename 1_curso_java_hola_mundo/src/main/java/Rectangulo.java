
import java.util.Scanner;


public class Rectangulo {
    public static void main(String[] args) {
        int alto,ancho,area,perimetro;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Proporciona el alto: ");
        alto=Integer.parseInt(scanner.nextLine());
        
        System.out.print("Proporciona el ancho: ");
        ancho=Integer.parseInt(scanner.nextLine());
        
        area=alto*ancho;
        perimetro=(alto+ancho)*2;
         System.out.println("Area: "+area+"\nPerimetro: "+perimetro);
                
    }
            
}
