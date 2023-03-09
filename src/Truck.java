public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Number of Axles: " + axles);
        System.out.println("has trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate(){
        if(hasTrailer == true && axles > 4){
            return(getLicensePlate().indexOf("MX") == getLicensePlate().length() - 2);
        } else if(hasTrailer == true && axles <= 4){
            return(getLicensePlate().indexOf("LX") == getLicensePlate().length() - 2);
        } else {
            return true;
        }
    }

    public double calculateTollPrice(){
        double tollPrice = getTollFee() * axles;
        if(!hasTrailer){
            return tollPrice;
        } else {
            return tollPrice * 2;
        }
    }
}