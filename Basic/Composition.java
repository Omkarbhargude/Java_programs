final class Demo
{
    public int i = 11;

    public void fun()
    {
        System.out.println("Inside fun of Demo");
    }
}
class Hello
{
    public Demo dobj;
    public int a = 10;

    Hello()
    {
      Demo dobj = new Demo();
    }
}

class Composition
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        hobj.dobj.fun();

    }
}