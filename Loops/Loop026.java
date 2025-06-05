import java.io.*;

class Display
{
    public void DisplayFactorsNonFactor(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
                
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Factors : "+iCnt);
            }
            else
            {
                System.out.println("Non Factors : "+iCnt);
            }
        }
    }
}
class program026
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.DisplayFactorsNonFactor(iValue);
    }
}