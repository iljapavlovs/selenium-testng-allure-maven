package lv.iljapavlovs.testng.constants;

import lv.iljapavlovs.testng.utils.ConfigReader;

public class Constants {
    public static final int WAIT_EXPLICIT_SEC = Integer.parseInt(!(System.getProperty("wait.explicit.seconds") == null) ? System.getProperty("wait.explicit.seconds") : ConfigReader.loadProperty("wait.explicit.seconds"));
    public static final String APP_URL = !(System.getProperty("app.url") == null) ? System.getProperty("app.url") : ConfigReader.loadProperty("app.url");

}