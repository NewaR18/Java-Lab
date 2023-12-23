import java.io.*;
import java.net.*;

public class Lab40Server{

    public static void main(String[] args) throws IOException {
        System.out.println("--SERVER--");
        System.out.println("server waiting for the clients");
        DatagramSocket socket = new DatagramSocket(999);

        byte[] receiveBuffer = new byte[1024];
        byte[] sendBuffer = new byte[1024];

        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);

            String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("From client: " + clientMessage);

            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("To client: ");
            String messageToClient = bfr.readLine();
            sendBuffer = messageToClient.getBytes();

            InetAddress address = receivePacket.getAddress();
            int port = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, address, port);
            socket.send(sendPacket);

            if (clientMessage.equalsIgnoreCase("bye")) {
                break;
            }

            receiveBuffer = new byte[1024];
            sendBuffer = new byte[1024];
        }
        socket.close();
    }
}
