import java.util.*;
class complex
{
int real,img;
complex(int real,int img)
{
this.real=real;
this.img=img;
}
void display()
{
System.out.println("Complex number="+this.real+"+"+this.img+"i");
}
public static complex add(complex n1,complex n2)
{
complex num=new complex(0,0);
num.real=n1.real + n2.real;
num.img=n1.img +n2.img;
return num;
}
public static void main(String args[])
{
complex[] c=new complex[2];
Scanner sc=new Scanner(System.in);
int c_real,c_img;
for(int i=0;i<2;i++)
{
System.out.print("complex no" + (i+1) + "Real:");
c_real=sc.nextInt();
System.out.print("complex no" + (i+1) + "Img:");
c_img=sc.nextInt();
c[i]=new complex(c_real,c_img);
}
complex num =add(c[0],c[1]);
System.out.println("After addition result is:");
num.display();
}
}
