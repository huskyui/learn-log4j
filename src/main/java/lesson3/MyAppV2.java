package lesson3;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MyAppV2 {
    final static Logger logger = Logger.getLogger(MyAppV2.class);

    public static void main(String[] args) {
        DOMConfigurator.configure("multiple.xml");


        for (int i = 0; i < 1000000; i++) {

            logger.info("Entering application");
            Foo foo = new Foo();
            foo.doIt();

            logger.info("Exiting application.");
        }

    }
}
