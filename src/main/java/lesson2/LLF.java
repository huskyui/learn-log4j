package lesson2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LLF {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger("com.foo");
        logger.setLevel(Level.INFO);
        Logger childLogger = Logger.getLogger("com.foo.child");
        logger.info(logger.getLevel());
        logger.info("a");
        logger.debug("b");
        logger.warn("c");
        childLogger.info("child a");
        childLogger.debug("child b");
        childLogger.warn("child c");


    }
}
