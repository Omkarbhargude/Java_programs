class Division
{
    public int Divide(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 / iNo2;
        return iAns;
    }
}
class program038
{
    public static void main(String A[])
    {
        int iValue1 = 15, iValue2 = 5;
        int iRet = 0;

        Division dobj = new Division();

        iRet = dobj.Divide(iValue1,iValue2);

        System.out.println("Division is : "+iRet);
    }
}