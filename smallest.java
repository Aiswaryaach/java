import java.util.*;
public class smallest
{
public static void main(String args[])
{
double a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("input the first number:");
a=sc.nextDouble();
System.out.println("input the second number:");
b=sc.nextDouble();
System.out.println("input the third number:");
c=sc.nextDouble();
System.out.println("the smallest value is"+Smallest(a,b,c));
}
public static double Smallest(double a,double b,double c){
return Math.min(Math.min(a,b),c);
}
}
