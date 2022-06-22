package MissedWeeks;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class guiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String shape[]={"Round","Pentagon", "Rectangular"};
		
		//Create Object Frame
		JFrame frame = new JFrame("My Frist Window");
		frame.setSize(400, 500);
		
		//Create a Panel
		JPanel panel = new JPanel();
		//Reset the layaout
		panel.setLayout(null);
		
		// Set Menu
		JMenuBar menuBar = new JMenuBar();
		
		// File Menu, F - Mnemonic
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		
     	// File->New, N - Mnemonic
        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
		fileMenu.add(newMenuItem);

		// File->New, N - Mnemonic
        JMenuItem openMenuItem = new JMenuItem("Open File", KeyEvent.VK_O);
		fileMenu.add(openMenuItem);

		// Edit Menu, F - Mnemonic
		JMenu editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_E);
		menuBar.add(editMenu);
		
		// Source Menu, F - Mnemonic
		JMenu sourceMenu = new JMenu("Source");
		sourceMenu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(sourceMenu);
		
		//Add mennubare to the frame
		frame.setJMenuBar(menuBar);

		//Create component from type label
		JLabel label1 = new JLabel("This is a test Lable", JLabel.LEFT );
		label1.setForeground(Color.blue);
		label1.setBounds(20, 20, 120, 30);
		
		//Create component from type label
		JLabel label2 = new JLabel("This is my second Lable", JLabel.LEFT );
		label2.setForeground(Color.red);
		label2.setBounds(20, 60, 200, 80);
		
		// Create a Button 
		JButton btn = new JButton("Press"); 
        btn.setBounds(220, 20, 130, 30);
        
        // Create a Button 
     	JButton btn2 = new JButton("Cancel"); 
        btn2.setBounds(220, 50, 130, 30);
        
        // Create a text field 
        JTextField tf = new JTextField(); 
        tf.setBounds(220, 80, 130, 30);
        
        //Set a Radio buttons
        JRadioButton r1=new JRadioButton("Rectangular");  
        JRadioButton r2=new JRadioButton("Square");  
        JRadioButton r3=new JRadioButton("Round");

        //Set a Button Group
        ButtonGroup bg=new ButtonGroup();  
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        r1.setBounds(20, 120, 100, 30);
        r2.setBounds(120, 120, 100, 30);
        r3.setBounds(220, 120, 100, 30);

        //Set a drop down list
        JComboBox cb=new JComboBox(shape); 
        cb.setBounds(20, 150, 100, 30);

        
        
        //Add the Radio Button Group
        panel.add(r1); panel.add(r2);panel.add(r3);

        
	    //Add component to the container
		panel.add(label1);
		panel.add(label2);
		panel.add(btn);
		panel.add(btn2);
		panel.add(tf);
		panel.add(cb);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			     String r = tf.getText();
			     System.out.println(r);
			    
			     System.out.println(r2);
				 //StatusLable.setText("Cancel Button is clicked");
			     //StatusLable.setBounds(100,120,150, 25);
			     //panel.add(StatusLable);
			}
		});

		
		//adding panel to my frame
		frame.add(panel);

		//End program when click on close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set Visible
		frame.setVisible(true);
		
	}
}

