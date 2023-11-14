public class BetterThanAvg {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double avgOfTheClass = 0; //if this is not a double some test case can be failure.
        int sum = 0;
        for (int i=0; i <= classPoints.length - 1; i++) {
            sum += classPoints[i];
        }
        avgOfTheClass = sum / classPoints.length;

        if(yourPoints >= avgOfTheClass){return true;}
        else{return false;}
    }
}