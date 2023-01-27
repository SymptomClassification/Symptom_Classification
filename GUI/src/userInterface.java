

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userInterface implements ActionListener {

    public JFrame menuFrame = new JFrame();

    public JPanel gamePanel = new JPanel();
    public JPanel menuPanel = new JPanel(new GridBagLayout());

    public JButton start = new JButton("Start");
    public JButton exit = new JButton("Exit");

    public JLabel title = new JLabel("MY APP");

    public Font buttonsFont=new Font("Digital-7 mono",Font.BOLD,25);
    //to give a specific text style,size
    public GridBagConstraints a = new GridBagConstraints();
    // this line of code above, allow me to align the title and the buttons in rows and columns
    public userInterface() {

        menuFrame.setTitle("MY APP");
        menuFrame.setBackground(Color.darkGray);
        menuFrame.setBounds(100,200,1200,600);

        a.insets=new Insets(30,30,30,30);
        //set the general distance between components

        a.gridy=1;
        //vertically aligns the component
        title.setFont(new Font("Algerian", Font.BOLD, 66));
        menuPanel.add(title,a);

        a.gridy=2;
        setButtonsStyle(start);
        menuPanel.add(start,a);

        a.gridy=3;
        setButtonsStyle(exit);
        menuPanel.add(exit,a);

        gamePanel.add( menuPanel );
        menuFrame.add(gamePanel);
        menuFrame.setContentPane(gamePanel);

        menuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menuFrame.setUndecorated(true);
        //with this two line of codes above, the game frame turn to full screen
        //without the taskbar
        menuFrame.setVisible(true);
    }
    public void setButtonsStyle (JButton button){
        button.setFont(buttonsFont);
        button.setBackground(Color.darkGray);
        button.setForeground(Color.white);
        button.setPreferredSize(new Dimension(200,60));
        button.addActionListener(this);
        button.setEnabled(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start) {
            // open the next window, after clicking on the "START"
        }
        if(e.getSource()==exit){
            // exit the whole game, end the program after clicking on the "EXIT"
            menuFrame.dispose();
        }
    }

}


