package question1;

public class Main {
	public static void main(String[] args) {
		Common c=new Common();
		ThreadA ta=new ThreadA(c,"mahesh");
		ThreadB tb=new ThreadB(c,"ramukak");
		ta.start();
		tb.start();
	}

}
