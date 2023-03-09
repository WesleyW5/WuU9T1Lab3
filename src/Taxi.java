public class Taxi extends Car{

    private double fareCollected;



    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
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
        setPassengers(currentPassengers + numRiders);

        if(!isDiscountApplied() && getPassengers() >= 4){
            setTollFee(getTollFee()/2);
            setDiscountApplied(true);
        }

        fareCollected += (numRiders * farePerRider);
    }

    public double getFareCollected(){
        return fareCollected;
    }
}
