package gong;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MySocket {
    Socket socket;
    String mess = "how are you";
    DataInputStream in = null;
    DataOutputStream out = null;

    public void WoSocket() {
        try {
            socket = new Socket("127.0.0.1", 9090);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(mess);
            String s = in.readUTF();
            System.out.println("receive:"+s);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
