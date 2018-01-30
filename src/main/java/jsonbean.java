import com.alibaba.fastjson.annotation.JSONField;

public class jsonbean {
    @JSONField(name = "HostIP")
    private String HostIP;

    @JSONField(name ="Port")
    private int Port;

    @JSONField(name = "userName")
    private String userName;

    @JSONField(name = "passWord")
    private String passWord;

    public String getHostIP() {
        return HostIP;
    }

    public void setHostIP(String hostIP) {
        this.HostIP = hostIP;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        this.Port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
