package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero, txtInicio, txtFin;
	JTextArea txaRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 60, 25);
		getContentPane().add(lblNumero);
		
		JLabel lblInicio = new JLabel("Inicio :");
		lblInicio.setBounds(30, 60, 60, 25);
		getContentPane().add(lblInicio);
		
		JLabel lblFin = new JLabel("Fin :");
		lblFin.setBounds(30, 90, 60, 25);
		getContentPane().add(lblFin);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 50, 25);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);

		txtInicio = new JTextField();
		txtInicio.setBounds(100, 60, 50, 30);
		txtInicio.setMargin( new Insets( 2, 5, 2, 5 ));
		txtInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtInicio);

		txtFin = new JTextField();
		txtFin.setBounds(100, 90, 50, 25);
		txtFin.setMargin( new Insets( 2, 5, 2, 5 ));
		txtFin.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtFin);

		txaRpta = new JTextArea();
		txaRpta.setMargin( new Insets(5,10,5,5));
		
		JScrollPane scPane = new JScrollPane(txaRpta);
		scPane.setBounds(30, 130, 150, 250);
		getContentPane().add(scPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(50, 420, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		int inicio = Integer.parseInt( txtInicio.getText() );
		int fin = Integer.parseInt( txtFin.getText() );
		txaRpta.setText("");
		
		for( int i=inicio; i <= fin; i++ ) 
			txaRpta.append( "" + numero + " x " + i + " = " + ( numero * i) + "\n" );

	}

}