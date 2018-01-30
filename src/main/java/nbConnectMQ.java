import com.alibaba.fastjson.JSONReader;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class nbConnectMQ {
    public Connection nbCreateConnection() throws IOException {

        String filePath="resources/mqConn.json";
        JSONReader jsonReader=new JSONReader(new FileReader(filePath));
        jsonbean jsonstr=jsonReader.readObject(jsonbean.class);

        ConnectionFactory connectionFactory=new ConnectionFactory();
        connectionFactory.setHost(jsonstr.getHostIP());
        connectionFactory.setPort(jsonstr.getPort());
        connectionFactory.setUsername(jsonstr.getUserName());
        connectionFactory.setPassword(jsonstr.getPassWord());

        Connection connection= null;
        try {
            connection = connectionFactory.newConnection();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return  connection;
    }
}
