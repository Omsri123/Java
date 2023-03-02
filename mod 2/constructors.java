public class constructors {
    int a,b;
    constructors (int c, int d)
    {
        a=c;
        b=d;
    }
    
}
class cls{
    public static void main(String[] args){
        constructors obj = new constructors(5,6);
        System.out.println( "a is " + obj.a + " b is "+  obj.b );
    }
}
