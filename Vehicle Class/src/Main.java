public class Main {
    public static void main(String[] args) throws Exception {
        Bicycle bicycle = new Bicycle(2, "Black", true);
        System.out.println(bicycle);

        Car car = new Car(4,"red", true, true);
        System.out.println(car);

        CRV crv = new CRV(4,"silver", true, true, 2020);
        System.out.println(crv);

        Rivian rivian = new Rivian(4,"black", true, true, 2024);
        System.out.println(rivian);

        Vehicle vehicle = new Vehicle(4, "white");
        System.out.println(vehicle);
    }
}