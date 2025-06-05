class ArrayDemoLoop
{
    public static void main(String A[])
    {
        int i = 0;  //counter initailization

        int Arr[] = {10,20,30,40,50}; //Creation of Array
        
        System.out.println("For loop output");  //

        for(i = 0;i < Arr.length;i++)  
        {
            System.out.println(Arr[i]);
        }

        i = 0;
        System.out.println("While loop output");

        while(i < Arr.length)
        {
            System.out.println(Arr[i]);
            i++;
        }
        i = 0;
        System.out.println("Do While loop output");

        do
        {
            System.out.println(Arr[i]);
            i++;
        }while(i < Arr.length);



    }
}