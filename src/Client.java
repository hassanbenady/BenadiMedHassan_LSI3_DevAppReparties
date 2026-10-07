import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;


public class Client {
    public static void main (String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("im connected");

        Scanner scanner= new Scanner(System.in);
        OutputStream os= socket.getOutputStream();
        DataOutputStream out= new DataOutputStream(socket.getOutputStream());
        DataInputStream in= new DataInputStream(socket.getInputStream());

            System.out.println("Connected to the server.");

            while (true) {
                System.out.print("Enter a number (0 to exit): ");
                int x=scanner.nextInt();
                out.writeInt(x);
                if (x==0) {
                    System.out.println("Closing the connection.");
                    break;
                }
                int result=in.readInt();
                System.out.println(x +"*5 = "+result);
            }
            socket.close();
        }
    }
