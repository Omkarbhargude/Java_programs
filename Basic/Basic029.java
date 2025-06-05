import java.io.*;

class Display
{
    public int CalculateTicket(int Age)
    {
        int iPrice = 0;
        if(Age < 0)
        {
            return -1;
        }

        if((Age >= 0) && ( Age <= 5))
        {
            iPrice = 0;
        }
        else if((Age > 5) && (Age <= 18))
        {
            iPrice = 700;
        }
        else if((Age > 18) && (Age <= 50))
        {
            iPrice = 999;
        }
        else if((Age > 50))
        {
            iPrice = 500;
        }
        return iPrice;
    }
}
class program029
{
    public static void main(String A[])throws IOException
    {
        int iAge = 0, iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your Age : ");
        iAge = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.CalculateTicket(iAge);

        if(iRet == -1)
        {
            System.out.println("Unable to proceed invalid input");
        }
        else
        {
            System.out.println("Your Ticket Price is : "+iRet);
        }

    }
}