class Demo
{
    public int Addition(int A, int B)
    {  return A + B; }
    public int Addition(int A, int B, int C)
    { return A+B+C;}
    public double Addition(double A, double B)
    { return A+B; }
}

class MethodOverLoading
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        
        System.out.println(dobj.Addition(10,10));
        System.out.println(dobj.Addition(10,11,20));
        System.out.println(dobj.Addition(10.90,11.56));
    }

}