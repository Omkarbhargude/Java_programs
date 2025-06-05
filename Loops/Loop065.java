import java.io.*;

class Display
{
    public void DisplayPattern(int iNo)
    {
        int iCnt = 0, iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }
        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            System.out.print("$\t");
        }
        System.out.println();
    }
}

class program065
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.DisplayPattern(iValue);

    }
}