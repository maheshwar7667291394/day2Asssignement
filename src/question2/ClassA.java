package question2;

public class ClassA extends Thread{
	CommonClass c;
	String name;
	public ClassA(CommonClass c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	@Override
	public void run() {
		c.fun1(name);
	}
	
	
	

}
