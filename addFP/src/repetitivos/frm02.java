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

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtN1, txtN2, txtProducto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 250);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 60, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 60, 60, 25);
		getContentPane().add(lblN2);
		
		JLabel lblProducto = new JLabel("Producto :");
		lblProducto.setBounds(30, 90, 80, 25);
		getContentPane().add(lblProducto);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 50, 25);
		txtN1.setMargin( new Insets( 2, 5, 2, 5 ));
		txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(100, 60, 50, 25);
		txtN2.setMargin( new Insets( 2, 5, 2, 5 ));
		txtN2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN2);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(100, 90, 50, 25);
		txtProducto.setMargin( new Insets( 2, 5, 2, 5 ));
		txtProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtProducto.setFocusable(false);
		getContentPane().add(txtProducto);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 130, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int N1 = Integer.parseInt( txtN1.getText() );
		int N2 = Integer.parseInt( txtN2.getText() );
		
		for ( int Nx = N1, veces = 1; veces++ < N2; N1 += Nx );
		
		//for( int Nx = N1; N2-- > 1; N1 += Nx );
		
		//int Nx = N1;
		//while ( N2-- > 1 ) N1 += Nx;
		
		txtProducto.setText( "" + N1 );		
	}

}
