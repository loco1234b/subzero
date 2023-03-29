package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm16 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtCadena, txtInvertido;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblcadena = new JLabel("Cadena:");
		lblcadena.setBounds(30, 30, 100, 25);
		getContentPane().add(lblcadena);
		
		JLabel lblinvertido = new JLabel("Invertido :");
		lblinvertido.setBounds(30, 60, 100, 25);
		getContentPane().add(lblinvertido);
		
		JLabel lblm = new JLabel("Presionar calcular :");
		lblm.setBounds(30, 120, 150, 25);
		getContentPane().add(lblm);
		
		txtCadena = new JTextField();
		txtCadena.setBounds(100, 30, 100, 25);
		txtCadena.setFocusable(false);
		txtCadena.setMargin( new Insets( 2, 5, 2, 5 ));
		txtCadena.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtCadena);
		
		txtInvertido = new JTextField();
		txtInvertido.setBounds(100, 60, 100, 25);
		txtInvertido.setFocusable(false);
		txtInvertido.setMargin( new Insets( 2, 5, 2, 5 ));
		txtInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtInvertido);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(30, 90, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		String x = "El Gato";
		txtCadena.setText(x);
		String str ="El Gato";
		StringBuilder strb = new StringBuilder(str);
		str =strb.reverse().toString();
		txtInvertido.setText(str);

	    	}

}
