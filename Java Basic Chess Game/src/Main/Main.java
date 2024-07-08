package Main;

import java.awt.*;
import javax.swing.*;

public class Main extends  JPanel{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(new GridBagLayout());//ızgaramızı ayarladık

        //Javanın bir eklentisi olan Swing ile GUİ yani görsel bir arayüz oluşturarak satranç tahtasını tasarladık
        ////We designed the chessboard by creating a GUI, that is, a visual interface, with Swing, a Java plug-in
        frame.setMinimumSize(new Dimension(1000, 1000));//boyutunu 1000px - 1000px ayarladık
        frame.setLocationRelativeTo(null);//tahtayı ortaladım

        Board board = new Board();
        frame.add(board);//jframe içerisine tahtamınız ekledik

        frame.setVisible(true);//satranç tahtamızın görünür halde olmasını sağladık
    }
}
