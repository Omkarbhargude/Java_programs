//I/P :- 4 , 5
/*O/P :-  4  4  4  4  4
          3  3  3  3  3
          2  2  2  2  2
          1  1  1  1  1
*/
import java.io.*;

class Display
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, k = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
              System.out.print(k+"\t");
              k++;
            }
            System.out.println();
        } 
    }
}
class pattern054
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