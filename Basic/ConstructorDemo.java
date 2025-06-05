class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Inside default constructor");
        this.i = 0;
        this.j = 0;
    }
    public Demo(int a, int b)
    {
        System.out.println("Inside parametrised constructor");
        this.i = a;
        this.j = b;
    }
    
    protected void finalize()
    {
       System.out.println("inside finalize method");
    }
}

class ConstructorDemo
{
    public static void main(String A[])
    {
        Demo obj1 = new Demo();
        Demo obj2 =  new Demo(22,11);
        
        obj1 = null;
        obj2 = null;
        System.gc();

        

    }
}