public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public int getPassengers(){
        return passengers;
    }

    public void printInfo(){
        System.out.println("License Plate: " +licensePlate);
        System.out.println("Toll Fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }

    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public double getTollFee(){
        return tollFee;
    }

    public void setPassengers(int newValue){
        passengers = newValue;
    }

    public void setTollFee(double newValue){
        tollFee = newValue;
    }


}