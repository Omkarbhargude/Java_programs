import java.util.*;

class Digit
{
    public void DisplayEven(int iNo)
    {

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {

            if(( (iNo % 10) % 2 ) == 0)
            {
                System.out.println(iNo % 10);
            }
           
            iNo = iNo / 10;
        }
    }
        
    
}
class program021
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
