import java.util.*;
class method {
    void compare(int x , int y ){
        if (x > y) System.out.println("a is greater");
        else System.out.println("b is greater");
    }
    void compare(char x , char y ){
        if (x > y) System.out.println("a is greater");
        else System.out.println("b is greater");
    }
}
class main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        method com = new method();
        int c;
        System.out.println("Enter 1 for int comparision\nEnter 2 for char comparision\nEnter 3 for string comparision");
        c= obj.nextInt();
        switch ( c ) {
            case 1:
                int a,b ;
                System.out.println("Enter a");
                a= obj.nextInt();
                System.out.println("Enter b");
                b = obj.nextInt();
                com.compare( a , b );
                break;
            case 2:
                char g,h ;
                System.out.println("Enter a");
                g= obj.nextLine();
                System.out.println("Enter b");
                h = obj.nextLine();
                com.compare( g , h );
                break;
        
            default:
                break;
        }
    }
}
