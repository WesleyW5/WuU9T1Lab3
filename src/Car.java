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

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Electric? " + electric);
        System.out.println("Discount applied? " + discountApplied);
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

    public double calculateTollPrice(){
        if(getPassengers() > 4){
            return getTollFee() * 4;
        } else {
            return super.calculateTollPrice();
        }
    }
}