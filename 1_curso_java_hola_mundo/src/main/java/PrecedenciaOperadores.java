
public class PrecedenciaOperadores {
    public static void main(String[] args) {
        var x=5;
        var y=10;
        var z=++x+y--;
        System.out.println("z="+z+"\n(a="+x+"   y="+y+")");//x=6 y=10
        
        System.out.println("\nEjemplo 2 de procedencia de operadores");
        var resultado=4+5*6/3;
        System.out.println("resultado="+resultado);
        
        resultado=(4+5)*6/3;
        System.out.println("resultado="+resultado);
    }
}
