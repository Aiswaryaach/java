import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeop
{
public static void main(String args[])
{
int i,n=3;

Deque<String>dq=new ArrayDeque<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
for(i=1;i <= n;i++)
{
dq.add(sc.next());
}
System.out.println("Strings are:\n" +dq);
}
}