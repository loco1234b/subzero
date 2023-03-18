package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtE1,txtE2,txtE3,txtMayor,txtMenor;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblE1= new JLabel("Edad 1:");
	    lblE1.setBounds(30,30,100,25);
	    getContentPane().add(lblE1);
	    
	    JLabel lblE2 = new JLabel("Edad 2:");
	    lblE2.setBounds(30,60,100,25);
	    getContentPane().add(lblE2);
	   
	    JLabel lblE3 = new JLabel("Edad 3:");
	    lblE3.setBounds(30,90,100,25);
	    getContentPane().add(lblE3);
	    
	    JLabel lblMayor = new JLabel("Numero mayor:");
	    lblMayor.setBounds(30,180,100,25);
	    getContentPane().add(lblMayor);
	    
	    JLabel lblMenor = new JLabel("Numero menor:");
	    lblMenor.setBounds(30,210,100,25);
	    getContentPane().add(lblMenor);
	    
	    txtE1 = new JTextField();
	    txtE1.setBounds(100,30,100,25);
	    txtE1.setMargin(new Insets(2,5,2,5));
	    txtE1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtE1);
	    
	    txtE2 = new JTextField();
	    txtE2.setBounds(100,60,100,25);
	    txtE2.setMargin(new Insets(2,5,2,5));
	    txtE2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtE2);
	    
	    txtE3 = new JTextField();
	    txtE3.setBounds(100,90,100,25);
	    txtE3.setMargin(new Insets(2,5,2,5));
	    txtE3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtE3);
	    
	    txtMayor = new JTextField();
	    txtMayor.setBounds(120,180,100,25);
	    txtMayor.setMargin(new Insets(2,5,2,5));
	    txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMayor);
	    
	    txtMenor = new JTextField();
	    txtMenor.setBounds(120,210,100,25);
	    txtMenor.setMargin(new Insets(2,5,2,5));
	    txtMenor.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMenor);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int edad1 = Integer.parseInt( txtE1.getText() );
		int edad2 = Integer.parseInt( txtE2.getText() );
		int edad3 =Integer.parseInt( txtE3.getText() );
		
		double mayor = Math.max(Math.max(edad1,edad2),edad3);
		double menor = Math.min(Math.min(edad1,edad2),edad3);
       
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtMayor.setText( df.format(mayor) );
		txtMenor.setText( df.format(menor) );
		
		}

}