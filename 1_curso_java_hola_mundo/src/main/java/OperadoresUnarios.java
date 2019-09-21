
public class OperadoresUnarios {
    public static void main(String[] args) {
        
        //Inversion
        int a=3;
        int b=-a;
        System.out.println("a="+a+"\nb="+b);
        
        boolean c=true;
        boolean d=!c;
        System.out.println("c="+c+"\nd="+d);
        
        //Incremento
        //preincremento
        int e=3;
        int f=++e;
        System.out.println("e="+e+"\nf="+f);
        
        //postincremento
        int g=5;
        int h=g++;
        System.out.println("g="+g+"\nh="+h);
        
        //decremento
        //predecremento 
        int i=2;
        int j=--i;
        System.out.println("i="+i+"\nj="+j);
        
        //postdecremento 
        int k=4;
        int l=k--;
        System.out.println("k="+k+"\nl="+l);
        
        
    }
}
