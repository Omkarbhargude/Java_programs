import java.io.*;

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0', ch2 = '\0';

        for(i = 1,ch = 'a',ch2 = 'A'; i <= iRow; i++,ch++,ch2++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i % 2) == 0)
                {
                  System.out.print(ch2+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }
            }
            System.out.println();
        }

    }
}
class pattern027
{
    public static void main(String A[])throws IOException
    {
        int iValue1 = 0, iValue2 = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number of Rows : ");
        iValue1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter number of columns : ");
        iValue2 = Integer.parseInt(bobj.readLine());

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}