package dataStructures.collections;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class LoadConfiguration {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        // Absolute Path -> Root Dir, Relative Path -> Curr Dir
        props.load(new FileReader(
                "./application.properties"));
        String dbUrl = props.getProperty("db.url");
        System.out.println("DB URL: " + dbUrl);
        String serverPort = props.getProperty("server.port");
        System.out.println("Port Number: " + serverPort);
    }
}
