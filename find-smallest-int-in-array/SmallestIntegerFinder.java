public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

        int smallestNumber = args[0];
        for(int i=0; i<args.length; i++ ){
            if(args[i] < smallestNumber){
                smallestNumber = args[i];
            }
        }

        return smallestNumber;
    }
}