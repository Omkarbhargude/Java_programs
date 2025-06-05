import java.io.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
}
class pattern001
{
    public static void main(String A[])throws IOException
    {
        int iValue  = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Frequency : ");
        iValue = Integer.parseInt(bobj.readLine());

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }

}