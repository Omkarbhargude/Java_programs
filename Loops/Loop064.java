import java.io.*;

class Display
{
    public void RevTable(int iNo)
    {
        int iCnt = 0, iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 10; iCnt >= 1; iCnt--)
        {
            iSum = iCnt * iNo;
            System.out.print(iSum+ "\t");
        }
        System.out.println();
    }
}

class program064
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.RevTable(iValue);

    }
}