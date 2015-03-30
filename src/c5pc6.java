/**
 * Created by tlt31 on 3/30/15.
 */
public class c5pc6 {

    public static void main(String[] args){

        System.out.println(" Farenheit     Celcius");
        System.out.println("***********************");

        for(double i = 0; i < 21;){

            String str = String.format("%.2f", celsius(i));
            System.out.println("  " + i + "           " + str);
            i++;

        }
    }

    public static double celsius(double fTemp){

        double cTemp = (5.0/9.0)*(fTemp-32.00);

        return cTemp;
    }
}
