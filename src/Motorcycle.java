class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (hasSidecar ? 10 * days : 0);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() + ", hasSidecar=" + hasSidecar + '}';
    }
}