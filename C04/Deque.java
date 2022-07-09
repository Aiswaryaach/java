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
  System.out.println("Pop():" +dq.pop());
System.out.println("Poll():" +dq.poll());
System.out.println("PollFirst():" +dq.pollFirst());
System.out.println("PollLast()" +dq.pollLast());
}
}
