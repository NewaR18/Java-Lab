import java.net.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException, Exception {
        URL url1 = new URL("https://www.w3schools.com/java/default.asp");
        URI uri = new URI("https://www.geeksforgeeks.org/url-class-java-examples/");
        URL url = uri.toURL();
        System.out.println("Using URL\n" + url1.toString());
        System.out.println("Protocol: " + url1.getProtocol());
        System.out.println("Hostname: " + url1.getHost());
        System.out.println("Default Port: " + url1.getDefaultPort());
        System.out.println("\nUsing URI\n" + url.toString());
        System.out.println("Path: " + url.getPath());
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("\nReading Directly from URL");
        HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        System.out.println(content.toString());
        System.out.println("\nReading from a URLConnection");
        HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
        conn1.setRequestMethod("GET");
        conn1.setConnectTimeout(5000);
        conn1.setReadTimeout(5000);
        int responseCode = conn1.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in1 = new BufferedReader(new InputStreamReader(conn1.getInputStream()));
            String inputLine1;
            StringBuilder content1 = new StringBuilder();
            while ((inputLine1 = in1.readLine()) != null) {
                content1.append(inputLine1);
            }
            in1.close();
            System.out.println(content1.toString());
        } else {
            System.out.println("Failed to get webpage: " + responseCode);
        }
        System.out.println("\nDemonstration of InetAddress class");
        String host = "www.w3schools.com";
        InetAddress addr = InetAddress.getByName(host);
        System.out.println("Host name: " + addr.getHostName());
        System.out.println("IP address: " + addr.getHostAddress());
    }
}