import java.util.*;

class Display
{
    public boolean ChekEven(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program11
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