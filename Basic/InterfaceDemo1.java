import java.io.*;

interface Circle
{
    float PI = 3.14f;
    float CalculateArea(float Radius);
    float CalculateCircumference(float Radius);
}

class Marvellous implements Circle
{
    public float CalculateArea(float Radius)
    {
        float Area = 0.0f;
        Area = PI * Radius * Radius;
        return Area;
    }

    public float CalculateCircumference(float Radius)
    {
        float Circumference = 0.0f;
        Circumference = 2 * PI * Radius * Radius;
        return Circumference;
    }
}


class InterfaceDemo1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println(+Circle.PI);
        //Circle.PI = 7.81f; error due to final
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        Marvellous mobj = new Marvellous();

        System.out.println("Enter radius :");
       float Rad = Float.parseFloat(bobj.readLine());

        System.out.println("Area is :"+mobj.CalculateArea(Rad));
        System.out.println("Circumference is"+mobj.CalculateCircumference(Rad));
        

        

    }
}