package com.company;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class myLoggerClass {
        private static Logger logger = Logger.getLogger(myLoggerClass.class.getName());



        public static Logger getLOGGER() {
            Handler fileHandler  =null;
            try {
                fileHandler = new FileHandler("./log.txt");
                logger.addHandler(fileHandler);
                fileHandler.setLevel(Level.ALL);
                logger.setLevel(Level.ALL);

            }catch(IOException ex){
                logger.log(Level.WARNING, "Error occur in FileHandler.", ex);
            }


            return logger;
        }
    }

