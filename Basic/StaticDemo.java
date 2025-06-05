class Demo
{
    public int i,j; // instance variables
    public static int k; //class variable

    static
    {
        System.out.println("Inside static block");
         k = 51;

    }

    public Demo()
    {
        System.out.println("Inside constructor");
        i = 11;
        j = 21;
    }

    public void Fun()
    {
        System.out.println("Inside fun");
        System.out.println(+i);
        System.out.println(+j);
        System.out.println(+k);
    }
    public static void Gun()
    {
        System.out.println("Inside Gun");
        System.out.println(k);
    }

}


class StaticDemo
{
    public static void main(String A[])
    {
       System.out.println("Inside main");
       System.out.println(Demo.k);
       Demo.Gun();

       Demo obj1 = new Demo();
       Demo obj2 = new Demo();

      System.out.println(obj1.i);
      System.out.println(obj1.j);
      obj1.Fun();


    }
}