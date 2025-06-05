import java.io.*;

class Display
{
    public void Display(int iNo1, int iNo2)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            System.out.println(iNo1);
        }
    }
}
class program046
{
    public static void main(String A[]) throws IOException
    {
        int iValue1 = 0, iValue2 = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First Number : ");
        iValue1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter second number : ");
        iValue2 = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Display(iValue1,iValue2);

    }
}