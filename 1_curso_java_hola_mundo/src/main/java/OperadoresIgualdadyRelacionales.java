
public class OperadoresIgualdadyRelacionales {
    public static void main(String[] args) {
        int a=3;
        int b=3;
        
        boolean c=(a==b);
        System.out.println("c="+c);
        
        boolean d=(a!=b);
        System.out.println("d="+d);
        
        String cadena="hola";
        String cadena2="adios";
        System.out.println(cadena.equals(cadena2));
        
        //Relacionales
        boolean e=(a<b);
        System.out.println("e="+e);
        
        boolean f=(a>b);
        System.out.println("f="+f);
        
        boolean g=(a<=b);
        System.out.println("g="+g);
        
        boolean h=(a>=b);
        System.out.println("h="+h);
        
        //Ejercicio par o impar
        
        if(b%2==0){
            System.out.println("Es par porque es divisible entre dos");
        }else{
            System.out.println("Es impar porque no es divisible entre dos");
        }
        
        //Persona adulta
        int edad=31;
        int adulto=18;
        
        if(edad>=adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
    }
}
