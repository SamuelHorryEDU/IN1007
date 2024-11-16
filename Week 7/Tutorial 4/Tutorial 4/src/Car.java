public class Car {
    String model;
    private int speed;
    private double miles;

    public int getSpeed(){
        return speed;
    }

    public double getMiles(){
        return miles;
    }

    public void updateSpeed(int speed){
        this.speed = speed;
    }
    public void updateMiles(int miles){
        this.miles = miles;
    }

    public Car(String model, int speed, double miles){
        this.model = model;
        this.speed = speed;
        this.miles = miles;
    }
}