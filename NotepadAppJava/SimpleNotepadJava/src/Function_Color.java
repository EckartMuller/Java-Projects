import java.awt.Color;

public class Function_Color {
	GUI gui;
	
	public Function_Color(GUI gui) {
		this.gui = gui;
	}
	
	public void changeColor(String color) {
		switch(color) {
		case "White":
			gui.textArea.setBackground(Color.WHITE);
			gui.textArea.setForeground(Color.black);
		break;
		
		case "Black":
			gui.textArea.setBackground(new Color(171,171,171));
			gui.textArea.setForeground(Color.white);
		break;
		
		case "Blue":
			gui.textArea.setBackground(new Color(191,245,245));
			gui.textArea.setForeground(Color.BLACK);
		break;
		case "Red":
			gui.textArea.setBackground(new Color(252, 162, 162));
			gui.textArea.setForeground(Color.white);
		break;
		}
	}
}
