package djtu.chen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hugo extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JTextArea textArea;
    JPanel panel;
    ActionListener listener;
    public Hugo(){
        panel=new JPanel();
        setLayout(new FlowLayout());
        setBackground(Color.BLUE);
        setTitle(String.valueOf("你好"));
        setBounds( 400,400,400,400);
        init();
        add(panel);
        setVisible(true);
    }
    void init(){
        button= new JButton("开始");
        textField=new JTextField(10);
        textArea=new JTextArea();

        panel.add(textArea);
        panel.add(textArea);
        button.addActionListener(listener);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("结束了");
    }
}
