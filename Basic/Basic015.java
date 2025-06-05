import java.util.*;

class Digit
{
    public int CountDigit(int iNo)
    {
        int iCnt = 0, iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
        
    
}
class program015
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.CountDigit(iValue1);

        System.out.println(+iRet);

    }
}
