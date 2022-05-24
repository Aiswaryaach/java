import java.io.IOException;
import java.util.Scanner;
class MyException extends Exception
{
public MyException(String str)
{
System.out.println(str);
}
}
public class Signexception
{
public static void main(String args[])throws IOException{
System.out.println("enter number of input number::");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=0,sum=0;
Integer mynum[]=new Integer[n];
while(n>0)
{
try
{

System.out.println("enter the numbers:");
int num=sc.nextInt();
if(num<0)
throw new MyException("Number is negative");
else{
mynum[k]=num;
sum=sum+num;
k++;
}
n--;
}
catch(MyException m)
{
System.out.println(m);
}
}
System.out.println("The averge is " +sum/k);
}
}