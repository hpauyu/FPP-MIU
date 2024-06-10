package lab6.problem1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter extends JFrame {

    private JPanel jPanel;
    private JTextArea textAreaPound;
    private JTextArea textAreaMile;
    private JTextArea textAreaGallon;
    private JTextArea textAreaF;
    private JTextArea textAreaKm;
    private JTextArea textAreaKg;
    private JTextArea textAreaL;
    private JTextArea textAreaC;
    private JButton submitButton;

    public Converter() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Metric Conversion Assistant");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(jPanel);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double pound = Double.parseDouble(textAreaPound.getText());
                Double mile = Double.parseDouble(textAreaMile.getText());
                Double gallon = Double.parseDouble(textAreaGallon.getText());
                Double fahrenheit = Double.parseDouble(textAreaF.getText());
                textAreaKg.setText(String.valueOf(pound * 0.4535));
                textAreaKm.setText(String.valueOf(mile * 1.6));
                textAreaL.setText(String.valueOf(gallon * 3.785));
                textAreaC.setText(String.valueOf(((fahrenheit - 32) * 5) / 9));

            }
        });
    }
}
