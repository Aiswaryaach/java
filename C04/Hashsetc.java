import java.util.HashSet;
import java.util.Scanner;

public class Hashsetc
{
public static void main(String args[])
{
int i,n=5;

HashSet<Integer> hs1=new HashSet<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the firsthashset");
for(i=1;i <= n;i++)
{
hs1.add(sc.nextInt());
}
System.out.println("firsthash set:" +hs1);

//second hashset

HashSet<Integer> hs2=new HashSet<Integer>();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the second hashset");
for(i=1;i <= n;i++)
{
hs2.add(sc1.nextInt());
}
System.out.println("second hash set:" +hs2);



}
}