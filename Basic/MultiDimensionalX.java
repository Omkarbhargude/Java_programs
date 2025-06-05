class MultiDimensionalX
{
    public static void main(String A[])
    {
       int Arr[] = new int[5]; //1D Array

       int Brr[][] = new int[3][4]; // 2D Array

       int Crr[][] = new int[4][];  // jagged array
       Crr[0] = new int[5];
       Crr[1] = new int[4];
       Crr[2] = new int[5];
       Crr[3] = new int[2];

       System.out.println(Crr.length);
       System.out.println(Crr[0].length);
       System.out.println(Crr[1].length);
       System.out.println(Crr[2].length);
       System.out.println(Crr[3].length);

    }
}