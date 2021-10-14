package lesson2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerRepository;

public class HWT {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        // create logger x
        Logger x = Logger.getLogger("foo.bar");
        // set logger level info
        x.setLevel(Level.INFO);

        // get the containing repository
        LoggerRepository respository = x.getLoggerRepository();
        // set the hierarchy-wide threshold to warn effectively disabling
        // all INFO and DEBUG requests.
        respository.setThreshold(Level.WARN);
        // this request will be dropped because the hierarchy-wide
        // threshold is set to warn even if the logger x is enabled for
        // the info level.
        x.info("dropped message");

        // now ,let us disable all levels.this will turn off logging
        // entirely,i.e. nothing will ever log.
        respository.setThreshold(Level.OFF);

        // this fatal level request will be dropped because all levels are turned off.
        x.fatal("this is a serious message but it will also be dropped.");

        respository.setThreshold(Level.ALL);
        // this request will be logged because the hierarchy-wide
        // threshold is set to ALL and the logger x is enabled for the INFO level
        x.info("Hello world");

        // the logger-level filter will cause the following request to be dropped.
        // Indeed,the logger level is higher than the request level(DEBUG).
        x.debug("Remember : DEBUG < INFO");















    }
}
