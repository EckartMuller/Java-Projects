import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class TextAreaWithLineNumbers {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextAreaWithLineNumbers::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Text Area with Line Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(textArea);

        LineNumberPanel lineNumberPanel = new LineNumberPanel(textArea);
        lineNumberPanel.setFontSize(12); // Font boyutunu ayarla
        scrollPane.setRowHeaderView(lineNumberPanel);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}

class LineNumberPanel extends JPanel implements DocumentListener {
    private final JTextArea textArea;
    private Font font;

    public LineNumberPanel(JTextArea textArea) {
        this.textArea = textArea;
        textArea.getDocument().addDocumentListener(this);
        setFontSize(12); // Varsayılan font boyutu
    }

    public void setFontSize(int fontSize) {
        this.font = new Font("Monospaced", Font.PLAIN, fontSize);
        setPreferredSize(new Dimension(40, textArea.getPreferredSize().height));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(font);
        FontMetrics fontMetrics = g.getFontMetrics();
        int lineHeight = fontMetrics.getHeight();
        int startOffset = textArea.getInsets().top + fontMetrics.getAscent();

        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                int y = startOffset + i * lineHeight;
                String lineNumber = String.valueOf(i + 1);
                int stringWidth = fontMetrics.stringWidth(lineNumber);
                g.drawString(lineNumber, getWidth() - stringWidth - 5, y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        repaint();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        repaint();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        repaint();
    }
}
