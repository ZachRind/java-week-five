
public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Hello World");
		asteriskLogger.Error("Opps");
		spacedLogger.Log("Hello World");
		spacedLogger.Error("Does Not Compute");
		
	}

}
