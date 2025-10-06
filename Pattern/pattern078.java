/*

			*  *  *  *

	 	 *	*  *  *

	  *  *  *  *

   *  *  *  *

*/


import java.util.*;

class Display
{
	public int iRow;
	public int iCol;

	public Display(int A, int B)
	{
		this.iRow = A;
		this.iCol = B;
	}

	public void DisplayPattern()
	{
		int i = 0, j = 0, k = 0;

		for(i = iRow; i >= 1; i--)
		{
			for(k = 1; k < i; k++)
			{
				System.out.print(" ");
			}

			for(j = 1; j <= iCol; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}
}

class pattern078
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);

		int iRow = 0, iCol = 0;

		System.out.println("Enter no of rows : ");
		iRow = sobj.nextInt();

		System.out.println("Enter no of columns : ");
		iCol = sobj.nextInt();

		Display dobj = new Display(iRow,iCol);

		dobj.DisplayPattern();
	}
}
