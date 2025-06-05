//I/P :- 5
//O/P :- 2  4  6  8  10  12  14  16



import java.io.*;

class Display
{
    public void Display(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + 2;
            System.out.print(iSum+"\t");
        } 
        System.out.println();
    }
}
class pattern044
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Display(iValue);
    }
}