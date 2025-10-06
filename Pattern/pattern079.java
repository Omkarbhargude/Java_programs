/*

				*

			*   *   *  

		*   *   *   *   *

	*   *   *   *   *    *   *	


	// Formula used for pyramid creation is : 

		mid = 2 * i - 1 

*/


import java.util.*;

class Display
{
	public int iRow;

	public Display(int A)
	{
		this.iRow = A;
	}

	public void DisplayPattern()
	{
		int i = 0, j = 0, k = 0;

		for(i = 1; i <= iRow; i++)
		{
			// for leading spaces
			for(k = 1; k <= iRow - i; k++)
			{
				System.out.print(" ");
			}

			// prints star
			for(j = 1; j <= 2*i - 1; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}

class pattern079
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);

		int iRow = 0, iCol = 0;

		System.out.println("Enter no of rows : ");
		iRow = sobj.nextInt();

		//System.out.println("Enter no of columns : ");
		//iCol = sobj.nextInt();

		Display dobj = new Display(iRow);

		dobj.DisplayPattern();
	}
}
