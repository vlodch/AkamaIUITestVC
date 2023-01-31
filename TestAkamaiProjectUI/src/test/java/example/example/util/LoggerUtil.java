package example.example.util;

import example.example.listeners.LogListener;
import org.apache.log4j.Logger;

/**
 * The Class has all Logging related utilities.
 *
 * @author vchukhna
 */
public class LoggerUtil {

	private static Logger logger = Logger.getLogger(LogListener.class);

	public static void log(String message) {
		logger.info(message);
	}

	public static Logger getLogger() {
		return logger;
	}
}
