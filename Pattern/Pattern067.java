//I/P :- 4 , 4
/*O/P :- 1  2  3  4
            2  3  4
               3  4
                  4
*/
import java.io.*;

class Display
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i <= j)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        } 
    }
}
class pattern067
{
    public static void main(String A[])throws IOException
    {
        int iValue1 = 0, iValue2 = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number of Rows : ");
        iValue1 = Integer.parseInt(bobj.readLine());

        System.out.println("Enter number of columns : ");
        iValue2 = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Display(iValue1,iValue2);
    }
}