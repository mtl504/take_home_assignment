package util.ProjectName;

import java.io.File;

public class BrowserUtils {

    public static String getBaseUrl (){
        return ConfigurationReader.getProperty("baseURL");
    }

}
