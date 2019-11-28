package A3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

 
public class yuan extends JFrame{

	int TextLength = 11;
	int PasswordLength = 6;
	    
	JLabel jlb1,jlb2,jlb3;
	JButton jb1,jb2,jb3;
	JCheckBox jcb1,jcb2;
    JPanel jp1,jp2,jp3,jp4,jp5;
    JTextField jtf;
    JPasswordField jpf;
    
    public yuan(){
       
        jlb1 = new JLabel("Account login interface");
        jlb2 = new JLabel("Account name (11 digits)");
        jlb3 = new JLabel("Password (6 digits)");

        jb1 = new JButton("Log in to your account");
        jb2 = new JButton("Logout interface");
        jb3 = new JButton("Sign up for an account");
        
        jcb1 = new JCheckBox("Save user name");
        jcb2 = new JCheckBox("Save the password");	
        
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        
        jtf = new JTextField(13);
        jpf = new JPasswordField(13);
        
       
        
		jtf.addFocusListener (new FocusListener()  {
      	  public void focusGained(FocusEvent e)
      	  {
      	    JTextField field = (JTextField)e.getSource();      	    
      	    field.setBackground(Color.YELLOW);
      	  }
      	  public void focusLost(FocusEvent e)
      	  {
      	    JTextField field = (JTextField)e.getSource();     	    
      	    field.setBackground(Color.WHITE);
      	  }
      	} );
		
		jpf.addFocusListener (new FocusListener()  {
	      	  public void focusGained(FocusEvent e)
	      	  {
	      	    JPasswordField field = (JPasswordField)e.getSource();      	    
	      	    field.setBackground(Color.YELLOW);
	      	  }
	      	  public void focusLost(FocusEvent e)
	      	  {
	      		JPasswordField field = (JPasswordField)e.getSource();     	    
	      	    field.setBackground(Color.WHITE);
	      	  }
	      	} );
		
        jb1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
            	
            	if (jtf.getText().trim().equals("YingyiZheng")&&new String(jpf.getText()).trim().equals("123456")){
                    JOptionPane.showMessageDialog(null, "Account login successful£¡");
                }
            	
            	else if(jtf.getText().trim().length() > TextLength||new String(jpf.getText()).trim().length() > PasswordLength){
                    JOptionPane.showMessageDialog(null, "The account name or password length exceeds the specified length£¡","ERROR£¡",JOptionPane.ERROR_MESSAGE);

                }
            	
            	else if(jtf.getText().trim().length()==0||new String(jpf.getText()).trim().length()==0){
                  
                    JOptionPane.showMessageDialog(null,"The account name or password is not allowed to be empty!","ERROR£¡",JOptionPane.ERROR_MESSAGE);
                }
                
                else {
                    JOptionPane.showMessageDialog(null, "Wrong account name or password£¡","ERROR£¡",JOptionPane.ERROR_MESSAGE);
                }
          }
        });
        jb2.addActionListener(new ActionListener() {
  
            public void actionPerformed(ActionEvent e) {
                dispose();
           
            }
        });
        
        jb3.addActionListener(new ActionListener() {
        	  
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null, "This feature is temporarily unavailable£¡","ERROR£¡",JOptionPane.ERROR_MESSAGE);
           
            }
        });

   
        
        this.setLayout(new GridLayout(5,1));
      
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);
        
        jp1.add(jlb1);
        
        jp2.add(jlb2);
        jp2.add(jtf);

        jp3.add(jlb3);
        jp3.add(jpf);

        jp4.add(jb1);
        jp4.add(jb2);
        jp4.add(jb3);

        jp5.add(jcb1);
        jp5.add(jcb2);
        
        this.setTitle("Account login interface");
        this.setSize(550,350);
        this.setLocation(600, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1.setForeground(Color.BLUE);
        jb2.setForeground(Color.BLUE);
        jb3.setForeground(Color.BLUE);
        jlb1.setFont(new Font("Tahoma",Font.BOLD,22));
        jlb2.setFont(new Font("Tahoma",Font.BOLD,18));
        jlb3.setFont(new Font("Tahoma",Font.BOLD,18));
        jb1.setFont(new Font("Tahoma",Font.BOLD,12));
        jb2.setFont(new Font("Tahoma",Font.BOLD,12));
        jb3.setFont(new Font("Tahoma",Font.BOLD,12));
        jcb1.setFont(new Font("Tahoma",Font.BOLD,12));
        jcb2.setFont(new Font("Tahoma",Font.BOLD,12));
        
        this.setVisible(true);

    }

    public static void main(String[] args) {
        yuan q = new yuan();
    }


}