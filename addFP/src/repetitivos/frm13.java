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

public class frm13 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtSuma;
	

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
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 100, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblpotencia = new JLabel("Suma :");
		lblpotencia.setBounds(30, 120, 100, 25);
		getContentPane().add(lblpotencia);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 100, 25);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);
		
		txtSuma = new JTextField();
		txtSuma.setBounds(100, 120, 100, 25);
		txtSuma.setFocusable(false);
		txtSuma.setMargin( new Insets( 2, 5, 2, 5 ));
		txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtSuma);
		
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
		int total= 0;
		for (int i =0; i <= numero; i++)
			if(i % 3 ==0 || i % 5!=0)
				total= total +1;
		txtSuma.setText(""+total);
				
		
	}

}
