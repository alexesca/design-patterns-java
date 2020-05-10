package Decorator;

public class IconWindowDecorator extends WindowDecorator{
	public IconWindowDecorator(Window window) {
	 	 super(window);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Icon...");
		super.draw();
	}
	
}
