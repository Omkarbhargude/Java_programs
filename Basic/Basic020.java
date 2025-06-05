import java.util.*;

class Digit
{
    public void DisplayEven(int iNo)
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
                System.out.println(+iDigit);
            }
            
            iNo = iNo / 10;
        }
    }
        
    
}
class program020
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        dobj.DisplayEven(iValue1);

    }
}
