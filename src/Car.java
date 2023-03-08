public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric(){
        return electric;
    }

    public boolean isDiscountApplied(){
        return discountApplied;
    }

    public void printCar(){
        System.out.println();
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + electric);
        System.out.println("Discount Applied: " + discountApplied);
    }

    public boolean dropOffPassengers(int numOut){
        int currentPassengers = getPassengers();
        if(numOut >= currentPassengers){
            return false;
        } else {
            setPassengers(currentPassengers - numOut);
            return true;
        }
    }

    public void applyDiscount(){
        if(electric == true && discountApplied == false){
            double toll = getTollFee();
            setTollFee(toll / 2);
            discountApplied = true;
        }
    }
}