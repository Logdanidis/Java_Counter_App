
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;

public class Buttons extends JFrame{

    private JButton button1;
    private JButton button2;

    TextField counter = new TextField(12);
    int number_process = 0;

    public Buttons()
    {
        super("Counter App"); 
        setLayout(new FlowLayout());

        //add button1

        button1 = new JButton("Process");
        button1.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        //button1.setFocusable(false); This delete selector
        button1.setToolTipText("Push me and start counter");

        button1.addActionListener(new EnableButton());
        add(button1);
        add(counter);

        //add button2

        button2 = new JButton("Ops...!!");
        button2.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        //button2.setFocusable(false); This delete selector
        button2.setToolTipText("Push me for reset counter");

        button2.addActionListener(new resetButton());
        add(button2);
        //add(counter); Don't need use cz exist already
    }

    public class EnableButton implements ActionListener
    {
        //button1 ActionListener

        public void actionPerformed(ActionEvent e)
        {
            number_process++;
            counter.setText("Pushed: " + number_process + " times");
        }
    }

    public class resetButton implements ActionListener
    {
        //button2 ActionListener

        public void actionPerformed(ActionEvent e)
        {
            number_process = 0;
            counter.setText("Pushed: " + number_process + " reset");
        }
    }

}
