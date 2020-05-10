import Command.ClearTextCommand;
import Command.TextEditor;
import Decorator.IconWindowDecorator;
import Decorator.ScrollBarWindowDecorator;
import Decorator.Window;

public class Starter {

	public static void main(String[] args) {
		Window window = new Window();
		IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
		ScrollBarWindowDecorator scrollBarWindowDecorator = new ScrollBarWindowDecorator(iconWindowDecorator);
		scrollBarWindowDecorator.draw();
	}

}
