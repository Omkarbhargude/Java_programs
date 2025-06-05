import java.io.*;

class Display
{
    public int Factorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}
class program016
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
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