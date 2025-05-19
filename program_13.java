import java.util.*;

class Display
{
    public boolean ChekEven(int iNo)
    {
        return((iNo % 2) == 0);
    }
}
class program_13
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        bRet = dobj.ChekEven(iValue);

        if(bRet == true)
        {
            System.out.println("It is Even a number");
        }
        else 
        {
            System.out.println("It is Odd number");
        }

    }
}
