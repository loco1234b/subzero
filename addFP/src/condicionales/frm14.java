package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtDia;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,120,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lbldia = new JLabel("El dia es:");
	    lbldia.setBounds(30,120,120,25);
	    getContentPane().add(lbldia);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtDia = new JTextField();
	    txtDia.setBounds(100,120,100,25);
	    txtDia.setMargin(new Insets(2,5,2,5));
	    txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDia);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		String dia = " ";
		if ( numero == 1)dia = "Lunes";
		else if ( numero == 2)dia = "Martes";
		else if ( numero == 3)dia = "Miercoles";
		else if ( numero == 4)dia = "Jueves";
		else if ( numero == 5)dia = "Viernes";
		else if ( numero == 6)dia = "Sabado";
		else if ( numero == 7)dia = "Domingo";
		else dia = " error";
		txtDia.setText(dia);
		
		}

}