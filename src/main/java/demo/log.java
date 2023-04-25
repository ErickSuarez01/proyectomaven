package demo;


	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;

	public class log {
		private static final  Logger LogJava= Logger.getLogger(log.class);
		
		public static String debug() {
			LogJava.debug(" mensaje de debug ");
			return null;
			
		}
		
		public static void info() {
			LogJava.info(" mensaje de info ");
		}
		public static  void warning() {
			LogJava.warn(" mensaje de warning ");
		}
		
		
		public static void  main (String[] args) {
			
			debug();
			info();
			warning();
		}

	}
