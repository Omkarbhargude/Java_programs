import java.io.*;

class Display
{
    public void Factors(int iNo)
    {
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class program022
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Factors(iValue);
    }
}