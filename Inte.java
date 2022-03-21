import java.util.Scanner;
public class Inte
{
public static void main(String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.print("input the first number:");
x=sc.nextInt();
System.out.print("input the second number:");
y=sc.nextInt();
System.out.print("input the third number:");
z=sc.nextInt();
System.out.print("The result is: "+sumoftwo(x,y,z));
}
public static boolean sumoftwo(int p, int q, int r)
{
return((p+q)==r||(q+r)==p||(r+p)==q);
}
}