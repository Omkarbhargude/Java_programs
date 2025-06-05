import java.util.*;

class program003
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int iNo1 = sobj.nextInt();
     
        System.out.println("Enter Second number : ");
        int iNo2 = sobj.nextInt();

        int iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);

    }
}