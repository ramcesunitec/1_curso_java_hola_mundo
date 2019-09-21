
public class OperadorTernario {
    public static void main(String[] args) {
        //var resultado=(expresion)?true:false;
        var resultado=(3>2)?true:false;
        System.out.println("resultado="+resultado);
        
        var otro=(3<2)?"cierto":"no cierto";
        System.out.println("otro="+otro);
        
        var numero=16;
        var par=(numero%2==0)?"numero par":"numero impar";
        System.out.println("par="+par);
    }
 
}
