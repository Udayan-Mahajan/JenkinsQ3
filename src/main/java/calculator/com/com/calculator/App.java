package calculator.com.com.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int a, int b) {
		return a+b;
	}
	public void sub(int a, int b) {
		System.out.println(b-a);
	}
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void divide(int a, int b) {
		System.out.println(b/a);
	}
	
    public static void main( String[] args )
    {
    	App c = new App();
       int a = 10;
       int b = 20;
       System.out.println(c.sum(a,b));
       c.sub(a, b);
       c.multiply(a, b);
       c.divide(a, b);
       
       
    }
}
