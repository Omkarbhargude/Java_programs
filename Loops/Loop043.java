import java.io.*;

class Display
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iCnt = 1;
        while(iCnt <= iNo)
        {
            System.out.println("*");
            iCnt++;
        }
    }

}
class program043
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Display(iValue);

    }
}