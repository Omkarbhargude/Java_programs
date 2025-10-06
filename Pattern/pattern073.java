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
		int i = 0, j = 0;

		for(i = 1; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}
}

class pattern073
{
	public static void main(String A[])
	{
		Display dobj = new Display(4,4);

		dobj.DisplayPattern();
	}
}
