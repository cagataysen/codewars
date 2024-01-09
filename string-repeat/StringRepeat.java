public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String retVal = "";
        if(repeat == 0){
            return retVal;
        }
        else{
            for(int i = 0; i < repeat; i++){
                retVal += string;
            }
        }

        return retVal;
    }
}
