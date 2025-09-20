import java.util.*;
class Frequency_vowles_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,l=0,f=0,m=0;
        String a="",c="",d="",e="";
        char b,b1;
        System.out.println("Entre the sentence(Capital letters):");
        a=sc.nextLine();
        l=a.length();
        b=a.charAt(l-1);
        if(b!='!'&&b!='?'&&b!='.')
        {
           System.out.println("Incomplete Sentence"); 
        }
        else
        {
            for(i=0;i<l;i++)
            {
                b=a.charAt(i);
                if(b!=' ')
                {
                    c=c+b;
                }
                else
                {
                    m=c.length();
                    b=c.charAt(0);
                    b1=c.charAt(m-1);
                    if(b=='A'||b=='E'||b=='I'||b=='O'||b=='U'&&b1=='A'||b1=='E'||b1=='I'||b1=='O'||b1=='U')
                    {
                        f++;
                        d=d+c+"";
                    }
                    else
                    {
                        e=e+c+"";
                    }
                    c="";
                }
            }
            System.out.println("Starting and ending with vowles:"+d);
            System.out.println("Frequency="+f);
            System.out.println("Words without vowles:"+e);
        }
    }
}