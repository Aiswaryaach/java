import java.util.*;
public class prime
{
public static void main(String args[])
{
int i,count,m,n;
System.out.println("Enter a 2 limit");
Scanner sc =new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
System.out.println("prime number between "+m+" to "+n+" are");
for(int j=m;j<+n;j++)
{
count=0;
for(i=1;i<=j;i++)
{
if(j%i==0)
{
count++;
}
}
if(count==2)
System.out.print(j+" ");
}
}
}

