package lesson3;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MyAppV2 {
    final static Logger logger = Logger.getLogger(MyAppV2.class);

    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");


        logger.info("Entering application");
        Foo foo = new Foo();
        foo.doIt();

        logger.info("Exiting application.");

    }
}
