package internet;

import java.net.*;
public class Example {
    public static void main(String args[]) {
        try{  InetAddress address_1=InetAddress.getByName("www.baidu.com");
            System.out.println(address_1.toString());
            InetAddress address_2=InetAddress.getByName("61.135.169.121");
            System.out.println(address_2.toString());
        }
        catch(UnknownHostException e) {
            System.out.println("无法找到 www.sina.com.cn");
        }
    }
}

