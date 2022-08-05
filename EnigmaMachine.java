import javax.swing.*;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import java.awt.*;
import java.awt.event.*;

public class EnigmaMachine implements ActionListener, KeyListener{

    JFrame frame;
    JTextArea orgMsg, crptMsg;
    JPanel msgPanel;
    JButton clrBtn;

    Font mono = new Font("Monospaced", Font.BOLD, 30);

    EnigmaMachine(){
        frame = new JFrame("ENIGMA MACHINE");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 750);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.BLACK);
        frame.setLayout(new FlowLayout());

        orgMsg = new JTextArea(5, 20);
        orgMsg.setBackground(Color.lightGray);
        orgMsg.setFont(mono);
        orgMsg.setLineWrap(true);
        orgMsg.setWrapStyleWord(true);
        orgMsg.setBorder(BorderFactory.createLineBorder(Color.black));

        crptMsg = new JTextArea(5, 20);
        crptMsg.setBackground(Color.lightGray);
        crptMsg.setFont(mono);
        crptMsg.setLineWrap(true);
        crptMsg.setWrapStyleWord(true);
        crptMsg.setBorder(BorderFactory.createLineBorder(Color.black));

        msgPanel = new JPanel();
        msgPanel.setBackground(Color.BLACK);
        msgPanel.setBounds(50, 250, 1000, 250);
        msgPanel.setLayout(new GridLayout(1, 2, 10, 10));
        msgPanel.add(orgMsg);
        msgPanel.add(crptMsg);

        frame.add(msgPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        EnigmaMachine enigmaMachine = new EnigmaMachine();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}