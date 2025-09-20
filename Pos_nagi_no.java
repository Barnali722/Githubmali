import java.util.*;
class Pos_nagi_no
{
      public static void main(String args[])
      {
          int a;
          Scanner in=new Scanner(System.in);
          System.out.println("Input a no. either positive or neagtive:");
          a=in.nextInt();
          if(a>0)
          {
            System.out.println("The no. is positive :"+a);
            }
            else if (a<0)
            {
               System.out.println("The no. is negative :"+a); 
            }
            else
            {
                System.out.println("The no. is whole no. and an integer:"+a);
            }
        }
}
