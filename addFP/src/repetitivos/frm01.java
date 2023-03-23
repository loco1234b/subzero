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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtDividendo, txtDivisor, txtCociente, txtResiduo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 280);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDividendo = new JLabel("Dividendo :");
		lblDividendo.setBounds(30,30,80,30);
		getContentPane().add(lblDividendo);
		
		JLabel lblDivisor = new JLabel("Divisor :");
		lblDivisor.setBounds(30,70,80,30);
		getContentPane().add(lblDivisor);
		
		JLabel lblCociente = new JLabel("Cociente :");
		lblCociente.setBounds(30,110,80,30);
		getContentPane().add(lblCociente);
		
		JLabel lblResiduo = new JLabel("Residuo :");
		lblResiduo.setBounds(30,150,80,30);
		getContentPane().add(lblResiduo);
		
		Insets insets = new Insets(2,5,2,5);
		
		txtDividendo = new JTextField();
		txtDividendo.setBounds(120,30,80,30);
		txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDividendo.setMargin(insets);
		getContentPane().add(txtDividendo);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(120,70,80,30);
		txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDivisor.setMargin(insets);
		getContentPane().add(txtDivisor);
		
		txtCociente = new JTextField();
		txtCociente.setBounds(120,110,80,30);
		txtCociente.setFocusable(false);
		txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCociente.setMargin(insets);
		getContentPane().add(txtCociente);

		txtResiduo = new JTextField();
		txtResiduo.setBounds(120,150,80,30);
		txtResiduo.setFocusable(false);
		txtResiduo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResiduo.setMargin(insets);
		getContentPane().add(txtResiduo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } } );
	}

	protected void btnCalcular_actionPerformed() {
		int dividendo = Integer.parseInt( txtDividendo.getText() );
		int divisor   = Integer.parseInt( txtDivisor.getText() );
		
		int cociente = 1;
		for ( ; (dividendo = (dividendo - divisor)) >= divisor; cociente++ );
		
		//while ( (dividendo = (dividendo - divisor)) >= divisor ) cociente++;
		
		txtCociente.setText( "" + cociente);
		txtResiduo.setText( "" + dividendo);

	}

}