import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class GUI extends JFrame{
    private JPanel myPanel;
    private JTextPane textPane1;
    private JSlider sliderGreen;
    private JSlider sliderBlue;
    private JSlider sliderRed;
    private JLabel countRed;
    private JLabel countGreen;
    private JLabel countBlue;

    public GUI(){
        this.add(myPanel);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        textPane1.setBackground(new Color(sliderRed.getValue(),sliderGreen.getValue(),sliderBlue.getValue()));

        sliderRed.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                countRed.setText(String.valueOf(sliderRed.getValue()));
                textPane1.setBackground(new Color(sliderRed.getValue(),sliderGreen.getValue(),sliderBlue.getValue()));
            }
        });
        sliderGreen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                countGreen.setText(String.valueOf(sliderGreen.getValue()));
                textPane1.setBackground(new Color(sliderRed.getValue(),sliderGreen.getValue(),sliderBlue.getValue()));
            }
        });
        sliderBlue.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                countBlue.setText(String.valueOf(sliderBlue.getValue()));
                textPane1.setBackground(new Color(sliderRed.getValue(),sliderGreen.getValue(),sliderBlue.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new GUI();
        frame.setVisible(true);
    }
}
