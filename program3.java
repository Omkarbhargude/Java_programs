import java.util.*;

class DisplayTicket
{
    public int CalculateTicket(int iAge)
    {
        int iPrice = 0;

        if(iAge < 0)
        {
            return -1;
        }

        if((iAge >= 0) && (iAge <= 5))
        {
            iPrice = 0;
        }
        else if((iAge > 5) && (iAge <= 18))
        {
            iPrice = 700;
        }
        else if((iAge > 18) && (iAge <= 50))
        {
            iPrice = 999;
        }
        else if((iAge > 50))
        {
            iPrice = 500;
        }
        
        return iPrice;

    }
}
class program3
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age :");
        iValue = sobj.nextInt();

        DisplayTicket dobj = new DisplayTicket();

        iRet = dobj.CalculateTicket(iValue);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Ticket Price : "+iRet);
        }
    }
}