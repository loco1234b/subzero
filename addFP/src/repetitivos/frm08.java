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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtPotencia,txtNumero2;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 100, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblNumero2 = new JLabel("Elevado :");
		lblNumero2.setBounds(30, 60, 100, 25);
		getContentPane().add(lblNumero2);
		
		JLabel lblpotencia = new JLabel("Potencia :");
		lblpotencia.setBounds(30, 150, 100, 25);
		getContentPane().add(lblpotencia);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 100, 25);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(100, 60, 100, 25);
		txtNumero2.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero2);

		txtPotencia = new JTextField();
		txtPotencia.setBounds(100, 150, 100, 25);
		txtPotencia.setFocusable(false);
		txtPotencia.setMargin( new Insets( 2, 5, 2, 5 ));
		txtPotencia.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtPotencia);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(30, 90, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero1 = Integer.parseInt( txtNumero.getText() );
		int numero2= Integer.parseInt( txtNumero2.getText() );
		double potencia = 1;
		for( int i= 1; i<=numero2; i++ ) 
			potencia = potencia *numero1;
		txtPotencia.setText(""+potencia);

	}

}
