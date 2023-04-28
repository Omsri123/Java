import java.util.Scanner;
// class practice {
//     public static void main(String[] args){
//         Scanner obj = new Scanner(System.in);
//         int n=obj.nextInt();
//         if (n > 0)
//             System.out.println("Positive number");
//         else
//             System.out.println("negative number");
//     }
// }

// 

// class week{
//     public static void main(String[] args){
//         Scanner obj = new Scanner(System.in);
//         int a = obj.nextInt();
//         switch(a)
//         {
//             case 1:
//                 System.out.println("sunday");
//                 break;
//             case 2:
//                 System.out.println("monday");
//                 break;
//             case 3:
//                 System.out.println("tuesday");
//                 break;
//         }
//     }
// }

// class mul{
//     public static void main(String[] args){
//         Scanner obj = new Scanner(System.in);
//         int a = obj.nextInt();
//         for (int i = 1; i <= 10 ; i++){
//             System.out.println( a + " x " + i + "= " + a*i );
//         }
//     }
// }

// class CharArithmetic {
//     public static void main(String args[]) {
//     Scanner obj = new Scanner(System.in);
//     System.out.println("enter a");
//     char a = obj.next().charAt(0);
//     // int i = Character.getNumericValue(a);
//     int i = (int)a ;
//     System.out.println(i);
//     }
//    }

// class Stat
// {
// static{
// System.out.println("The code resides here is called as static block code.");
// }
// void test()
// {
// System.out.println("Non-static method");
// }
// }
// class StaticDemo
// {
// static int x;
// static void test1()
// {
// System.out.println("Static method");
// }
// public static void main(String[] args)
// {
// x=10;
// System.out.println("x="+x);
// test1();
// Stat ob = new Stat();
// ob.test();
// }
// }

// class SortNames
// {
// public static void main(String args[])
// {
// int k=args.length;
// System.out.println(k);
// String temp=new String();
// String names[]=new String[k+1];
// for(int i=0; i<k; i++)
// {
// names[i]=args[i];
// }
// for(int i=0;i<k;i++)
// for(int j=i+1;j<k;j++)
// {
// if(names[j].compareTo(names[i])<0)
// {
// temp=names[i];
// names[i]=names[j];
// names[j]=temp;
// }
// }
// System.out.println("Sorted order is");
// for(int i=0;i<k;i++)
// {
// System.out.println(names[i]);
// }
//  }
// }

