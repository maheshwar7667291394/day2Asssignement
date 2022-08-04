package aquestion3;

public class EvenOdd  extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
					}
		
	}



}
