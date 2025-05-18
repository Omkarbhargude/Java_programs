import java.util.*;

class Display
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.println(+iCnt);
        }
    }
}
class program9
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequency :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        dobj.Display(iValue);

    }
}