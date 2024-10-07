public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {

        String firstPart = "(" + String.valueOf(numbers[0]) + String.valueOf(numbers[1]) + String.valueOf(numbers[2]) + ") ";
        String secondPart = String.valueOf(numbers[3]) + String.valueOf(numbers[4]) + String.valueOf(numbers[5]) + "-" + String.valueOf(numbers[6]) + String.valueOf(numbers[7]) + String.valueOf(numbers[8]) + String.valueOf(numbers[9]);

        return firstPart + secondPart;

    }
}
