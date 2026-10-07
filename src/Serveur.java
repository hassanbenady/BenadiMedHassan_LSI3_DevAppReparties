import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Serveur {
    public static void main(String[] args) throws IOException{
        ServerSocket socketServeur= new ServerSocket(12345);
        System.out.println("server waiting for a client to connect");
        Socket socket=socketServeur.accept();
        System.out.println("client connected");

        DataInputStream in= new DataInputStream(socket.getInputStream());
        DataOutputStream out= new DataOutputStream(socket.getOutputStream());
        while (true) {
            int x=in.readInt();
            if (x==0) {
                System.out.println("0 exit");
                break;
            }
            int result=x*5;
            System.out.println(result);
            out.writeInt(result);
        }


        socket.close();
        socketServeur.close();


    }
}
