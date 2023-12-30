public class rentalCarExample {
    public static int rentalCarCost(int d) {

        if(d > 2 && 7 > d){
            return (d * 40) - 20;
        }
        else if(d == 7 || d > 7){
            return (d * 40) - 50;
        }
        else {
            return d * 40;
        }
    }
}
