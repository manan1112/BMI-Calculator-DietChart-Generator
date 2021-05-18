import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class selectDiet extends JFrame implements MouseListener
{
	Container cont;
	JPanel diet = new JPanel();
	JLabel label1,label2,label3,vegimg,nonvegimg,veglabel,nonveglabel;
	
	public selectDiet()
	{
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.add(diet);
		diet.setLayout(null);
		
	    label1=new JLabel();
	    label2=new JLabel();
	    label3=new JLabel();
	    vegimg=new JLabel();
	    nonvegimg=new JLabel();
	    veglabel=new JLabel();
	    nonveglabel=new JLabel();
	    
		diet.add(label1);
		label1.setFont(new Font("Roboto Thin",0,35));
		label1.setText("Select your preference");
		label1.setBounds(80,50,350,50);
	
		
		ImageIcon i1 = new ImageIcon(new ImageIcon("Image/veg_c.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		vegimg = new JLabel(i1);
		diet.add(vegimg);
		vegimg.setBounds(60,130,150,150);
	//	vegimg.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		vegimg.addMouseListener(this);
		vegimg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		ImageIcon i2 = new ImageIcon(new ImageIcon("Image/nonveg_c.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		nonvegimg = new JLabel(i2);
		diet.add(nonvegimg);
		nonvegimg.setBounds(280,130,150,150);
		//nonvegimg.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
		nonvegimg.addMouseListener(this);
		
		diet.add(veglabel);
		veglabel.setFont(new Font("Roboto Thin",0,18));
		veglabel.setText("Vegetarian");
		veglabel.setBounds(90,250,100,100);
		
		diet.add(nonveglabel);
		nonveglabel.setFont(new Font("Roboto Thin",0,18));
		nonveglabel.setText("Non-Vegetarian");
		nonveglabel.setBounds(300,250,150,100);
		diet.add(nonveglabel);
		nonvegimg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		label2.setFont(new Font("Roboto Thin",0,20));
		label2.setText("Your Health is an Investment not an Expense.");
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setBounds(0,420,500,25);
		label2.setForeground(Color.white);
		label2.setOpaque(true);
		label2.setBackground(Color.black);
		diet.add(label2);
		 
		label3.setFont(new Font("Roboto Thin",0,20));
		label3.setText("Stay Fit ! Stay healthy !");
	    label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setBounds(0,445,500,30);
		label3.setOpaque(true);
		label3.setBackground(Color.black);
	    label3.setForeground(Color.white);
		diet.add(label3);
		    
		   
		try 
	    {      
	      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  // set look and feel
	    } 
	    catch (Exception e)
	    { 
	       System.err.println(e.getMessage()); 
	    } 
		
		setBounds(450,130,500,503);
		Image icon = Toolkit.getDefaultToolkit().getImage("Image/bmi_icon.png"); 	  
		setIconImage(icon);
		setResizable(false);
		setVisible(true);
		
	}

		public void mouseClicked(MouseEvent e)
		   {  
			  if(e.getSource()==vegimg)
			  {
			  this.setVisible(false);
		      new HomePage().setVisible(true);
		      }
			  else
			  {
				  this.setVisible(false);
			  }
		   }	  
			  
		    public void mouseEntered(MouseEvent e) 
		    {  
		  
		    }  
		    public void mouseExited(MouseEvent e) 
		    {  
		    
		    }  
		    public void mousePressed(MouseEvent e)
		    {  
		   
		    }  
		    public void mouseReleased(MouseEvent e) 
		    {  
		       
		    }  
		    
}