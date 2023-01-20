import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel myPanel;
    private JLabel title;

    private boolean player1Turn;

    public Gui(){
        this.setContentPane(myPanel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        TicTacToe tris = new TicTacToe();



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("X");

            }
        });




    }

    public void firstTurn() throws InterruptedException {
        Thread.sleep(2000);

        Random random = new Random();
        if(random.nextInt(2) == 0){
            player1Turn = true;
            title.setText("Turno di X");
        }
        else{
            player1Turn = false;
            title.setText("Turno di Y");
        }
    }
}
