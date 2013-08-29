package Swing;

import javax.swing.*;

public class SwingDemo {
	SwingDemo()
	{
		JFrame jfrm = new JFrame("A simple swing appl");
		
		jfrm.setSize(100,100);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlab=new JLabel("Swing means powerful gui's");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{new SwingDemo();
			}
		}
		);
	}
}
