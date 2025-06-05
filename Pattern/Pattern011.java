import java.io.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = -iNo; iCnt <= iNo; iCnt++) //2N
        {
            System.out.print(iCnt+ "\t"); 
        }
        System.out.println();
    }
}
class pattern011
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