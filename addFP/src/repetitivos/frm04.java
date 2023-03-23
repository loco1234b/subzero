package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero2,txtnumero1, txtMultiplos;

	private JTextField txtNumero1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 180);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero :");
		lblNumero.setBounds(30, 10, 60, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblNumero1 = new JLabel("Numero 2 :");
		lblNumero1.setBounds(30, 40, 60, 25);
		getContentPane().add(lblNumero1);
		
		JLabel lblmultiplos = new JLabel("Multiplos :");
		lblmultiplos.setBounds(30, 70, 60, 25);
		getContentPane().add(lblmultiplos);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(100, 10, 50, 25);
		txtNumero1.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(100, 40, 50, 25);
		txtNumero2.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero2);
		
		txtMultiplos = new JTextField();
		txtMultiplos.setBounds(100, 70, 120, 25);
		txtMultiplos.setFocusable(false);
		txtMultiplos.setMargin( new Insets( 2, 5, 2, 5 ));
		txtMultiplos.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtMultiplos);
				
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 100, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero1 = Integer.parseInt( txtNumero1.getText() );
		int numero2 = Integer.parseInt( txtNumero2.getText() );
		
		String smultiplos = ""+ numero1;
		for(int i = 2 ; i <= numero2 ; i++)
			smultiplos += "," + (numero1 * i);
		txtMultiplos.setText(smultiplos);

		}
	}