import java.util.Scanner;

public class Sentencias_Control_If {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
                                            
        System.out.println("Apellido Paterno:");
        String apellidop=scanner.nextLine();
        char ap1=apellidop.charAt(0);
        char ap2=apellidop.charAt(1);
        
        System.out.println("Apellido Materno: ");
        char am=scanner.nextLine().charAt(0);
        
        System.out.println("Nombre: ");
        char n=scanner.nextLine().charAt(0);
        
        System.out.println("Año de nacimiento: ");
        String ana=scanner.nextLine();
        char anac1=ana.charAt(2);
        char anac2=ana.charAt(3);
        
        System.out.println("Mes de nacimiento(En numero, en caso de un numero colocar antes un 0): ");
        String mes=scanner.nextLine();
        
        System.out.println("Dia de nacimiento(En caso de un numero colocar antes un 0): ");
        String dia=scanner.nextLine();
        
        System.out.println("CURP: "+ap1+ap2+am+n+anac1+anac2+mes+dia);
    }                     
}
