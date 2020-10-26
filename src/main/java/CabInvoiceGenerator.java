public class CabInvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5.0;

    public static void main(String[] args) {
        System.out.println("Welcome to Cab invoice generator");
    }

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME + MINIMUM_FARE;
        return totalFare;
    }

    public double calculateTotalFare(Rides[] rides) {
        double totalFare = 0.0;
        for (Rides ride : rides) {
            totalFare += ride.distance * MINIMUM_COST_PER_KM + ride.time * COST_PER_TIME + MINIMUM_FARE;
        }
        return  totalFare;
    }


}
