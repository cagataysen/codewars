public class RemoveChars {
    public static String remove(String str) {
        str = "" + str.substring(1);
        str = str.substring(0, str.length() - 1);
        return str;
    }
}