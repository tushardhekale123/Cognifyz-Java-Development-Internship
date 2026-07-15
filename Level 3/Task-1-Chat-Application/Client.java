import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server!");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {
                System.out.print("Client: ");
                msg = keyboard.readLine();
                out.println(msg);

                if (msg.equalsIgnoreCase("exit"))
                    break;

                String reply = in.readLine();
                System.out.println("Server: " + reply);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}