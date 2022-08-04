package question2;

public class ClassB extends Thread{
	@Override
	public void run() {
		c.fun1(name);
	}
	CommonClass c;
	String name;
	public ClassB(CommonClass c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	

}
