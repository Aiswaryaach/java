import java.util.*;
public class Vowels
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.print("input the string:");
String str=sc.nextLine();
System.out.print("number of vowels in the string:"+count_Vowels(str));
}
public static int count_Vowels(String str)
{
int i,count=0;
for (i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
return count;
}
}
