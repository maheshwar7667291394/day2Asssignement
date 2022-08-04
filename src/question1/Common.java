package question1;

public class Common {
	public synchronized void fun1(String name) {
		System.out.println("welcome");
		 
			
	
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.setStackTrace(null);
		}
		System.out.println(name);

	}
	
	
}
