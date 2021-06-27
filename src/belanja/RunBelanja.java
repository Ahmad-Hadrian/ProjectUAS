package belanja;

import javax.swing.*;

public class RunBelanja {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jFrame = new JFrame("Belanja");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new Belanja().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }


}
