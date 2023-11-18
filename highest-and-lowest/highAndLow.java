import com.sun.jdi.IntegerValue;

public class highAndLow {
    public static String highAndLow(String numbers) {

        String array[] = numbers.split(" ");
        Integer intArray[] = new Integer[array.length];



        for(int a = 0; a < array.length; a++) {
            intArray[a] = Integer.valueOf(array[a]);
        }
        int highest = intArray[0];
        int lowest = intArray[0];

        for(int i = 0; i < intArray.length; i++) {
                if(intArray[i] > highest){
                    highest = intArray[i];
            }
                else if(intArray[i] < lowest) {
                    lowest = intArray[i];
                }
        }

        return String.valueOf(highest) + " " + String.valueOf(lowest);
    }
}