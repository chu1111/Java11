package Java11;
import static java.lang.System.out;
public class Class04 {
	public static void main(String args[]) {
		Compute cmp = new Compute();
		cmp.mul(3,  5);
		cmp.show();
		// Math mth = new Math(); 抽象類別無法被實體化
	}
}

abstract class Math{
	protected  int ans;
	static public void show()  // ans不是static
	{
		System.out.println("ans="+ans);
	}
	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}

class Compute extends Math{
	public void add(int a, int b) {
		ans = a + b;
	}
	public void sub(int a, int b) {
		ans = a - b;
	}
	public void mul(int a, int b) {
		ans = a * b;
	}
	public void div(int a, int b) {
		ans = a / b;
	}
}
