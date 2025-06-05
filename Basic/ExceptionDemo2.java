import java.util.Scanner;

class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int no1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int no2 = sobj.nextInt();

        int Ans = 0; 
        try
        {
          System.out.println("Inside try block");
          Ans = no1 / no2;
          System.out.println("Devision is successfully executed");
        }
        catch(ArithmeticException obj) //specific catch block
        {
          System.out.println("Inside catch :"+obj);

        }
        catch(Exception eobj) // generic catch block
        {
          System.out.println("Inside generic catch block");
        }
        finally
        {
          System.out.println("Inside finally");
        }

      System.out.println("Devision is "+Ans);

    }

}