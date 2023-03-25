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
    
	JTextField txtNumero1,txtNumero2,txtNumero3,txtMedio;
	
	
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
		
	    JLabel lblnumero1= new JLabel("Numero 1:");
	    lblnumero1.setBounds(30,30,120,25);
	    getContentPane().add(lblnumero1);
	    
	    JLabel lblnumero2 = new JLabel("Numero 2:");
	    lblnumero2.setBounds(30,60,120,25);
	    getContentPane().add(lblnumero2);
	   
	    JLabel lblnumero3 = new JLabel("Numero 3:");
	    lblnumero3.setBounds(30,90,120,25);
	    getContentPane().add(lblnumero3);
	    
	    JLabel lblMedio = new JLabel("Numero medio:");
	    lblMedio.setBounds(30,180,120,25);
	    getContentPane().add(lblMedio);
	    
	    txtNumero1 = new JTextField();
	    txtNumero1.setBounds(140,30,100,25);
	    txtNumero1.setMargin(new Insets(2,5,2,5));
	    txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero1);
	    
	    txtNumero2 = new JTextField();
	    txtNumero2.setBounds(140,60,100,25);
	    txtNumero2.setMargin(new Insets(2,5,2,5));
	    txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero2);
	    
	    txtNumero3 = new JTextField();
	    txtNumero3.setBounds(140,90,100,25);
	    txtNumero3.setMargin(new Insets(2,5,2,5));
	    txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero3);
	    
	    txtMedio = new JTextField();
	    txtMedio.setBounds(140,180,100,25);
	    txtMedio.setMargin(new Insets(2,5,2,5));
	    txtMedio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMedio);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero1 = Integer.parseInt( txtNumero1.getText() );
		int numero2 = Integer.parseInt( txtNumero2.getText() );
		int numero3 =Integer.parseInt( txtNumero3.getText() );
		
		int medio = numero2;
		int x1 = numero1;
		if (numero1 > numero2)medio = numero1;
		    x1 = numero2;
		    
		if (medio > numero3)medio = numero3;
		else if (medio < x1)medio = x1;
		   
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtMedio.setText( df.format(medio) );
		
		
		}

}