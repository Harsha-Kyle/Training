import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // create socket & connect to server
            Socket socket = new Socket("localhost", 9999);
            System.out.println("Connected to server");

            // input & output streams
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));                                                         

            while (true) {
                // send message
                System.out.print("You: ");
                String msg = userInput.readLine();
                out.write(msg);
                out.newLine();   // important
                out.flush();

                if (msg.equalsIgnoreCase("exit")) {
                    break;
                }

                // receive reply
                String data = in.readLine();
                System.out.println("Server: " + data);
            }

            // close socket
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}