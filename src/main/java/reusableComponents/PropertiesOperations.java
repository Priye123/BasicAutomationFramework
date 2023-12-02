package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations {

    public static String getValueofkey(String key) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties props = new Properties();
        props.load(fis);
        return props.getProperty(key);
    }
}
