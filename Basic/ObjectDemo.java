class Demo
{
    public int i,j;

    Demo()
    {
        System.out.println("Inside constructor");
    }
}

class ObjectDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo();  //Dynamic object memory allocation

    }
}