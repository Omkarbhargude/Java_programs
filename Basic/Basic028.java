import java.io.*;

class Display
{
    public void CalculateTicket(int Age)
    {
        if(Age < 0)
        {
            System.out.println("--ERROR-- invalid input ");
        }

        if((Age >= 0) && ( Age <= 5))
        {
            System.out.println("--FREE TICKET--");
        }
        else if((Age > 5) && (Age <= 18))
        {
            System.out.println(" -/700 ");
        }
        else if((Age > 18) && (Age <= 50))
        {
            System.out.println(" -/999 ");
        }
        else if((Age > 50))
        {
            System.out.println(" -/500 ");
        }

    }
}
class program028
{
    public static void main(String A[])throws IOException
    {
        int iAge = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your Age : ");
        iAge = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.CalculateTicket(iAge);

    }
}