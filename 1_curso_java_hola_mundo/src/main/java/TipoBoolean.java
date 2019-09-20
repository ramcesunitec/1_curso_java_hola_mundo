
public class TipoBoolean {
    public static void main(String[] args) {
        System.out.println("True con boolean "+Boolean.TRUE);
        System.out.println("True con boolean "+Boolean.FALSE);
        
        boolean booleanVar=false;
        
        if(booleanVar==true){
            System.out.println("El valor es verdadero");
        }else{
            System.out.println("El valor es falso");
        }
        
        
        var edad=30;
        var esadulto= edad>=18;
        System.out.println(esadulto);
    }
}
