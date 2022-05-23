import java.util.Scanner;
import java.util.ArrayList;
class Arraylist {
public static void main(String[] args) {
        
int i,n=3;
ArrayList<String> data = new ArrayList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
for(i=1;i <= n;i++)
{
data.add(sc.next());
}

System.out.println("strings are:\n" +data);  

System.out.println("Size of the string \n" +data.size());

System.out.println("Returning element:  " +data.get(1));

data.remove(0);
System.out.println("removing string\n" +data);

System.out.println("after removing string:   \n" +data.get(0));
System.out.println(data.get(1));



data.clear();
        System.out.println("clear " +data);


           


       }
}
