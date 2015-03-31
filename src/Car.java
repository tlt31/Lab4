/**
 * Created by tlt31 on 3/31/15.
 */
public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car(int cyearModel, String cmake, int cspeed ){
        yearModel = cyearModel;
        make = cmake;
        speed = cspeed;
    }

    public void setYearModel(int cyearModel){
        yearModel = cyearModel;
    }

    public void setMake(String cmake){
        make = cmake;
    }

    public void setSpeed(int cspeed){
        speed = cspeed;
    }

    public void accelerate(){
        speed = getSpeed() + 5;
    }

    public void brake(){
        speed = getSpeed() - 5;
    }

    public int getYearModel(){
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }
}
