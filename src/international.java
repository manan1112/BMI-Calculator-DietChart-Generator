import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.util.*;

public class international extends JFrame implements ActionListener
{
	Container cont;
    JButton button1,button2;
    JLabel label1,label2,label3,label4,kg,cm;
    JPanel SI = new JPanel();
    JTextArea weight,height;
    double bmi;
    
	public international()
	{
		// TODO Auto-generated constructor stub
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.add(SI);
		SI.setLayout(null);
		
		button1=new JButton();
		button2=new JButton();
		label1=new JLabel();
		label2=new JLabel();
		label3=new JLabel();
		label4=new JLabel();
		kg=new JLabel();
		cm=new JLabel();
		
		SI.add(label1);
		SI.add(label2);
		SI.add(label3);
		SI.add(label4);
		SI.add(button1);
		SI.add(button2);
		
		SI.setForeground(new Color(251,253,251,0));                       //251,253,251,0
	    SI.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    setBackground(new Color(251,253,251)); 
	    
	    label1.setFont(new Font("Roboto Thin",0,29));
	    label1.setText("Enter Weight");
	    label1.setBounds(30,70,350,40);
	    
	    weight = new JTextArea();
	    SI.add(weight);
	    weight.setBounds(40,120,80,30);
	    weight.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
	    
	    
	    SI.add(kg);
	    kg.setFont(new Font("Roboto Thin",0,20));
	    kg.setText("kg");
	    kg.setBounds(123,128,100,25);
	    
	    
	    label2.setFont(new Font("Roboto Thin",0,29));
	    label2.setText("Enter Height");
	    label2.setBounds(30,200,350,40);
	      
	    height = new JTextArea();
	    SI.add(height);
	    height.setBounds(40,250,80,30);
	    height.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
	    
	    SI.add(cm);
	    cm.setFont(new Font("Roboto Thin",0,20));
	    cm.setText("cm");
	    cm.setBounds(123,258,80,20);
	  
	    button1.setFont(new Font("Roboto Medium",0,20));
	    button1.setText("Previous");
	    button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    button1.setBounds(28,375,100,30);
	    button1.setBackground(Color.black);
	    button1.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
	    button1.addActionListener(this);
	    
	    button2.setFont(new Font("Roboto Medium",0,20));
	    button2.setText("Next");
	    button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    button2.setBounds(370,375,100,30);
	    button2.setBackground(Color.black);
	    button2.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
	    button2.addActionListener(this);
	    
	    label3.setFont(new Font("Roboto Thin",0,20));
	    label3.setText("Don't loose until its about Weight !");
	    label3.setHorizontalAlignment(JLabel.CENTER);
	    label3.setHorizontalTextPosition(JLabel.CENTER);
	    label3.setBounds(0,420,500,25);
	    label3.setForeground(Color.white);
	    label3.setOpaque(true);
	    label3.setBackground(Color.black);
	    
	    label4.setFont(new Font("Roboto Thin",0,20));
	    label4.setText(":)");
	    label4.setHorizontalAlignment(JLabel.CENTER);
	    label4.setHorizontalTextPosition(JLabel.CENTER);
	    label4.setBounds(0,445,500,30);
	    label4.setOpaque(true);
	    label4.setBackground(Color.black);
	    label4.setForeground(Color.white);
	    
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
				
		String s = e.getActionCommand();
		if(s.equals("Previous"))
		{ 
	    	this.setVisible(false);
		    new metricsScreen().setVisible(true);
		}
		else if(s.equals("Next"))
		{
			String kgtext = weight.getText();
			String cmtext=height.getText();
			
			bmi=(Double.parseDouble(kgtext)*100*100)/(Double.parseDouble(cmtext)*Double.parseDouble(cmtext));
            bmi=Double.parseDouble(String.format("%.2f", bmi));
			
			if(bmi>=25)
			{
			this.setVisible(false);
			overWeightResult obj=new overWeightResult(bmi);
            obj.setVisible(true);
			}
			else if(bmi<17.9)
			{
				this.setVisible(false);
				underWeight obj=new underWeight(bmi);
	            obj.setVisible(true);
			}
			else if(bmi>17.9 && bmi<25)
			{
				this.setVisible(false);
				fitResult obj=new fitResult(bmi);
			    obj.setVisible(true);
		
			}
			
		}
	}
}
