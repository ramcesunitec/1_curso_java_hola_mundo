
public class CharyPalabras {
    public static void main(String[] args) {
        System.out.println("Bits en char " + Character.SIZE);
        System.out.println("Bytes en char "+Character.BYTES);
        System.out.println("Valor minimo char: " + Character.MIN_VALUE);
        System.out.println("Valor maximo char: " + Character.MAX_VALUE);
        
        char charVar='a';
        System.out.println("varChar "+charVar);
        
        char unicode='\u0021';
        System.out.println(unicode);
        
        char varCharDecimal=33;
        System.out.println(varCharDecimal);
        
        char varCharSimbolo='!';
        System.out.println(varCharSimbolo);
        
        
    }
}

