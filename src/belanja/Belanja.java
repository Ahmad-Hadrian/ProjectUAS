package belanja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Belanja {
    private JTextField angka1;
    private JTextField angka2;
    private JTextField bayar;
    private JTextField total;
    private JTextField kembalian;
    private JButton hitungButton;
    private JButton resetButton;
    private JButton keluarButton;
    private JPanel rootPanel;


    public Belanja() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totaljumlah = Integer.parseInt(angka1.getText())  * Integer.parseInt(angka2.getText());
                total.setText(""+totaljumlah);

                int kembalianjumlah = Integer.parseInt(bayar.getText()) - Integer.parseInt(total.getText());
                kembalian.setText(""+kembalianjumlah);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angka1.setText("");
                angka2.setText("");
                bayar.setText("");
                total.setText("");
                kembalian.setText("");
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel,
                        "Terimakasih Telah Berbelanja",
                        "Selamat Datang Kembali:)",
                        JOptionPane.CLOSED_OPTION);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel,
                        "Silahkan Hitung kembali",
                        "Belanja Anda Telah Di Reset",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angka1.setText("");
                angka2.setText("");
                JOptionPane.showMessageDialog(rootPanel,
                        "isi kolom terlebih dahulu",
                        "Heyy...",
                        JOptionPane.WARNING_MESSAGE);

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }
}
