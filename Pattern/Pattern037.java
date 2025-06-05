import java.io.*;

class Pattern 
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i + j) > iRow)
                {
                  System.out.print("*\t");
                }
                else
                {
                    System.out.print("o\t");
                }
            }
            System.out.println();
        }

    }
}
class pattern037
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