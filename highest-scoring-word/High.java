import java.util.HashMap;

public class High {

    public static String high(String s) {



        String[] wordList = s.toLowerCase().split(" ");

        String topScorerWord = "";
        int topScore = 0;
        int scoreOfTheWord = 0;


        for(int i = 0; i < wordList.length; i++){

            scoreOfTheWord = calculateEachWordPoint(wordList[i]);

            if (scoreOfTheWord > topScore){
                topScore = scoreOfTheWord;
                topScorerWord = wordList[i];
            }

        }

        return topScorerWord;
    }


    public static int calculateEachWordPoint(String word){

        if(word.isEmpty()){
            return 0;
        }

        HashMap<String, Integer> alphabetPoints = new HashMap<String, Integer>();

        int pointOfEachLetter = 1;
        for (char ch = 'a'; ch <= 'z'; ++ch){

            alphabetPoints.put(String.valueOf(ch), pointOfEachLetter);
            pointOfEachLetter++;

            }

        int scoreOfTheWord = 0;

        for(int i = 0; i < word.length(); i++){
            Integer letterPoint = alphabetPoints.get(String.valueOf(word.charAt(i)));
            if(letterPoint != null){
                scoreOfTheWord += letterPoint;
            }

        }

        return scoreOfTheWord;


    }

}