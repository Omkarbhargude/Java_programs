import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int iCnt  = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(+iCnt);
            }
        }
    }
    
}
class program010
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Number aobj = new Number();

        aobj.DisplayFactors(iValue1);

    }
}
