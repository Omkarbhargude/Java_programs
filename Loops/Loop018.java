import java.io.*;

class Display
{
    public long Factorial(int iNo)
    {
        int iCnt = 0; 
        long iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo; //Updater
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}
class program018
{
    public static void main(String A[])
    {
        int iValue = 0; long iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        try
        {
          iValue = Integer.parseInt(bobj.readLine());
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }

        Display dobj = new Display();

        iRet = dobj.Factorial(iValue);

        System.out.println("Factorial is : "+iRet);

    }
}