import java.util.*;
class Recursion_1
{
    int fac(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else
        {
            return(n*fac(n-1));
        }
    }
    public static void main(String args[])
    {
             int i,k,p,u=0;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a factorize value :");
             k=sc.nextInt();
             Recursion_1 ob=new Recursion_1();
             for(i=0;i<k;i++)
             {
               u=k-1;  
             }
             p=ob.fac(k);
             System.out.println(u);
             System.out.println("Factorial of"+k+"="+p);
    }
}

