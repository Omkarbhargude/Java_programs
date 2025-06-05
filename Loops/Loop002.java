//Iteration

class Display
{
    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("HELLO");
        }
    }
}

class program002
{
    public static void main(String A[])
    {
        Display dobj = new Display();

        dobj.Display();
    }
}
