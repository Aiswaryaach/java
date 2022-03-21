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
System.out.print("The result is:"+Sumoftwo(x,y,z));
Public static Boolean Sumoftwo(int p,int q,int r)
{
return((p+q)==r||(q+r)==p||(r+p)==q);
}
}