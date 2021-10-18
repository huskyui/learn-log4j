package lesson2;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.IOException;

public class AppenderEx1 {
    public static void main(String[] args) throws IOException {
        FileAppender a0 = new FileAppender(new SimpleLayout(),"a0.log");
        FileAppender a1 = new FileAppender(new SimpleLayout(),"a1.log");

        Logger root = Logger.getRootLogger();
        root.addAppender(a0);

        Logger x = Logger.getLogger("x");
        x.addAppender(a1);

        Logger xyz = Logger.getLogger("x.y.z");

        // Note that we have not added any appenders to the xyz logger.
        xyz.debug("Some message");
        xyz.info("Anthor message.");




    }

}
