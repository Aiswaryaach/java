import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
int n,reverse=0;
System.out.println("enter an integer to reverse");
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}
System.out.println("Reverseof the number is"+reverse);
}
}