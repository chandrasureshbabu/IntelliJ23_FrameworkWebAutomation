package Awesomecucus.Utils;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    // properties variable
    private  static ConfigLoader configLoader;
    // static variable of configloader
    // if the constructor is priavte then that class can instantiate the class
    private ConfigLoader()
    {
        // calling from property loader method from propertyUtils class in this class constructor
        properties=PropertyUtils.propertyLoader("C:\\Users\\chand\\IdeaProjectsFrameworks\\Framework\\src\\test\\resources\\config.properties");
    }

    public static ConfigLoader getInstance(){
        // this method returns the instance of this class
        // this checks the  if the config loader instance , if no instance , th en only it  will instantiate the new one
        if(configLoader==null){
            configLoader= new ConfigLoader();
        }
        return configLoader;
    }
    public String getBaseUrl(){
        // this method reads the keys of properties file, if not null then return prop or else throw exception
        String prop= properties.getProperty("baseurl");
        if (prop!=null) return prop;
        else throw new RuntimeException("Property base url is not specified in the stg_config.properties file");
    }
}
