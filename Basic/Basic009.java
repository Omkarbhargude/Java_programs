import java.util.*;

class Number
{
    public boolean CheckEven(int iNo)
    {
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
class program009
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Number aobj = new Number();

        bRet = aobj.CheckEven(iValue1);

        if(bRet == true)
        {
            System.out.println("It is Even ");
        }
        else
        {
            System.out.println("It is not Even");
        }

    }
}