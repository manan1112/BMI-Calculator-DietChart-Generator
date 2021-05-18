import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class overWeightResult extends JFrame implements MouseListener, ActionListener
{
	
	Container cont;
	JPanel over = new JPanel();
	JLabel img,label1,label2;
	JButton button;
	
	public overWeightResult(double bmi) 
	{
		// TODO Auto-generated constructor stub
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		cont.add(over);
		over.setLayout(null);
		// create a new image icon
        ImageIcon i = new ImageIcon(new ImageIcon("Image/overweightgif.gif").getImage().getScaledInstance(250, 220, Image.SCALE_DEFAULT));
        // create a label to display image
        img = new JLabel(i); 
        over.add(img);
        img.setBounds(100,0,300,350);
        
        label1=new JLabel();
        over.add(label1);
        label1.setText("OverWeight | "+Double.toString(bmi));
        label1.setFont(new Font("Roboto Thin",0,29));
        label1.setBounds(123, 300, 400 ,40);
        
        button=new JButton();
        over.add(button);
        button.setText("View Diet");
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setBounds(200,360,100,30);
	    button.setBackground(Color.black);
	    button.setFont(new Font("Roboto Medium",0,20));
	    button.setBorder(BorderFactory.createLineBorder(Color.BLUE,1));
	    button.addActionListener(this);
	    
	    
	    label2=new JLabel(); 
	    over.add(label2);
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
	    
	    public void actionPerformed(ActionEvent e)
		{
				this.setVisible(false);
			    new selectDiet().setVisible(true);
		}
}		
