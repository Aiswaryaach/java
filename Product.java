import java.util.Scanner;
public class Product
{
public static void main(String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
z = x*y;  
System.out.println("The product of two number "+x+" * "+y+" =" + z);  
}
}   