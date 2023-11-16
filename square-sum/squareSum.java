public class squareSum
{
    public static int squareSum(int[] n)
    {
        int sum = 0;
        int square = 0;
            for(int i = 0; i < n.length; i++ ) {

                square = n[i] * n[i];
                sum = sum + square;
            }

        return sum;
    }
}