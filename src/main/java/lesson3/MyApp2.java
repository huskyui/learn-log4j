package lesson3;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyApp2 {
    final static Logger logger = Logger.getLogger(MyApp2.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("sample0.properties");


        logger.info("Entering application");
        Foo foo = new Foo();
        foo.doIt();

        logger.info("Exiting application.");

    }

}
