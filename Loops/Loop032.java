class program032
{
    public static void main(String A[])
    {
        int iNo = 751;
        int iDigit = 0;

        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo =  iNo / 10;
        System.out.println("Updated iNo : "+iNo);


        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo =  iNo / 10;
        System.out.println("Updated iNo : "+iNo);


        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo =  iNo / 10;
        System.out.println("Updated iNo : "+iNo);
    }
}