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


public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtReves;
	JLabel lblNumero,lblReves;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblNumero = new JLabel("Numero:");
	    lblNumero.setBounds(30,30,80,25);
	    getContentPane().add(lblNumero);
	    
	    JLabel lblReves = new JLabel("Reves:");
	    lblReves.setBounds(30,90,80,25);
	    getContentPane().add(lblReves);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,150,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtReves = new JTextField();
	    txtReves.setBounds(100,90,150,25);
	    txtReves.setFocusable(false);
	    txtReves.setMargin(new Insets(2,5,2,5));
	    txtReves.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtReves);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		
		double n4 = numero % 10;
		double n3 = ((numero % 1000)% 100)/ 10;
		double n2 = (numero % 1000)/ 100;
		double n1 = numero / 1000;
		
		DecimalFormat df = new DecimalFormat("##.##");
		txtReves.setText( df.format(n4)+""+df.format(n3)+""+(df.format(n2)+""+n1));
		


		}

}