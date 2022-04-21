import java.util.*;  
import java.lang.String;
class strings
{  
public static void main(String[] args)  
{  
 String str,str1;
Scanner sc= new Scanner(System.in);
System.out.print("Enter a string: ");  
str= sc.next();
System.out.print("Enter the 2 string:");
str1=sc.next();  
System.out.println("The length of the string is:"+str.length()); 
System.out.println("Concatenation of string:"+str.concat(str1));
System.out.println("postition of the "+str.charAt(2)); 
System.out.println("index of string :"+str.indexOf('w'));
System.out.println("compare the string :"+str.compareTo(str1));
System.out.println("Upper case:"+str.toUpperCase());
System.out.println("lower case:"+str.toLowerCase());
}  
}  