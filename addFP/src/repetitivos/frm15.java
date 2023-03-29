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

public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtCadena, txtMayusculas;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblcadena = new JLabel("Cadena:");
		lblcadena.setBounds(30, 30, 100, 25);
		getContentPane().add(lblcadena);
		
		JLabel lblreves = new JLabel("Mayusculas :");
		lblreves.setBounds(30, 60, 100, 25);
		getContentPane().add(lblreves);
		
		JLabel lblre = new JLabel("Presionar calcular :");
		lblre.setBounds(30, 120, 150, 25);
		getContentPane().add(lblre);
		
		txtCadena = new JTextField();
		txtCadena.setBounds(100, 30, 100, 25);
		txtCadena.setFocusable(false);
		txtCadena.setMargin( new Insets( 2, 5, 2, 5 ));
		txtCadena.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtCadena);
		
		txtMayusculas = new JTextField();
		txtMayusculas.setBounds(100, 60, 100, 25);
		txtMayusculas.setFocusable(false);
		txtMayusculas.setMargin( new Insets( 2, 5, 2, 5 ));
		txtMayusculas.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtMayusculas);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(30, 90, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		String dato ="aaron";
		txtCadena.setText(dato);
		
	    String cadena = "aaron";
	    txtMayusculas.setText(cadena.toUpperCase());
	    	}

}
