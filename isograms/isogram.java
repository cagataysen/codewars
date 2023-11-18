public class isogram {
    public static boolean  isIsogram(String str) {

        char tempA;
        char tempB;
        for(int i = 0; i < str.length() - 1; i++){
            tempA = str.charAt(i);
            for(int j = i + 1; j < str.length(); j++){
                tempB = str.charAt(j);
                if(tempA == tempB){
                    return false;
                } else if (tempA == Character.toUpperCase(tempB)) {
                    return false;
                }
                else if (tempA == Character.toLowerCase(tempB)) {
                    return false;
                }
            }
        }

        return true;
    }
}