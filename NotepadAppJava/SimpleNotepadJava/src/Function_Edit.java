import javax.swing.JOptionPane;

public class Function_Edit {
	GUI gui;
	
	public Function_Edit(GUI gui) {
		this.gui = gui;
	}
	public void undo() {
		try {
			gui.um.undo();
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Geriye alınacak bir şey yok", "Hata", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void redo() {
		try {
			gui.um.redo();
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Geriye alınacak bir şey yok", "Hata", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
