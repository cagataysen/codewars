public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int total = 0;

        for(int elements: array){
            total += elements;
        }

        if(total % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }

    }
}