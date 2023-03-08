public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck(){
        System.out.println();
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Number of Axles: " + axles);
        System.out.println("Has Trailer? " + hasTrailer);
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
}