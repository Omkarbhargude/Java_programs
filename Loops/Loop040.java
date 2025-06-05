class Display
{
    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 5; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
class program040
{
    public static void main(String A[])
    {
        Display dobj = new Display();

        dobj.Display();

    }
}