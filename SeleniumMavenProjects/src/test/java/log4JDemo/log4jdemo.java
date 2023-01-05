package log4JDemo;

import java.io.*;  
import java.sql.SQLException;  
import java.util.*;

import org.apache.log4j.Logger;  
  
public class log4jdemo {
  
   /* Get the class name to be printed on */  
   static Logger log = Logger.getLogger(log4jdemo.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{  
      log.debug("Hi, this is a debug message");  
      log.info("this is an info message");  
      log.debug("Hi, this is a debug message - second time");  
      
   }  
}  
