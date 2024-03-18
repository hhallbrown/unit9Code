public class Vehicle{
    int numWheels;
    String color;
    public Vehicle(int numWheels, String color)
    {
        this.numWheels = numWheels;
        this.color = color;
    }
    public String toString()
    {
        return ("Vehicle with " + numWheels + " wheels that is " + color + ".");
    }
}