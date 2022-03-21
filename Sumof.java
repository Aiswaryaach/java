import java.util.Scanner;
public class Sumof
{
public static void main(String args[])
{

int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sum of digits");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}