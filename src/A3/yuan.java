package A3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 
public class yuan extends JFrame{

	int TextLength = 11;
	int PasswordLength = 6;
	    
	JLabel jlb1,jlb2,jlb3;
	JButton jb1,jb2,jb3;
	JCheckBox jcb1,jcb2;
    JPanel jp1,jp2,jp3,jp4,jp5;
    JTextField jtf1;
    JPasswordField jpf1;
   
    public yuan(){
       

        jlb1 = new JLabel("�˻���¼����");
        jlb2 = new JLabel("�˻���(11λ)��");
        jlb3 = new JLabel("����(6λ)��");

        jb1 = new JButton("��¼�˺�");
        jb2 = new JButton("�˳���¼����");
        jb3 = new JButton("ע���˻�");
        
        jcb1 = new JCheckBox("�����û���");
        jcb2 = new JCheckBox("��������");	
        
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        
        jtf1 = new JTextField(13);
        
        jpf1 = new JPasswordField(13);

        jb1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
            	
            	if (jtf1.getText().trim().equals("YingyiZheng")&&new String(jpf1.getPassword()).trim().equals("123456")){
                    JOptionPane.showMessageDialog(null, "�˻���¼�ɹ���");
                }
            	
            	else if(jtf1.getText().trim().length() > TextLength||new String(jpf1.getPassword()).trim().length() > PasswordLength){
                    JOptionPane.showMessageDialog(null, "�˻��������볤�ȳ����涨���ȣ�","ERROR��",JOptionPane.ERROR_MESSAGE);

                }
            	
            	else if(jtf1.getText().trim().length()==0||new String(jpf1.getPassword()).trim().length()==0){
                  
                    JOptionPane.showMessageDialog(null,"�˻��������벻����Ϊ��!","ERROR��",JOptionPane.ERROR_MESSAGE);
                }
                
                else {
                    JOptionPane.showMessageDialog(null, "�˻������������","ERROR��",JOptionPane.ERROR_MESSAGE);
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
            	JOptionPane.showMessageDialog(null, "�ù�����ʱ�޷�ʹ�ã�","ERROR��",JOptionPane.ERROR_MESSAGE);
           
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
        jp2.add(jtf1);

        jp3.add(jlb3);
        jp3.add(jpf1);

        jp4.add(jb1);
        jp4.add(jb2);
        jp4.add(jb3);

        jp5.add(jcb1);
        jp5.add(jcb2);
        
        this.setTitle("�˻���¼����");
        this.setSize(600,300);
        this.setLocation(600, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1.setForeground(Color.BLUE);
        jb2.setForeground(Color.BLUE);
        jb3.setForeground(Color.BLUE);
        jlb1.setFont(new Font("����",Font.BOLD,25));
        jlb2.setFont(new Font("����",Font.BOLD,20));
        jlb3.setFont(new Font("����",Font.BOLD,20));
        jb1.setFont(new Font("����",Font.BOLD,15));
        jb2.setFont(new Font("����",Font.BOLD,15));
        jb3.setFont(new Font("����",Font.BOLD,15));
        jcb1.setFont(new Font("����",Font.BOLD,15));
        jcb2.setFont(new Font("����",Font.BOLD,15));
        
        this.setVisible(true);

    }

    
    
    public static void main(String[] args) {
        yuan q = new yuan();
    }


}