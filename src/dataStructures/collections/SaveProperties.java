package dataStructures.collections;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class SaveProperties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("app.version", "1.2.0");
        props.setProperty("app.maintainer", "biet.csd");
        props.setProperty("app.org", "BIET");
        props.store(new FileWriter("./app.properties"),
                "Application Settings");
    }
}
