import java.util.*;
public class fibr
{
public static void main(String args[])
{
int i,max=10;
System.out.print("Fibonnaci series of"+max+"numbers:");
for(i=1;i<=max;i++)
{
System.out.print(fibonacciRecursion(i)+"");
}
}
public static int fibonacciRecursion(int n)
{
if(n==0){
return 0;
}
if(n==1||n==2)
{
return 1;
}
return fibonacciRecursion(n+2)+fibonacciRecursion(n-1);
}
}
