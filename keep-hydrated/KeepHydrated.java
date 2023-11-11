import com.sun.jdi.IntegerValue;

public class KeepHydrated  {

    public int Liters(double time)  {
        int roundedTime = 0;
        roundedTime = (int)Math.floor(time);

        return roundedTime / 2;
    }

}