package repetitivos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtNumero;
	JTextArea txaRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 400);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(30, 30, 60, 25);
		getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 50, 25);
		txtNumero.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumero);

		txaRpta = new JTextArea();
		txaRpta.setMargin( new Insets(5,10,5,5));
		
		JScrollPane scPane = new JScrollPane(txaRpta);
		scPane.setBounds(30, 60, 150, 240);
		getContentPane().add(scPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 320, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		String stabla =" ";
		for(int i = 1; i<= 12; i++)
			stabla+= numero + "x"+ i + "="+(numero *i)+"\n";
		
		txaRpta.append(stabla);
		
	}
}