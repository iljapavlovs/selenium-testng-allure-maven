package lv.iljapavlovs.testng.utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String loadProperty(String name) {
        return loadProperty(name, "/config.properties");
    }

    public static String loadProperty(String name, String fromResource) {
        Properties props = new Properties();
        try {
            props.load(ConfigReader.class.getResourceAsStream(fromResource));
        } catch (IOException e) {
            System.out.println("Unable to load proeprty for file: " + fromResource);
        }
        return props.getProperty(name);
    }
}

