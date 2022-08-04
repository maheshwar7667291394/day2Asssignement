package question2;

public class Main {
	public static void main(String[] args) {
		CommonClass c=new CommonClass();
		ClassA ca=new ClassA(c, "mahesh");
		ClassB cb=new ClassB(c,"Ramukakak");
		ca.start();
		cb.start();
	}
	

}
