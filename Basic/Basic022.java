import java.util.*;

class Digit
{
    public int CountEven(int iNo)
    {
        int iCnt = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
           
            iNo = iNo / 10;
        }
        return iCnt;
    }
        
    
}
class program022
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.CountEven(iValue1);

        System.out.println("Even digits are : "+iRet);
    }
}
