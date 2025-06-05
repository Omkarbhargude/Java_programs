import java.util.*;

class Arithematic
{
    public int Addition(int iNo1, int iNo2)
    {
        int iAns = 0; 
        iAns = iNo1 + iNo2;
        return iAns;
    }
}
class program007
{
    public static void main(String A[])
    {
        Scanner sobj = null;
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        sobj = new Scanner(System.in);

        System.out.println("Enter First number : ");
        iValue1 = sobj.nextInt();
     
        System.out.println("Enter Second number : ");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iRet = aobj.Addition(iValue1,iValue2);

        System.out.println("Addition is : "+iRet);

    }
}