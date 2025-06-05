import java.io.*;

class Display
{
    public int MultFact(int iNo)
    {
        int iCnt = 0, iMult = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}
class program051
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0, iRet = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.MultFact(iValue);

        System.out.println("Multiplication of Factors is : "+iRet);
    }
        
}