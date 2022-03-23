import java.util.*;
public class fibonacci
{
public static void main(String args[])
{
int max=10,pre=0,next=1,i=1;
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

