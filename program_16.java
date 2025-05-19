import java.util.*;

class Display
{
    public int Summation(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(+iCnt);
        }
    }
}
class program_16
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        iRet = dobj.Summation(iValue);

       System.out.println("The summetion is "+iRet);

    }
}
