package Moody;

public class test {
	public static void main(String[] args) {
		Moody mood1=new Happy();
		Moody mood2 =new Sad();
		Psychiatrist p1=new Psychiatrist();
		p1.examine(mood1);
		mood1.expressFeelings();
		p1.observe(mood1);
		p1.examine(mood2);
		mood2.expressFeelings();
		p1.observe(mood2);
	}
}
