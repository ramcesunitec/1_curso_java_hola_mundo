
public class NumerosFlotantes {

    public static void main(String[] args) {
        float floatvar = 100.10f;
        System.out.println(floatvar);
        System.out.println("Bits en float " + Float.SIZE);
        System.out.println("Valor minimo Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo Float: " + Float.MAX_VALUE);

        Double doublevar = 10000.10;
        System.out.println(doublevar);
        System.out.println("Bits en double " + Double.SIZE);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    }
}
