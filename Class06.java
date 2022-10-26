package Java11;
import static java.lang.System.out;
public class Class06 {
	public static void main(String args[]) {
		Compute cmp = new Compute();
		cmp.mul(3,  5);
		cmp.show();
	}
}

interface  Math{
	
	public void show();//讓Compute實作  
	
	public  void add(int a, int b);
	public  void sub(int a, int b);
	public  void mul(int a, int b);
	public  void div(int a, int b);
}

class Compute implements Math{
	int ans;
	public void show()//不能放在Math介面
	{
		out.println("ans=" + ans);
	}
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
