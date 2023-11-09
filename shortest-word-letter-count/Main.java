public class Kata {
    public static int findShort(String s) {
        String[] wordList = s.split(" ");
        int shortetsWordChar = wordList[0].length();
        for(int i = 1; i < wordList.length; i++){
            //System.out.println(wordList[i]);
            if(shortetsWordChar > wordList[i].length()){
                shortetsWordChar = wordList[i].length();
            }

        }

        return shortetsWordChar;
    }

}