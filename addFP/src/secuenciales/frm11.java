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


public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero1,txtNumero2,txtPrimera,txtSegunda,txtCambio,txtsegundo;
	JLabel lblNumero,lblReves;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblNumero1 = new JLabel(" Primer Numero de 3 cifras:");
	    lblNumero1.setBounds(30,30,210,25);
	    getContentPane().add(lblNumero1);
	    
	    JLabel lblNumero2 = new JLabel("Segundo Numero de 3 cifras:");
	    lblNumero2.setBounds(30,60,210,25);
	    getContentPane().add(lblNumero2);
	    
	    JLabel lblCambio = new JLabel("Numeros intercambiados:");
	    lblCambio.setBounds(30,120,210,25);
	    getContentPane().add(lblCambio);
	    
	    txtNumero1 = new JTextField();
	    txtNumero1.setBounds(240,30,150,25);
	    txtNumero1.setMargin(new Insets(2,5,2,5));
	    txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero1);
	    
	    txtNumero2 = new JTextField();
	    txtNumero2.setBounds(240,60,150,25);
	    txtNumero2.setMargin(new Insets(2,5,2,5));
	    txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero2);
	    
	    txtCambio = new JTextField();
	    txtCambio.setBounds(240,120,150,25);
	    txtCambio.setMargin(new Insets(2,5,2,5));
	    txtCambio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCambio);
	    
	    txtsegundo = new JTextField();
	    txtsegundo.setBounds(240,150,150,25);
	    txtsegundo.setMargin(new Insets(2,5,2,5));
	    txtsegundo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtsegundo);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero1 = Integer.parseInt( txtNumero1.getText() );
		int numero2 = Integer.parseInt( txtNumero2.getText() );
				
		double c1 = numero1 / 100;	
		double c2 = (numero1 % 100) / 10;
		double c3 =  ((numero1 % 100)% 10) / 1;
		
		double c4 = numero2 / 100;
		double c5 = (numero2 % 100) / 10;
		double c6 = ((numero2 % 100)% 10) / 1;
		
		
		DecimalFormat df = new DecimalFormat("##.##");
		txtCambio.setText( df.format(c6)+""+df.format(c2)+""+(df.format(c4)));
		txtsegundo.setText( df.format(c3)+""+df.format(c5)+""+(df.format(c1)));


		}

}
