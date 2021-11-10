package lab4_exA;

import java.util.Locale;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.*;

public class Logging {

	public static void main(String[] args) {
		Configurator.initialize(new DefaultConfiguration());
		Configurator.setRootLevel(Level.OFF);
		Logger logger = LogManager.getLogger(Logging.class.getName());
		logger.debug("Hello, this is a debug message");
		logger.info("Hello, this is an info message");
		logger.error("Unable to process request", new Exception("Parsing error"));
		logger.info("Name: {}, Locale: {}", "Jose", Locale.UK);
	}

}
