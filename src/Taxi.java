public class Taxi extends Car{

    private double fareCollected;



    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
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

    public boolean chargeAndDropOffRiders(double farePerRider){
        int currentRiders = getPassengers() - 1;
        fareCollected += currentRiders * farePerRider;

       return dropOffPassengers(currentRiders);
    }
}
