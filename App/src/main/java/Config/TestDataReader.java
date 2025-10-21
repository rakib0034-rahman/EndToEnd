package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {
    static String filePath = "/home/rakib-r/Desktop/New Folder/EndToEnd/App/src/main/java/Resources/testData.Properties";

    static {
        try {
            readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Properties properties = new Properties();

    public static void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        properties.load(fileInputStream);

    }

    public static String getusername() {
        String user = properties.getProperty("username");
        return user;
    }

    public static String password() {
        String pass = properties.getProperty("password");
        return pass;
    }


}
