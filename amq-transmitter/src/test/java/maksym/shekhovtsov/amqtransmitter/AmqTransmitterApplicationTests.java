package maksym.shekhovtsov.amqtransmitter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqTransmitterApplicationTests {

    @Autowired
    private Transmitter transmitter;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendMessage() {
        transmitter.send("lololo");
    }

}
