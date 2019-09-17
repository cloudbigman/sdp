import com.sdp.create.builder.*;
import org.junit.Test;

//Junit单元测试
//引入junit.jar
//注解开发
public class BuilderTest {
    @Test
    public void builder() throws  Exception{
        //强耦合-硬编码(封装)
        //Builder builder = new ConcreteBuilderA();
        Builder builder = BuilderFactory.createBuilder("builder");
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.getPartA()+"," +
              product.getPartB()+"," + product.getPartC());

    }

}
