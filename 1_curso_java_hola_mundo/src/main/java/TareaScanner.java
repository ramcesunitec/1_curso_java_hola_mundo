
import java.util.Scanner;

public class TareaScanner {

    public static void main(String[] args) {
        Scanner datosLibro = new Scanner(System.in);

        System.out.println("Libro");
        System.out.println("Proporciona el titulo del libro");
        var libro = datosLibro.nextLine();
        System.out.println("Proporciona< el autor del libro");
        var autor = datosLibro.nextLine();

        System.out.println(libro + " fue escrito por " + autor);
    }
}
