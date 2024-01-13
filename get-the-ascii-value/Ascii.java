public class Ascii {
    public static char getChar(int c) {
        if (c >= 0 && c <= 127) {
            return (char) c;
        }
        else {
            throw new IllegalArgumentException("Invalid ASCII value: " + c);
        }
    }
}