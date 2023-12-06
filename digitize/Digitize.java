
public class Digitize {

    public static int[] digitize(long n) {

        return new StringBuilder(String.valueOf(n)).reverse().chars().map(Character::getNumericValue).toArray();

        /*
        String numberString = String.valueOf(n);
        int length = numberString.length();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = Character.getNumericValue(numberString.charAt(length - i - 1));
        }

        return result;
*/

        }
    }


