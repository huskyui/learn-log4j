package lesson2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class PrintingEx {
    static Logger logger = Logger.getLogger("PrintingEx");

    public static void main(String[] args) {
        BasicConfigurator.configure();
        try {
            printArray(new int[]{0, 2});
        } catch (Exception e) {
            logger.error(e);
        }
        try {

            printArray(new int[]{111, 222});
        } catch (Exception e) {
            logger.error("Could not print integer array", e);
        }
    }

    static void printArray(int[] intArray) {
        int len = intArray.length;
        // The following line intentionally runs outside bounds.We
        // are using smaller or equal instead of a strict inequality
        for (int i = 0; i <= len; i++) {
            logger.debug("Index " + i + " contains value " + intArray[i]);
        }
    }
}
