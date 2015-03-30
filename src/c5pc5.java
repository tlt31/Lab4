/**
 * Created by tlt31 on 3/30/15.
 */
public class c5pc5 {

    public static void main(String[] args){

        for(int i = 1; i < 11;){
            double distanceFallen = fallingDistance(i);
            String str = String.format("%.2f", distanceFallen);
            System.out.println("Given " + i + " seconds, an object will fall "+ str + " feet.");
            i++;
        }

    }

    public static double fallingDistance(double fallingTime){
        double distance;

        distance = .5*9.8*(fallingTime*fallingTime);

        return distance;

    }
}
