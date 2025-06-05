import java.io.*;

class Display
{
    public void FactRev(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = (iNo / 2); iCnt >= 1; iCnt--)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class program052
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0, iRet = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.FactRev(iValue);

    }
        
}