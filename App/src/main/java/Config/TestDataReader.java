package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {
    String filePath = "/Users/alpine/Desktop/User/App/src/main/java/Resources/testData.Properties";
    Properties properties;

    public void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties= new Properties();
        properties.load(fileInputStream);
    }


    public String getProperties(String key) {
        return properties.getProperty(key);
    }


}

