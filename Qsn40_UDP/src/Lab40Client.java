import java.io.*;
import java.net.*;
public class Lab40Client {
    public static void main(String[] args) throws IOException {
        System.out.println("--CLIENT--");
        DatagramSocket socket = new DatagramSocket();
        byte[] receiveBuffer = new byte[1024];
        byte[] sendBuffer = new byte[1024];
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("To server: ");
            String messageToServer = bfr.readLine();
            sendBuffer = messageToServer.getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, address, 999);
            socket.send(sendPacket);
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);
            String serverMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("From server: " + serverMessage);
            if (serverMessage.equalsIgnoreCase("bye")) {
                break;
            }
            receiveBuffer = new byte[1024];
            sendBuffer = new byte[1024];
        }
        socket.close();
    }
}
