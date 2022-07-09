import java.util.Scanner;
import java.util.ArrayList;
class Arraylist {
public static void main(String[] args) {
        
int i,n=5;
ArrayList<String> data = new ArrayList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
for(i=1;i <= n;i++)
{
data.add(sc.next());
}

System.out.println("List are:\n" +data); 
System.out.println("Returning element:  " +data.get(1));

System.out.println("List after insertion of :" +data.set(1,"newly inserted"));
for(String word:data)
                   System.out.println(word);

Collections.sort(data);
System.out.println("\nSorted list:");

for(String word:data)
        System.out.println(word);


           


       }
}
