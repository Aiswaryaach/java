import java.util.Scanner;
public class display
{
public static void main(String args[])
{
String name,last,fullname;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first name \n");
name=sc.nextLine();
System.out.print("Enter the last name \n");
last=sc.nextLine();
fullname=name+last;
System.out.println("FULLNAME"+fullname);
}
}


