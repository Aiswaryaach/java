class cpu{
    int price; 
    int cores;
    string manufacture;
    int memory;
    void setcpus(int_price)
    {
        price=_price;
        
  
    }
    void setprocessor (int_cores,string_manufacture)
    {
        cores=_cores;
        manufacture=_manufacture;
        
    }
    void setram(int_memory,string_manufacture)
    {
        memory=_memory;
        manufacture=_manufacture;
    }
    int getprice()
    {
        return price;
    }
    
    
String getmanufacture()
    {
        return manufacture;
    }
    
    int getcores()
    {
        return cores;
    }
    int getmemory()
    {
        return memory;
    }
   
   


    void displayComputer()
    {
        System.out.println("Computer ID: " + getprice());
        System.out.println("Processor Speed: " + getmanufacture());
        System.out.println("RAM: " + getcores());
        System.out.println("Harddisk: " + getmemory());
  
    }
}

public class computers
{
    public static void main(Strings args[])
    {
Scanner sc = new Scanner(System.in);
cpu desktop1 = new cpu();
            System.out.println("Please enter Desktop ID: ");
            desktop1.setprice (sc.nextInt());
            System.out.println("Please enter Desktop Processor Speed: ");
            desktop1.setcores (sc.nextInt());
            System.out.println("Please enter Desktop RAM: ");
            desktop1.setmanufacture (sc.nextLine());
            System.out.println("Please enter Desktop Harddisk Space: ");
            desktop1.setmemory(sc.nextInt());
       
            desktop1.displayComputer();
    
    }
}