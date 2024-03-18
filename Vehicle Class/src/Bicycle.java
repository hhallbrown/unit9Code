public class Bicycle extends Vehicle{
    boolean handBrakes;
    public Bicycle(int numWheels, String color, boolean handBrakes)
    {
        super(numWheels, color);
        this.handBrakes = handBrakes;
    }
    public String toString()
    {
        return ("Bicycle with " + numWheels + " wheels that is " + color + ". Does it have hand brakes? " + handBrakes);
    }
}