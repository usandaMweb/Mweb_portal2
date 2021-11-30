package holders;


import org.apache.log4j.Logger;

import java.util.Properties;

public class TestVariables {
    public static final Logger logger = Logger.getLogger(DriverHolder.class);

    public String loginData;
    public String passwordData;

    public void setConfigFromPropertyFile() {
        Properties prop = new Properties();

        loginData = prop.getProperty("nikita.dereviankin@iternal.group");
        passwordData = prop.getProperty("GkqgG3K@t");

    }
}
