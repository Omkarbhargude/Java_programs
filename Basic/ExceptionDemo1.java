import java.util.Scanner;

class ExceptionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int no1 = sobj.nextInt();

        System.out.println("Enter Second number");
        int no2 = sobj.nextInt();

        int Ans = 0; 
        Ans = no1 / no2;

      System.out.println("Devision is "+Ans);

    }

}