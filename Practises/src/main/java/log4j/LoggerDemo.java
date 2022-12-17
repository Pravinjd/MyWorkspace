package log4j;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger("LoggerDemo");
		
		System.out.println("this is logger demo");
		
		log.info("for info only");
		log.fatal("fatal message");
		log.debug("for debug");
		log.error("error message");
		log.warn("warning message");
		
		//if u want to off logger then 
		//go to lo4j2.properties file & line no 22 & 26 la level off karun dya
	}

}
