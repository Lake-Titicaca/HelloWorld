package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AServer {
    String mess="hello,world!";
    DataInputStream dataInputStream=null;
    DataOutputStream dataOutputStream=null;
    ServerSocket serverSocket=null;
    Socket socket=null;
    public void MyServer(){
        try {
            serverSocket = new ServerSocket(9090);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
            socket = serverSocket.accept();
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Server has been run");
            String s = dataInputStream.readUTF();
            System.out.println(s);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
