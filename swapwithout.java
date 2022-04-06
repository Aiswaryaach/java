import java.util.*;
public class swapwithout
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("input a number for A:"); 
a=sc.nextInt();
System.out.print("input a number for B:");
b=sc.nextInt();
 
System.out.println("before swapping numbers: "+a +" "+ b);   
a= a + b;   
b = a - b;   
a = a- b;   
System.out.println("After swapping: "+a +"  " + b);   
}
}