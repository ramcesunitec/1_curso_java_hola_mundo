
public class Primitivos {

    public static void main(String[] args) {
        byte byteVar = 127;
        System.out.println(byteVar);
        System.out.println("Bits tipo byte " + Byte.SIZE);
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);

        short shorVar = 32767;
        System.out.println(shorVar);
        System.out.println("Bits tipo short " + Short.SIZE);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
        
        int intVar=2147483647;
        System.out.println(intVar);
        System.out.println("Bits tipo int " + Integer.SIZE);
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);
        
        long longVar=9223372036854775807L;
        System.out.println(longVar);
        System.out.println("Bits tipo long " + Long.SIZE);
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);
        
        var numero=2147483648L;
        System.out.println("numero"+numero);
    }
}
