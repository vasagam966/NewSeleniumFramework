package org.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData {
    private static Properties properties;
    static {
        try{
            properties=new Properties();
            FileInputStream file = new FileInputStream("C:\\Users\\Qapitol\\eclipse-workspace\\FacebookDemo\\TestData.properties");
            properties.load(file);
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to load test data properties file.");
        }
    }
    public static String get(String key) {
        return properties.getProperty(key);
    }
}
