package Old;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperty {
    static Properties prop;

    static void read() throws Exception {
        File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Files\\data.properties");

        //FileReader fr = new FileReader(file);
        InputStream input = new FileInputStream(file);

        prop = new Properties();

        prop.load(input);
    }

    static String getValue(String key) throws Exception {
        read();
        return prop.getProperty(key);
    }


}
