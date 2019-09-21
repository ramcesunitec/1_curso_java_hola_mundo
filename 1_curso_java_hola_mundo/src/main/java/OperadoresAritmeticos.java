
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 8, b = 5;
        int resultado = a + b;

        System.out.println("resultado suma= " + resultado);
        System.out.println("resultado suma= " + (a + b));

        resultado = a - b;
        System.out.println("resultado resta= " + resultado);
        System.out.println("resultado resta= " + (a - b));

        resultado = a * b;
        System.out.println("resultado multiplicacion= " + resultado);
        System.out.println("resultado multiplicacion= " + (a * b));

        resultado = a / b;
        System.out.println("resultado division= " + resultado);
        System.out.println("resultado division= " + (a / b));

        double c = a, d = b;
        double resultado2 = c / d;
        System.out.println("resultado division 2= " + resultado2);
        resultado2 = 8D / b;
        System.out.println(resultado2);

        resultado = a % b;
        System.out.println("Operador de modulo= " + resultado);
        System.out.println("Operador de modulo= " + (a % b));
        
        //A es par o impar
        resultado=a%2;
        System.out.println(resultado);
        
        if(resultado==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
            
    }
}
