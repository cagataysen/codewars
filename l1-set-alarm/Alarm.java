public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && vacation){
            return false;
        }
        else if(employed && !vacation){
            return true;
        }
        else if(!employed && vacation){
            return false;
        }
        else if(employed && !vacation){
            return false;
        }
        else{
            return false;
        }
    }

}