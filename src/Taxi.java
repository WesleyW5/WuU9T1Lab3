public class Taxi extends Car{

    private double fareCollected;
    private boolean discountApplied;


    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
        this.discountApplied = false;
    }

    public void printTaxi(){
        System.out.println();
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount Applied: " + isDiscountApplied());
        System.out.println(fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        int currentPassengers = getPassengers();
        setPassengers(currentPassengers += numRiders);
        if(currentPassengers >= 4){
            farePerRider /= 2;
            discountApplied = true;
        }
        applyDiscount();
        fareCollected += currentPassengers * farePerRider;
    }

    public double getFareCollected(){
        return fareCollected;
    }
}
