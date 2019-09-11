import com.sdp.create.factory.CarSimpleFactory;
import com.sdp.create.factory.ICar;
import org.junit.Test;

public class CarSimpleFactoryTest {

    @Test
    public void simpleFactory(){
       ICar car = CarSimpleFactory.create("UpCar");
       car.start();
       car.speed();
    }


}
