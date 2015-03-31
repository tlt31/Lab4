/**
 * Created by tlt31 on 3/31/15.
 */
public class c6pc2 {

    public static void main(String[] args){

        Car timsCar = new Car(2003, "Volkswagen", 25);

        System.out.println("Tim's car is a " + timsCar.getYearModel() + " " + timsCar.getMake() + ".");
        System.out.println("Tim's car is going " + timsCar.getSpeed() + "mph.");
        System.out.println("Tim hit the accelerator");
        timsCar.accelerate();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the accelerator again.");
        timsCar.accelerate();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the accelerator again.");
        timsCar.accelerate();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the accelerator again.");
        timsCar.accelerate();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the accelerator again.");
        timsCar.accelerate();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println();
        System.out.println("Tim decided to slow down and hit the brakes");
        timsCar.brake();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the brakes again.");
        timsCar.brake();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the brakes again.");
        timsCar.brake();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the brakes again.");
        timsCar.brake();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
        System.out.println("Tim hit the brakes again.");
        timsCar.brake();
        System.out.println("The car is now going " + timsCar.getSpeed() + "mph");
    }
}
