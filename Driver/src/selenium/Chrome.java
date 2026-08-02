package selenium;

public class Chrome implements Driver{
	
	@Override
	public void start() {
		System.out.println("start method");
	}
	
	@Override
	public void run() {
		System.out.println("run method");
	}
}
