import java.io.IOException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class appRun {
    private final static String QUEUE_NAME="Hello";

    public static void main(String[] args) throws IOException {
        Connection connectMQ=new nbConnectMQ().nbCreateConnection();
        Channel nbchannel=connectMQ.createChannel();
        String Message="Hello world";
        nbchannel.basicPublish("", QUEUE_NAME, null, Message.getBytes());
        System.out.println("Sended Message");
        connectMQ.close();
    }
}
