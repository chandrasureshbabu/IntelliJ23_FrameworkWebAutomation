package Awesomecucus.Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

// this properties class has an argument of file path(properties file location)
 public static Properties propertyLoader(String filepath)
 {
     Properties properties=new Properties();
     // buffered reader to read the file
     // buffer reader object
     BufferedReader reader;
     try{
         //passing file path to the buffered reader
         reader=new BufferedReader(new FileReader(filepath));
         try{
             // passing buffered reader as argument to load method of properties
             properties.load(reader);
             // closing the file reader
             reader.close();
         }catch (IOException e){
                    // this Io exception in case of load the properties file
                    e.printStackTrace();
                    throw new RuntimeException("failed to load properties file "+filepath);
         }
     }catch (FileNotFoundException e)
     {
         // this Filenotexception incase of filenotfound load the properties file
         e.printStackTrace();
         throw  new RuntimeException("properties file not found at"+filepath);
     }
     return properties;

 }


}
