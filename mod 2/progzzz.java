// class arth{
//     int a,b;
//     void insert(int c, int d){
//         a=c;
//         b=d;
//     }
//     int add(){
//         int add;
//         add = a+b;
//         return add;
//     }
//     public static void main(String[] args){
//         arth A1 = new arth();
//         A1.insert(4,5);
//         int result = A1.add();
//         System.out.println(result);
//     }
// }

// STudent
// class student{
//     int id = 69;
//     String name = "Omi";
// }
// class student2{
//     public static void main(String[] args){
//         student s1 = new student();
//         System.out.println(s1.id);
//         System.out.println(s1.name);
//     }
// }

// class student{
//     int id;
//     String name;
//     void insert(int i , String n){
//         id = i;
//         name = n;
//     }
//     void display(){
//         System.out.println(id + " " + name);
//     }
// }
// class test{
//     public static void main(String[] args){
//         student s1 = new student();
//         student s2 = new student();
//         s1.insert( 5 , "Omi");
//         s2.insert ( 9 , "Zuiii");
//         s1.display();
//         s2.display();
//     }
// }

// import java.util.*;
// class arth{
//     int sum(int x , int y){
//         return (x+y);
//     }
//     int sub(int x , int y){
//         return (x-y);
//     }
//     int mul(int x , int y){
//         return (x*y);
//     }
//     int div(int x , int y){
//         return (x/y);
//     }
//     int rem(int x , int y){
//         return (x%y);
//     }
// public static void main(String[] args){
//     Scanner obj = new Scanner(System.in);
//     int a , b;
//     System.out.print("Enter a: ");
//     a = obj.nextInt();
//     System.out.print("Enter b: ");
//     b = obj.nextInt();
//     arth n = new arth();
//     System.out.println(a + " + " + b + " = " + n.sum(a, b));
//     System.out.println(a + " - " + b + " = " + n.sub(a, b));
//     System.out.println(a + " x " + b + " = " + n.mul(a, b));
//     System.out.println(a + " / " + b + " = " + n.div(a, b));
//     System.out.println(a + " % " + b + " = " + n.rem(a, b));
//     }
// }

