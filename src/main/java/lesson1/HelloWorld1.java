package lesson1;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld1 {
    private static Logger logger = Logger.getLogger(HelloWorld1.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.debug("Hello world");
    }
}
