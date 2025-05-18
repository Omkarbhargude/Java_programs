import java.util.*;

class Display
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Factors are :"+iCnt);
            }
        }
    }
}
class program25
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        dobj.DisplayFactors(iValue);

    }
}

//Time complexity is O(N\2)