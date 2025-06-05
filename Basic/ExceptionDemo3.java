import java.util.Scanner;

class Arithematic
{
    public float Divsion(int No1 , int No2) throws ArithmeticException
    {
        float ans = No1 / No2;
        return ans;
    }
}
class ExceptionDemo3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int Value1 = sobj.nextInt();
        
        System.out.println("Enter Second number");
        int Value2 = sobj.nextInt();

        Arithematic obj = new Arithematic();
        float Ret = 0.0f;
        try
        {
          Ret = obj.Divsion(Value1,Value2);
        }
        catch(ArithmeticException obj1)
        {
            System.out.println("Inside catch");
        }
        System.out.println(+Ret);
    }
}