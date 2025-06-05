class Arithematic
{
    public int No1,No2;

    Arithematic()
    {
        No1 = 0;
        No2 = 0;
    }

    Arithematic(int a,int b)
    {
        No1 = a;
        No2 = b;
    }

    int Addition()
    {
        int Ans = 0;
        Ans  =  No1 + No2;
        return Ans;
    }
}

class Marvellous
{
    public static void main(String A[])
    {
        Arithematic aobj =  new Arithematic(11,10);
        int Ret = 0;

        Ret = aobj.Addition();

        System.out.println("Addition is :"+Ret);
    }
}