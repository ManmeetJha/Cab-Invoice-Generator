import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceTest {
    CabInvoiceGenerator cabInvoiceGenerator;

    @Before
    public void setUp() throws Exception {
        cabInvoiceGenerator=new CabInvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance=10.0;
        int time=100;
        double fare = cabInvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(205,fare,0);
    }

    @Test
    public void givenMultipleDistanceAndTime_ShouldReturnTotalFare() {
        Rides[] rides={new Rides(10,100),new Rides(20,200)};
        double fare=cabInvoiceGenerator.calculateTotalFare(rides);
        Assert.assertEquals(610,fare,0);

    }
}
