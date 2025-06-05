//I/P :- 4 , 4
/*O/P :-  1  2  3  4  5
         -1 -2 -3 -4 -5
          1  2  3  4  5
         -1 -2 -3 -4 -5
          1  2  3  4  5
*/
import java.io.*;

class Display
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, k = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, k = -1; j <= iCol; j++,k--)
            {
                if((i % 2) == 0)
                {
                    System.out.print(k+"\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        } 
    }
}
class pattern057
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