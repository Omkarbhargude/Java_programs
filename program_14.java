import java.util.*;

class Display
{
    public boolean ChekDivisible(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program_14
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        bRet = dobj.ChekDivisible(iValue);

        if(bRet == true)
        {
            System.out.println("It is divisible by "+iValue);
        }
        else 
        {
            System.out.println("It cannot divisible by "+iValue);
        }

    }
}
