
public class OperadoresCondicionales {

    public static void main(String[] args) {

        int a = 11;
        int valorMinimo = 0, valorMaximo = 10;

        //AND O Y &&
        boolean resultado = (a >= valorMinimo && a <= valorMaximo);
        System.out.println("resultado=" + resultado);

        //OR U O ||
        boolean vacaciones = true;
        boolean diaDeDescanso = false;
        if (vacaciones || diaDeDescanso) {
            System.out.println("El padre puede asistir al juego");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
