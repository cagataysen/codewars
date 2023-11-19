public class Troll {
    public static String disemvowel(String str) {

        char[] vowelsList = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I' , 'O', 'U'};

        String fixedString = str;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < vowelsList.length; j++){
                if(str.charAt(i) == vowelsList[j]){
                    fixedString =  fixedString.replaceAll(String.valueOf(str.charAt(i)), "");
                }
            }

        }
        return fixedString;
    }
}


/*
public class Troll {
  public static String disemvowel(String str) {
      return str.replaceAll("[aAeEiIoOuU]", "");
  }
}
*/