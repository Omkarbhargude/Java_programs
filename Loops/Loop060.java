import java.io.*;

class Display
{
    public void MultipleDisplay(int iNo)
    {
        int iCnt = 0, iMult = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            iMult = iNo * iCnt;
            System.out.print(iMult+ "\t");
        }
        System.out.println();
    }
}

class program060
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Frequency : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.MultipleDisplay(iValue);
    }
}