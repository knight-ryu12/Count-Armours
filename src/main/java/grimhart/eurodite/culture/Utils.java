package grimhart.eurodite.culture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import grimhart.eurodite.culture.Reference;

public class Utils {

	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return logger;
	}
}
