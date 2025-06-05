//I/P :- 3 , 4
/*O/P :- A  A  A  A
         B  B  B  B
         C  C  C  C
*/
import java.io.*;

class Display
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1,ch = 'A'; i <= iRow; i++,ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
              System.out.print(ch+"\t");
            }
            System.out.println();
        } 
    }
}
class pattern052
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