public class PowersOfTwo{
    public static long[] powersOfTwo(int n){
        long[] newArray = new long[n + 1];
        if(n == 0) {
            newArray = new long[1];
            newArray[0] = 1;
            return newArray;
        }
        else{
            newArray[0] = 1;
            for(int i = 1; i <= n; i++){
                newArray[i] = 2 * newArray[i-1];
            }
            return newArray;
        }
    }
}