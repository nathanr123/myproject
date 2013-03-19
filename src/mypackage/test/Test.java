package mypackage.test;

import javax.swing.JFrame;

public class Test extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Test() {
		
		setTitle("Testing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 500, 500);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test();
		System.out.println("Tested - OK");

	}

}
