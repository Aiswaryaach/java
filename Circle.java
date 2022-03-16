import java.util.Scanner;
public class Circle
{
public static void main(String args[])
{
Double radius;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the radius of circle");
radius=sc.nextDouble();
System.out.println("Perimeter ="+(2*radius*Math.PI));
System.out.println("Area of circle ="+(2*Math.PI*radius*radius));
}
}

