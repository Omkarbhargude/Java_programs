class program025
{
    public static void main(String A[])
    {
        int iTotal = 400;
        int iObtained = 320;
        float fPercentage = 0.0f;

        fPercentage = ((float)iObtained / (float)iTotal) * 100;

        System.out.println("Percentage is : "+fPercentage);
    }
}