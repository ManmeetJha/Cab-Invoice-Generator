public class Summary {
    public int noOfRides;
    public double totalFare;
    public double avgFare;

    public Summary(int noOfRides, double totalFare, double avgFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null || getClass()!=obj.getClass())
            return false;
        Summary that= (Summary) obj;
        return noOfRides==that.noOfRides && Double.compare(totalFare,that.totalFare)==0 && Double.compare(avgFare,that.avgFare)==0;
    }
}
