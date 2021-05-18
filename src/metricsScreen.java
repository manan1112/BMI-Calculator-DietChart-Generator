import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class metricsScreen extends JFrame implements ActionListener{

	Container cont;
    JButton button1,button2;
    JLabel label1,label2,label3;
    JPanel metric = new JPanel();
    int index;
    JComboBox cb;
    
	public metricsScreen() {
		// TODO Auto-generated constructor stub
		
			cont = getContentPane();
			cont.setLayout(new BorderLayout());
			cont.add(metric);
			metric.setLayout(null);
			
			button1=new JButton();
			button2=new JButton();
			label1=new JLabel();
			label2=new JLabel();
			label3=new JLabel();
			
			metric.add("Center",label1);
			metric.add(label2);
			metric.add(label3);
			metric.add(button1);
			metric.add(button2);
			metric.setForeground(new Color(251,253,251,0));                       //251,253,251,0
		    metric.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		    setBackground(new Color(251,253,251)); 
		    
		    label1.setFont(new Font("Roboto Thin",0,42));
		    label1.setText("Select Metrics");
		    label1.setBounds(115,130,350,50);
		    
		    String units[]={"International units","U.S units"};        
		    cb=new JComboBox(units);  
		    metric.add(cb);
		    cb.setFont(new Font("Roboto Medium",0,18));
		    cb.setBounds(150,200,200,35);

		    button1.setFont(new Font("Roboto Medium",0,20));
		    button1.setText("Previous");
		    button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    button1.setBounds(28,375,100,30);
		    button1.setBackground(Color.black);
		    //button1.setForeground(Color.white);
		    button1.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
		    button1.addActionListener(this);
		    
		    button2.setFont(new Font("Roboto Medium",0,20));
		    button2.setText("Next");
		    button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    button2.setBounds(370,375,100,30);
		    button2.setBackground(Color.black);
		    //button2.setForeground(Color.white);
		    button2.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
		    button2.addActionListener(this);
		  
		    
		    label2.setFont(new Font("Roboto Thin",0,20));
		    label2.setText("Your Health is an Investment not an Expense.");
		    label2.setHorizontalAlignment(JLabel.CENTER);
		    label2.setHorizontalTextPosition(JLabel.CENTER);
		    label2.setBounds(0,420,500,25);
		    label2.setForeground(Color.white);
		    label2.setOpaque(true);
		    label2.setBackground(Color.black);
		    
		    label3.setFont(new Font("Roboto Thin",0,20));
		    label3.setText("Stay Fit ! Stay healthy !");
		    label3.setHorizontalAlignment(JLabel.CENTER);
		    label3.setHorizontalTextPosition(JLabel.CENTER);
		    label3.setBounds(0,445,500,30);
		    label3.setOpaque(true);
		    label3.setBackground(Color.black);
		    label3.setForeground(Color.white);
		    
		    setBounds(450,130,500,503);
		    Image icon = Toolkit.getDefaultToolkit().getImage("Image/bmi_icon.png"); 	  
		    setIconImage(icon);
		    setResizable(false);
		    try 
	        {      
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  // set look and feel
	        } 
	        catch (Exception e)
	        { 
	            System.err.println(e.getMessage()); 
	        } 
		    setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		index=cb.getSelectedIndex();
		String s = e.getActionCommand();
		if(s.equals("Previous"))
		{ 
	    	this.setVisible(false);
		    new HomePage().setVisible(true);
		}
		else if(s.equals("Next"))
		{
            if(index==0)
            {
			this.setVisible(false);
			new international().setVisible(true);
            }
            else if(index==1)
            {
            	this.setVisible(false);
            	new US().setVisible(true);
            }
			
		}
	}
	

}
