package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtPrimo;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 100, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblprimo = new JLabel("Estado :");
		lblprimo.setBounds(30, 120, 100, 25);
		getContentPane().add(lblprimo);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 100, 25);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);
		
		txtPrimo = new JTextField();
		txtPrimo.setBounds(100, 120, 100, 25);
		txtPrimo.setFocusable(false);
		txtPrimo.setMargin( new Insets( 2, 5, 2, 5 ));
		txtPrimo.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtPrimo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(30, 60, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		int contador =0;
		for(int i = 1; i <= numero; i++)
			if((numero % i)==0)
				contador++;
		if(contador <= 2)txtPrimo.setText("Es primo");
		else txtPrimo.setText("no es primo");
	
	}	

}
