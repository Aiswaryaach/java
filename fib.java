import java.util.*;
public class fib
{
public static void main(String args[])
{
int max,pre=0,next=1,i=1;
System.out.print("how many number you want in fibonnaci:");
Scanner sc=new Scanner(System.in);
max=sc.nextInt();
System.out.print("Fibonnaci series of"+max+"numbers:");
while(i<=max)
{
System.out.println(pre+"");
int sum=pre+next;
pre=next;
next=sum;
i++;
}
}
}
