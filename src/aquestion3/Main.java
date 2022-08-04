package aquestion3;

public class Main {
	public static void main(String[] args) {
		EvenOdd even=new EvenOdd();
		Odd odd=new Odd();
		
		try {
			odd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		odd.start();
		even.start();
		
	
	}

}
