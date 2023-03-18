package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtAngulo;
	JLabel lblimporte,lbldescuento,lbltotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,80,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblangulo = new JLabel("Angulo:");
	    lblangulo.setBounds(30,120,80,25);
	    getContentPane().add(lblangulo);
	   
	    
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,80,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtAngulo = new JTextField();
	    txtAngulo.setBounds(100,120,120,25);
	    txtAngulo.setMargin(new Insets(2,5,2,5));
	    txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtAngulo);
	    
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int angulo = Integer.parseInt( txtNumero.getText() );
		
		String lado = " ";
		if ( angulo == 0)lado = "Angulo nulo";
		else if ( angulo > 0 && angulo < 90)lado = "Angulo agudo";
		else if ( angulo == 90)lado = "Angulo recto";
		else if ( angulo > 90 && angulo <180)lado = "Angulo obtuso";
		else if ( angulo == 180)lado = "Angulo llano";
		else if ( angulo > 180 && angulo < 360)lado = "Angulo concavo";
		else if ( angulo == 360)lado = "Angulo completo";
		else lado = " error";
		txtAngulo.setText(lado);
		
		}

}