import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) throws IOException{
        ServerSocket socketServeur= new ServerSocket(12345);
        System.out.println("server waiting for a client to connect");
        Socket socket=socketServeur.accept();
        System.out.println("client connected");



        socket.close();
        socketServeur.close();


    }
}
