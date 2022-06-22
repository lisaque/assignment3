package Week11;

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

		String shape[] = {"circle", "square", "rectange", "triangle"};
		
		//create Object Frame
		JFrame frame = new JFrame("My first window");
		
		frame.setSize(500,400);
		
		//Create a Panel
		JPanel panel = new JPanel();
		
		//Set the Layout
		panel.setLayout(null);
		
		//set menu
		JMenuBar menubar = new JMenuBar();
		
		//file menu, F _ Mnemonic
		JMenu filemenu = new JMenu("File");
		filemenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(filemenu);
		
		//File-> New, N - Mnemonic
		JMenuItem newmenuitem = new JMenuItem("New", KeyEvent.VK_N);
		filemenu.add(newmenuitem);
				
		//File-> New, O - Mnemonic
		JMenuItem openmenuitem = new JMenuItem("Open", KeyEvent.VK_O);
		filemenu.add(openmenuitem);
		
		
		
		//file menu, F _ Mnemonic
		JMenu editmenu = new JMenu("Edit");
		editmenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(editmenu);
		
		
		
				
		//file menu, F _ Mnemonic
		JMenu savemenu = new JMenu("save");
		savemenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(savemenu);
		
		//add menubar to frame
		frame.setJMenuBar(menubar);
		
		
		
		//Create component from type label
		JLabel label1 = new JLabel("this is a label",JLabel.LEFT );
		label1.setForeground(Color.blue);
		label1.setBounds(20, 20, 120, 30);
		
		//Create component from type label
		JLabel label2 = new JLabel("this is a Second label",JLabel.LEFT );
		label2.setForeground(Color.red);
		label2.setBounds(20, 60, 200, 80);
				
		//Create Button
		JButton button = new JButton("Press");
		button.setBounds(220, 20, 130, 30);
		
		//Create Button
		JButton button2 = new JButton("Cancel");
		button2.setBounds(220, 50, 130, 30);
		
		//Create Text Field
		JTextField textf = new JTextField();
		textf.setBounds(220, 80, 130, 30);
		
		//Set Radio Button
		JRadioButton r1 = new JRadioButton("Rectangular");
		JRadioButton r2 = new JRadioButton("Square");
		JRadioButton r3 = new JRadioButton("Circle");
		
		//Set a Button Group
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		r1.setBounds(20, 120, 100, 30);
		r2.setBounds(120, 120, 100, 30);
		r3.setBounds(220, 120, 100, 30);
		
		JComboBox cb = new JComboBox(shape);
		cb.setBounds(20, 200, 130, 30);
		
		//add button group		
		panel.add(r1);
		panel.add(r2);
		panel.add(r3);
		
		//add component to container
		panel.add(label1);
		panel.add(label2);
		panel.add(button);
		panel.add(button2);
		panel.add(textf);
		panel.add(cb);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String r = textf.getText();
				System.out.println(r);
			
			}

		});
		
		//adding panel to frame
		frame.add(panel);
		
		//set
		frame.setVisible(true);
		
		//end program when click on close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
