import java.io.*;

class Display
{
    public void Table(int iNo)
    {
        int iCnt = 0, iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iSum = iCnt * iNo;
            System.out.print(iSum+ "\t");
        }
        System.out.println();
    }
}

class program063
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Table(iValue);

    }
}