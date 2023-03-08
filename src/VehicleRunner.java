
public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
//        Vehicle vehicle = new Vehicle("MC56WQ", 10.75, 5);
//        System.out.println(vehicle.calculateTollPrice());
//
//
//        // b. write code to create an electric Car with license "KXN73F",
//        //    toll fee of 8.50, and 2 passengers.
//        //    Print out the calculated toll price
//        Car car = new Car("KXN73F", 8.50, 2, true);
//        System.out.println(car.calculateTollPrice());
//
//
//        // c. add a printCar() void method to the Car class that prints the
//        //    Car's license plate, toll fee, number of passengers, whether it is electric,
//        //    and whether a discount has been applied.
//        //    Add getter methods as necessary to the Vehicle superclass.
//        //
//        // d. call the method on the Car you made in b to test it.
//        car.printCar();
//
//
//        Truck truck = new Truck("3K9JMX", 24.75,4,6,true);
//        // e. write code to create a Truck with license "3K9JMX",
//        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
//        //    Print out the calculated toll price
//        System.out.println(truck.calculateTollPrice());
//
//
//
//        // f. add a printTruck() void method to the Truck class that prints the
//        //    Truck's license plate, toll fee, number of passengers, number of axles,
//        //    and whether it has a trailer.
//        //    Add getter methods as necessary to the Vehicle superclass.
//        //
//        // g. call the method on the Truck you made in e to test it.
//        truck.printTruck();
//
//


        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
//        Taxi taxi = new Taxi("8KM23Z", 9.25, 3, true, 5);
//        System.out.println(taxi.getLicensePlate());
//        System.out.println(taxi.getTollFee());
//        System.out.println(taxi.getPassengers());
//        System.out.println(taxi.calculateTollPrice());
//        System.out.println(taxi.isElectric());
//        System.out.println(taxi.isDiscountApplied());
//
//        taxi.printTaxi();
//        System.out.println();
//
//        System.out.println(taxi instanceof Taxi);
//        System.out.println(taxi instanceof Car);
//        System.out.println(taxi instanceof Vehicle);
//
//
//        // ------------ LAB PART 3 ---------------
//        // ----- instructions in lab sheet -------

        System.out.println("--------- TEST 1 ---------");
        System.out.println("---- non-electric Taxi ---");
        System.out.println("--------------------------");
        Taxi testTaxi1 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
        testTaxi1.applyDiscount();
        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi1.getTollFee());
        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
        System.out.println("total passengers: " + testTaxi1.getPassengers());
        testTaxi1.pickupRiders(2, 3.75);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi1.getTollFee());
        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
        System.out.println("total passengers: " + testTaxi1.getPassengers());
        testTaxi1.pickupRiders(2, 5.90);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi1.getTollFee());
        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
        System.out.println("total passengers: " + testTaxi1.getPassengers());
        testTaxi1.pickupRiders(3, 3.40);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi1.getTollFee());
        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
        System.out.println("total passengers: " + testTaxi1.getPassengers());

        System.out.println("\n--------- TEST 2 ---------");
        System.out.println("----- electric Taxi ------");
        System.out.println("--------------------------");
        Taxi testTaxi2 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
        testTaxi2.applyDiscount();
        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());
        testTaxi2.pickupRiders(2, 3.7);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());
        testTaxi2.pickupRiders(2, 4.75);
        System.out.println("-----------");
        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
        System.out.println("toll fee: " + testTaxi2.getTollFee());
        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
        System.out.println("total passengers: " + testTaxi2.getPassengers());


    }
}