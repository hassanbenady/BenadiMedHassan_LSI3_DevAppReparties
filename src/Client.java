import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main (String[] args) throws IOException{
        Socket socket = new Socket("localhost",12345);
        System.out.println("im connected");

        socket.close();

    }
}
