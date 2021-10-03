/****************************************************************/
/*                      Calculator	                        */
/*                  by Yiannis Tsentas                          */
/*						2008									*/
/****************************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * I am so bored so I have to do something to pass my time.
 * Let's create a simple calculator in java!
 */
public class Calculator extends JFrame
{
	// Variables declaration
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JButton jButtonClear;
	private JButton jButton0;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private JButton jButton7;
	private JButton jButton8;
	private JButton jButton9;
	private JButton jButtonMinus;
	private JButton jButtonPlus;
	private JButton jButtonMul;
	private JButton jButtonDiv;
	private JButton jButtonEqual;
	private JButton jButtonDot;
	private JButton jButtonBack;
	
	private String result = "";
	private Double memory = 0.0;
	private boolean dot = false;
	private int operation = 0;
	private boolean clearScreen = false;
	private boolean equalPressed = false;
	private boolean once = false;
	private boolean clearView = false;

	private JPanel contentPane;
	// End of variables declaration


	public Calculator()
	{
		super();
		initializeComponent();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void initializeComponent()
	{
		jLabel1 = new JLabel();
		jTextField1 = new JTextField();
		jButtonClear = new JButton();
		jButton0 = new JButton();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();
		jButton5 = new JButton();
		jButton6 = new JButton();
		jButton7 = new JButton();
		jButton8 = new JButton();
		jButton9 = new JButton();
		jButtonMinus = new JButton();
		jButtonPlus = new JButton();
		jButtonMul = new JButton();
		jButtonDiv = new JButton();
		jButtonDot = new JButton();
		jButtonEqual = new JButton();
		jButtonBack = new JButton();

		contentPane = (JPanel)this.getContentPane();

		//
		// jLabel1
		//
		jLabel1.setText("Yiannis Tsentas, Copyright 2008");
		//
		// jTextField1
		//
		jTextField1.setText("");
		jTextField1.setHorizontalAlignment(SwingConstants.TRAILING);
		//jTextField1.setEnabled(false);
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		//
		// jButtonClear
		//
		jButtonClear.setText("Clear");
		jButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonClear_actionPerformed(e);
			}

		});
		//
		// jButtonBack
		//
		jButtonBack.setText("Backspace");
		jButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonBack_actionPerformed(e);
			}

		});
		//
		// jButton0
		//
		jButton0.setText("0");
		jButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton0_actionPerformed(e);
			}

		});
		//
		// jButton1
		//
		jButton1.setText("1");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});
		//
		// jButton2
		//
		jButton2.setText("2");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton2_actionPerformed(e);
			}

		});
		//
		// jButton3
		//
		jButton3.setText("3");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton3_actionPerformed(e);
			}

		});
		//
		// jButton4
		//
		jButton4.setText("4");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton4_actionPerformed(e);
			}

		});
		//
		// jButton5
		//
		jButton5.setText("5");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton5_actionPerformed(e);
			}

		});
		//
		// jButton6
		//
		jButton6.setText("6");
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton6_actionPerformed(e);
			}

		});		
		//
		// jButton7
		//
		jButton7.setText("7");
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton7_actionPerformed(e);
			}

		});
		//
		// jButton8
		//
		jButton8.setText("8");
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton8_actionPerformed(e);
			}

		});
		//
		// jButton9
		//
		jButton9.setText("9");
		jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton9_actionPerformed(e);
			}

		});		
		//
		// jButtonMinus
		//
		jButtonMinus.setText("-");
		jButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonMinus_actionPerformed(e);
			}

		});
		//
		// jButtonPlus
		//
		jButtonPlus.setText("+");
		jButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonPlus_actionPerformed(e);
			}

		});
		//
		// jButtonMul
		//
		jButtonMul.setText("*");
		jButtonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonMul_actionPerformed(e);
			}

		});
		//
		// jButtonDiv
		//
		jButtonDiv.setText("/");
		jButtonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonDiv_actionPerformed(e);
			}

		});		
		//
		// jButtonDot
		//
		jButtonDot.setText(".");
		jButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonDot_actionPerformed(e);
			}

		});
		//
		// jButtonEqual
		//
		jButtonEqual.setText("=");
		jButtonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButtonEqual_actionPerformed(e);
			}

		});		
		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, jLabel1, 36,266,160,18);
		addComponent(contentPane, jTextField1, 17,14,198,22);
		addComponent(contentPane, jButtonBack, 21,44,90,22);
		addComponent(contentPane, jButtonClear, 121,44,90,22);
		addComponent(contentPane, jButton1, 21,170,40,38);
		addComponent(contentPane, jButton2, 71,170,40,38);
		addComponent(contentPane, jButton3, 121,170,40,38);
		addComponent(contentPane, jButton4, 21,122,40,38);
		addComponent(contentPane, jButton5, 71,122,40,38);
		addComponent(contentPane, jButton6, 121,122,40,38);
		addComponent(contentPane, jButton7, 21,74,40,38);
		addComponent(contentPane, jButton8, 71,74,40,38);
		addComponent(contentPane, jButton9, 121,74,40,38);
		addComponent(contentPane, jButtonMinus, 171,170,40,38);
		addComponent(contentPane, jButtonPlus, 171,218,40,38);
		addComponent(contentPane, jButtonMul, 171,122,40,38);
		addComponent(contentPane, jButtonDiv, 171,74,40,38);
		addComponent(contentPane, jButton0, 21,218,40,38);
		addComponent(contentPane, jButtonDot, 71,218,40,38);
		addComponent(contentPane, jButtonEqual, 121,218,40,38);
		//
		// Calculator
		//
		this.setTitle("Calculator");
		this.setLocation(new Point(27, 14));
		this.setSize(new Dimension(241, 320));
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here

	}

	private void jButtonBack_actionPerformed(ActionEvent e)
	{
		if (jTextField1.getText().length() > 0)
			jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));
	}

	private void jButtonClear_actionPerformed(ActionEvent e)
	{
		jTextField1.setText("");
		this.result = "";
		this.memory = 0.0;
		this.dot = false;
		this.operation = 0;
		this.once = false;
		this.clearView = false;
	}

	private void jButton0_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (!(jTextField1.getText().equals ("0")))
		if (this.clearScreen) {
			jTextField1.setText("0");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"0");
	}

	private void jButton1_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("1");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"1");
	}

	private void jButton2_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("2");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"2");
	}

	private void jButton3_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("3");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"3");
	}

	private void jButton4_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("4");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"4");
	}

	private void jButton5_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("5");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"5");
	}

	private void jButton6_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;		
		if (this.clearScreen) {
			jTextField1.setText("6");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"6");
	}

	private void jButton7_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("7");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"7");
	}

	private void jButton8_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("8");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"8");
	}

	private void jButton9_actionPerformed(ActionEvent e)
	{
		if (this.clearView)
			jTextField1.setText("");
		this.clearView = false;
		if (this.clearScreen) {
			jTextField1.setText("9");
			this.clearScreen = false;
		}
		else
			jTextField1.setText(jTextField1.getText()+"9");
	}	

	private void jButtonMinus_actionPerformed(ActionEvent e)
	{
		this.dot = false;
		
		if (once) {
			gotoSwitch();
		}
		else
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 1;		
	}

	private void jButtonPlus_actionPerformed(ActionEvent e)
	{
		this.dot = false;
		
		if (once) {
			gotoSwitch();
		}
		else 
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 2;
	}

	private void jButtonMul_actionPerformed(ActionEvent e)
	{
		this.dot = false;
		
		if (once) {
			gotoSwitch();
		}
		else 
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 3;
	}

	private void jButtonDiv_actionPerformed(ActionEvent e)
	{
		this.dot = false;
		
		
		if (once) {
			gotoSwitch();
		}
		else 
			stringToDouble();
		this.once = true;
		this.clearView = true;
		this.operation = 4;
	}	

	private void jButtonDot_actionPerformed(ActionEvent e)
	{
		if (!(this.clearView)) {

		if (!(jTextField1.getText().equals ("")))
		if (this.dot != true) {
			jTextField1.setText(jTextField1.getText()+".");
			this.dot = true;
		}
		}
	}

	private void jButtonEqual_actionPerformed(ActionEvent e)
	{
		this.once = false;
		this.dot = false;
		this.clearScreen = true;
		gotoSwitch();
		this.operation = 0;
		this.equalPressed = true;
		this.clearView = false;
	}	

 
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new Calculator();
	}

	public static String memoryToString(Double m) {
		String temp = Double.toString(m);
		boolean hasDecimal = false;
		String temp2 = "";
		for (int i=temp.lastIndexOf(".")+1; i<temp.length(); i++)
			if (temp.charAt(i) != '0') {
				hasDecimal = true;
				break;
			}
		if (hasDecimal)
			return temp;
		else {
			for (int i=0; i<temp.lastIndexOf("."); i++)
				temp2 = temp2 + temp.charAt(i);
			return temp2;
		}		
	}

	public void stringToDouble() {
		if ((jTextField1.getText().charAt(jTextField1.getText().length()-1)) == '.')
			this.memory = Double.parseDouble(jTextField1.getText()+"0");
		else
			this.memory = Double.parseDouble(jTextField1.getText());
	}

	public void gotoSwitch() {
		switch (this.operation) {
			case 0 :	break;
			case 1 : 	this.memory = this.memory - Double.parseDouble(jTextField1.getText());
					break;
			case 2 :	this.memory = this.memory + Double.parseDouble(jTextField1.getText());
					break;
			case 3 : 	this.memory = this.memory * Double.parseDouble(jTextField1.getText());
					break;
			case 4 :	this.memory = this.memory / Double.parseDouble(jTextField1.getText());
					break;
			default	 :	System.out.println("Unexpected Error");
		}
		jTextField1.setText(memoryToString(this.memory));
	}
}
