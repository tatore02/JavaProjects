import javax.swing.*;

public class Gui extends JFrame{
    private JPanel Panel1;
    private JPasswordField passwordField1;
    private JButton OKButton;
    private JLabel label1;
    private JLabel label2;
    private JButton tentativiButton;
    private JTextField textField1;


    public Gui(){
        this.setContentPane(Panel1);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1.setText("STEP 1:\nInserire parola da indovinare");
        label2.setText("STEP 2:\nInserire lettere");
        int tentativi = 5;
        tentativiButton.setText(tentativi + " tentativi");


          _____
         /     |
         |    |_|
         |   /   \
         |
        / \



    }

    public static void main(String[] args) {
        JFrame frame = new Gui();
        frame.setVisible(true);
    }

}
