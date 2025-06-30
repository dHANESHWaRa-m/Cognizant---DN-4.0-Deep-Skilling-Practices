package Logging_Error_Messages_and_Warning_Levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an ERROR message. Something critical went wrong!");

        logger.warn("This is a WARNING message. Pay attention to this.");

        logger.info("This is an INFO message. Application is running normally.");

        logger.debug("This is a DEBUG message. Detailed operation step.");

        logger.trace("This is a TRACE message. Very detailed execution flow.");

        System.out.println("Logging messages sent. Check your console output.");
    }
}
