public class reversedStrings {

    public static String solution(String str) {
        String reversedWord = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reversedWord = reversedWord + str.charAt(i);
        }
        
        return reversedWord;
    }
}

/////////////////////STRING BUILDER APPROACH FOR FASTER SOLUTION
//    public static String solution(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
