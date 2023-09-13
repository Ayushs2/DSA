import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends  JFrame implements ActionListener {
    JTextField s;
    JButton b;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        s = new JTextField();
        b = new JButton("Convert");
        b.addActionListener(this);
        s.setPreferredSize(new Dimension(250,40));
        s.setCaretColor(new Color(193, 210, 143));
        this.add(b);
        this.add(s);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            s.getText();
        }

    }
}
