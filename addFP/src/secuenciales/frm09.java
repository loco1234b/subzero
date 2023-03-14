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


public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtSuma;
	JLabel lblNumero,lblSuma;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblNumero = new JLabel("Numero:");
	    lblNumero.setBounds(30,30,80,25);
	    getContentPane().add(lblNumero);
	    
	    JLabel lblSuma = new JLabel("Suma:");
	    lblSuma.setBounds(30,90,80,25);
	    getContentPane().add(lblSuma);
	    
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,150,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtSuma = new JTextField();
	    txtSuma.setBounds(100,90,150,25);
	    txtSuma.setMargin(new Insets(2,5,2,5));
	    txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSuma);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		
		double n1 = numero / 1000 ;
		double n2 = (numero % 1000)/ 100;
		double n3 = ((numero % 1000)% 100)/ 10;
		double n4 = numero % 10;
		double suma = n1 + n2+ n3+ n4;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSuma.setText( df.format(suma) );
		
		}

}
