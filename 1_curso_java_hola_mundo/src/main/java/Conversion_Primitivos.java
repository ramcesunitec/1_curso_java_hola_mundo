
import java.util.Scanner;


public class Conversion_Primitivos {
    public static void main(String[] args) {
        //String a int
        int edad=Integer.parseInt("21");
        System.out.println(edad);
        
        double valorPi=Double.parseDouble("3.1416");
        System.out.println(valorPi);
        
        char c="hola".charAt(0);
        System.out.println(c);
        
        Scanner scanner=new Scanner(System.in);
        edad=Integer.parseInt(scanner.nextLine());
        System.out.println("Tu edad es "+edad);
        
        char caracter=scanner.nextLine().charAt(0);
        System.out.println(caracter);
        
        String edadTexto=String.valueOf(edad);
        System.out.println(edadTexto);
        
        short s=1280;
        byte b=(byte)s;
        System.out.println(b);
    }
}
