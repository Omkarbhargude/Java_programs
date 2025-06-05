interface Demo
{
    void Fun();
}

interface Hello extends Demo
{
    void Gun();
}

class Marvellous implements Hello
{
    public void Fun()
    {
        System.out.println("Inside fun");
    }
    public void Gun()
    {
        System.out.println("Inside gun");
    }
    public void Diaplay()
    {
        System.out.println("Inside display");
    }
}


class InterfaceDemo3
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        mobj.Fun();
        mobj.Gun();
        mobj.Diaplay();
    }
}