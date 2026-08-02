package selenium;

public class Main1 {

	public static void main(String[] args) {
		
		Helper h = new Helper();
		
		Driver d = h.get();
		d.start();
	}
}
