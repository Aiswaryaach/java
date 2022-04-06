import java.util.*;
public class swap
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print("input a number for A:"); 
a=sc.nextInt();
System.out.print("input a number for B:");
b=sc.nextInt();
c=a;
a=b;
b=c;
System.out.println("Number in A:" + a);
System.out.println("Number in B:" + b);
}
}