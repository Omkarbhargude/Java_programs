import java.util.*;

class Digit
{
    public int Reverse(int iNo)
    {
        int iRev = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
        
    
}
class program023
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.Reverse(iValue1);

        System.out.println("Reverse digits are : "+iRet);
    }
}
