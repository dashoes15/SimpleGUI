import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class Main {
    private JLabel label1;
    private JLabel label2;
    private int val;
    private int changes;
    public Main(){



        JFrame frame = new JFrame("Simple GUI");
        //name shows up on GUI window

        frame.setSize(600, 400);
        //dimensions in pixels

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Shuts down the program when the user closes the GUI window

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        //Determines how from the edge of the frame the panel will start
        //Measured in pixels
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        //Or  panel.setLayout(newGridLayout(rows, cols, hgap, vgap);
        //Creates a grid format that allows for button organization
        //hgap and vgap allow for spacing between buttons
        frame.add(panel);

        label1 = new JLabel("Value: 0");
        label2 = new JLabel("Number of changes: ");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        // Can choose, left, right, center, etc.
        panel.add(label1);
        panel.add(label2);

        JButton button1 = new JButton("-1");
        JButton button2 = new JButton("+1");
        panel.add(button1);
        panel.add(button2);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b1Press();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b2Press();
            }
        });




        frame.setVisible(true);
        //Without this, no window will appear
        //This should be called after all buttons, labels, and other components have been added
    }

    public static void main(String[] args) {
        new Main();

    }

    public void b1Press(){
        val--;
        changes++;
        label1.setText("Value: " + val);
        label2.setText("Number of changes: " + changes);
    }
    public void b2Press(){
        val++;
        changes++;
        label1.setText("Value: " + val);
        label2.setText("Number of changes: " + changes);
    }
}