import java.util.*;
public class Pallindrom_no
{
    int limit;
    Pallindrom_no(int nn)
    {
        limit=nn;
    }
    int reverse(int a)
    {
        if(a<10)
        {
        return a;
        }
        else
        {
        int d=a%10;
        return d*10+reverse(a/10);
        }
    }
    Boolean check(int x)
    {
        int rev=reverse(x);
        if(rev==x)
        return true;
        else
        return false;
    }
    void show()
    {
        for(int i=0;i<=limit;i++)
        if (check(i))
        {
        System.out.print(i+" , ");
        }
    }
    public static void main(String args[])
    {
        Pallindrom_no obj=new Pallindrom_no(50);
        obj.show();
    }
}
