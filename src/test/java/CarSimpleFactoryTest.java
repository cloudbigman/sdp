import com.sdp.create.factory.CarSimpleFactory;
import com.sdp.create.factory.ICar;
import org.junit.Test;

public class CarSimpleFactoryTest {

    @Test
    public void simpleFactory() throws Exception{
       ICar car = CarSimpleFactory.create1("upcar");
       car.start();
       car.speed();
    }


}
