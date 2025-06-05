import java.io.*;

class Display
{
    public void DisplayEven(int iNo)
    {
        int iCnt = 0, iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + 2;
            System.out.println(iSum);
        }
    }
}
class program048
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.DisplayEven(iValue);
    }
        
}