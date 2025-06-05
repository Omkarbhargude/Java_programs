import java.io.*;

class Display
{
    public void DisplayEvenFactor(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo/ 2); iCnt++)
        {
            if(((iNo % iCnt) == 0) && (iCnt % 2 )== 0)
            System.out.println(iCnt);
        }
    }
}
class program049
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.DisplayEvenFactor(iValue);
    }
        
}