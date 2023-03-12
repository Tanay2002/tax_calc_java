import java.util.*;
public class assignment2
{
    long calculateTax(String name,long income)
    {
        long tax;

        if(income<100000)
        {
            return 0;
        }
        else if(income>=100000 && income<300000)
        {
            tax=income*10/100;
            return tax;
        }
        else
        {
            tax=income*20/100;
            return tax;
        }
    }
    public static void main(String[] args)
    {
        int n;
        assignment2 ob=new assignment2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total person count:");
        n=sc.nextInt();
        String name[]=new String[n];
        long incomes[]=new long[n];
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("Enter name "+(i+1)+" :");
            name[i]=sc.next();
            System.out.println("Enter "+name[i]+"'s Annual income:\n");
            incomes[i]=sc.nextLong();
        }
        System.out.println("Names with liable taxes  ");
        System.out.println("- - - - - - - - - - - -");
        for(int i=0;i<=n-1;i++)
        {
            long tax;
            tax=ob.calculateTax(name[i],incomes[i]);
            System.out.println(name[i]+": \u20B9 "+tax);
        }
    }
}
