import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class fitResult extends JFrame implements MouseListener
{
	
	Container cont;
	JPanel fit = new JPanel();
	JLabel img,label1,label2,label3;
	
	public fitResult(double bmi) 
	{
		// TODO Auto-generated constructor stub
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.add(fit);
		fit.setLayout(null);
		// create a new image icon
        ImageIcon i = new ImageIcon(new ImageIcon("Image/fit.gif").getImage().getScaledInstance(250, 220, Image.SCALE_DEFAULT));
        // create a label to display image
        img = new JLabel(i); 
        fit.add(img);
        img.setBounds(100,0,300,350);
        
        label1=new JLabel();
        fit.add(label1);
        label1.setText("You are Fit | "+Double.toString(bmi));
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setFont(new Font("Roboto Thin",0,29));
        label1.setBounds(123, 300, 350 ,40);
        
        label3=new JLabel();
        fit.add(label3);
        label3.setText("Keep your diet as it is.");
        label3.setFont(new Font("Roboto Thin",0,29));
        label3.setBounds(117, 350, 350 ,40);
        
        label2=new JLabel(); 
	    fit.add(label2);
	    label2.setFont(new Font("Roboto Thin",0,15));
	    label2.setText("<HTML><U>Back to HomeScreen</U></HTML>");
	    label2.setHorizontalAlignment(JLabel.CENTER);
	    label2.setHorizontalTextPosition(JLabel.CENTER);
	    label2.setVerticalTextPosition(JLabel.TOP);
	    label2.setBounds(0,420,500,80);
	    label2.setForeground(Color.white);
	    label2.setOpaque(true);
	    label2.setBackground(Color.black);
	    label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label2.addMouseListener(this);
	    
        
		setBounds(450,130,500,503);
	    Image icon = Toolkit.getDefaultToolkit().getImage("Image/bmi_icon.png"); 	  
	    setIconImage(icon);
	    setResizable(false);
	    setVisible(true);	
	    
	    try 
        {      
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  // set look and feel
        } 
        catch (Exception e)
        { 
            System.err.println(e.getMessage()); 
        } 
	    	
	}
	public void mouseClicked(MouseEvent e)
	   {  
		  this.setVisible(false);
	      new HomePage().setVisible(true);   
	   }  
	    public void mouseEntered(MouseEvent e) 
	    {  
	       label2.setForeground(Color.blue);
	    }  
	    public void mouseExited(MouseEvent e) 
	    {  
	    	label2.setForeground(Color.white);
	    }  
	    public void mousePressed(MouseEvent e)
	    {  
	   
	    }  
	    public void mouseReleased(MouseEvent e) 
	    {  
	       
	    }  
		
}		
