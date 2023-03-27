package secuenciales;

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


public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtCateto1,txtCateto2,txtHipotenusa;
	JLabel lblCateto1,lblCateto2,lblHipotenusa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblCateto1 = new JLabel("Cateto 1:");
	    lblCateto1.setBounds(30,30,80,25);
	    getContentPane().add(lblCateto1);
	    
	    JLabel lblCateto2 = new JLabel("Cateto 2:");
	    lblCateto2.setBounds(30,60,80,25);
	    getContentPane().add(lblCateto2);
	    
	    JLabel lblHipotenusa = new JLabel("Hipotenusa:");
	    lblHipotenusa.setBounds(30,150,80,25);
	    getContentPane().add(lblHipotenusa);
	    	    
	    
	    txtCateto1 = new JTextField();
	    txtCateto1.setBounds(100,30,50,25);
	    txtCateto1.setMargin(new Insets(2,5,2,5));
	    txtCateto1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCateto1);
	    
	    txtCateto2 = new JTextField();
	    txtCateto2.setBounds(100,60,50,25);
	    txtCateto2.setMargin(new Insets(2,5,2,5));
	    txtCateto2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCateto2);
	    
	    txtHipotenusa = new JTextField();
	    txtHipotenusa.setBounds(100,150,80,25);
	    txtHipotenusa.setFocusable(false);
	    txtHipotenusa.setMargin(new Insets(2,5,2,5));
	    txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHipotenusa);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int cateto1 = Integer.parseInt( txtCateto1.getText() );
		int cateto2 = Integer.parseInt( txtCateto2.getText() );
		
		double hipotenusa = Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2));
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtHipotenusa.setText( df.format(hipotenusa) );
		
		}

}
