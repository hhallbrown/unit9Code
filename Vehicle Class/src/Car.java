public class Car extends Vehicle{
    boolean FWD;
    boolean reverseCamera;
    public Car(int numWheels, String color, boolean FWD, boolean reverseCamera)
    {
        super(numWheels, color);
        this.FWD = FWD;
        this.reverseCamera = reverseCamera;
    }
    public String toString()
    {
        return ("Car with " + numWheels + " wheels that is " + color + ". Does it have a reverse camera? " + reverseCamera + ". Does it have FWD? " + FWD);
    }
}