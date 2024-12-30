import java.util.ArrayList;
import java.util.List;

class RentalAgency {
    private final List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                System.out.println("Vehicle rented: " + vehicle);
                System.out.println("Customer: " + customer);
                System.out.println("Rental cost: ₵" + vehicle.calculateRentalCost(days));
                vehicle.setAvailable(false);
                return;
            }
        }
        System.out.println("Vehicle not available for rental.");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailable()) {
                vehicle.setAvailable(true);
                System.out.println("Vehicle returned: " + vehicle);
                return;
            }
        }
        System.out.println("Vehicle not found or already available.");
    }
}
