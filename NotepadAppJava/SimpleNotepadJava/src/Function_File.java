import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Function_File {

    GUI gui;
    String fileName;
    String fileAdress;
    int new_count = 0;

    public Function_File(GUI gui) {
        this.gui = gui;
    }

    public void newFile() {
        gui.textArea.setText("");
        new_count++;
        gui.window.setTitle("New " + new_count + " - notePAD");
        fileName = null;
        fileAdress = null;
    }

    public void open() {
        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        new_count = 0;
        fd.setVisible(true);

        if (fd.getFile() != null) {
        	
	            fileName = fd.getFile();
	            fileAdress = fd.getDirectory();
	            gui.window.setTitle(fileName + " - notePAD");
            
	            try {
	                BufferedReader br = new BufferedReader(new FileReader(fileAdress + fileName));
	                gui.textArea.setText("");
	                String line = null;
	                while ((line = br.readLine()) != null) {
	                    gui.textArea.append(line + "\n");
	                }
	                br.close();
	
	            } 
	            catch (Exception e) {
	            	JOptionPane.showMessageDialog(null, "Dosya açılamadı", "File Error", JOptionPane.ERROR_MESSAGE);
	            }
        }
        
        
       }

        

    public void save() {
        if (fileName == null) {
            saveAs();
        } else {
            try {
                FileWriter fWriter = new FileWriter(fileAdress + fileName);
                fWriter.write(gui.textArea.getText());
                gui.window.setTitle(fileName);

                fWriter.close();
            } catch (Exception e) {
            	JOptionPane.showMessageDialog(null, "Dosya farklı kaydedilemedi", "File SaveAs Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void saveAs() {
        FileDialog fd = new FileDialog(gui.window, "Save", FileDialog.SAVE);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileAdress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try {
            FileWriter fWriter = new FileWriter(fileAdress + fileName);
            fWriter.write(gui.textArea.getText());
            fWriter.close();
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Dosya kaydedilemedi", "File Save Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void exit() {
    	System.exit(0);
    }

}
