public class CRV extends Car{
    int year;
    public CRV(int numWheels, String color, boolean FWD, boolean reverseCamera, int year)
    {
        super(numWheels, color, FWD, reverseCamera);
        this.year = year;
    }
    public String toString()
    {
        return (year + " CRV with " + numWheels + " wheels that is " + color + ". Does it have a reverse camera? " + reverseCamera + ". Does it have FWD? " + FWD);
    }
}