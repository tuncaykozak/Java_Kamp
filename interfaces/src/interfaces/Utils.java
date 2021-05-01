package interfaces;

public class Utils {
	
	public static void runLOggers(Logger[] loggers, String message) {
		
		for(Logger logger : loggers) {
			logger.log(message);
			}
	}
	
	//inner classes can be "static"
	
	/*
	 * public static class bisey{
	 * 
	 * }
	 */
}
