public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();


        agency.addVehicle(new Car("C1", "Toyota Camry", 50, true));
        agency.addVehicle(new Motorcycle("M1", "Harley Davidson", 30, true));
        agency.addVehicle(new Truck("T1", "Volvo Truck", 100, 1500));


        Customer customer = new Customer("CU1", "Chris Opoku");

        // Renting vehicles
        agency.rentVehicle("C1", customer, 3);

        // Returning a vehicle
        agency.returnVehicle("C1");
    }
}
