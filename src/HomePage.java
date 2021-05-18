import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener
{
	Container cont;
    JButton button;
    JLabel label1,label2,label3;
    JPanel welcome = new JPanel();
   // public static  double bmi;
	HomePage()	
	{
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.add(welcome);
		welcome.setLayout(null);
		
		button=new JButton();
		label1=new JLabel();
		label2=new JLabel();
		label3=new JLabel();
		
		welcome.add("Center",label1);
		welcome.add(button);
		welcome.add(label2);
		welcome.add(label3);
		welcome.setForeground(new Color(251,253,251,0));                       //251,253,251,0
	    welcome.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    setBackground(new Color(251,253,251)); 
	    
	    label1.setFont(new Font("Roboto Thin",0,48));
	    label1.setText("BMI Calculator");
	    label1.setBounds(95,150,350,50);
	    
	    button.setFont(new Font("Roboto Medium",0,20));
	    button.setText("Start");
	    button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    button.setBounds(185,250,120,40);
	    button.setBackground(Color.black);
	    button.setForeground(Color.white);
	    button.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
	    button.addActionListener(this);
	   
	    
	    label2.setFont(new Font("Roboto Thin",0,20));
	    label2.setText("Do you know!!!");
	    label2.setHorizontalAlignment(JLabel.CENTER);
	    label2.setHorizontalTextPosition(JLabel.CENTER);
	    label2.setBounds(0,420,500,25);
	    label2.setForeground(Color.white);
	    label2.setOpaque(true);
	    label2.setBackground(Color.black);
	    
	    label3.setFont(new Font("Roboto Thin",0,20));
	    label3.setText("BMI stands for Body Mass Index.");
	    label3.setHorizontalAlignment(JLabel.CENTER);
	    label3.setHorizontalTextPosition(JLabel.CENTER);
	    label3.setBounds(0,445,500,30);
	    label3.setOpaque(true);
	    label3.setBackground(Color.black);
	    label3.setForeground(Color.white);    
    
	    try 
        {      
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  // set look and feel
        } 
        catch (Exception e)
        { 
            System.err.println(e.getMessage()); 
        } 
	    Image icon = Toolkit.getDefaultToolkit().getImage("Image/bmi_icon.png");  
		setIconImage(icon);  

		pack();
		setVisible(true);
		setResizable(false);
		setBounds(450,130,500,503);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
	}
	
	public void actionPerformed(ActionEvent e)
	{
		this.setVisible(false);
		new metricsScreen().setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		HomePage f = new HomePage();		
	}

}