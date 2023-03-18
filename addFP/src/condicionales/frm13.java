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


public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtCondicion,txtcorrecto;
	
	
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
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,120,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblcorrecto = new JLabel("Estado:");
	    lblcorrecto.setBounds(30,120,120,25);
	    getContentPane().add(lblcorrecto);
	    
	    JLabel lblcondicion = new JLabel("Condicion:");
	    lblcondicion.setBounds(30,150,120,25);
	    getContentPane().add(lblcondicion);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtcorrecto= new JTextField();
	    txtcorrecto.setBounds(100,120,120,25);
	    txtcorrecto.setMargin(new Insets(2,5,2,5));
	    txtcorrecto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtcorrecto);
	    
	    txtCondicion = new JTextField();
	    txtCondicion.setBounds(100,150,300,25);
	    txtCondicion.setMargin(new Insets(2,5,2,5));
	    txtCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCondicion);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		
		double centena = numero / 100;
		double decena = numero % 100/ 10;
		double unidades = numero % 10;
		
		String d = "";
		if (numero > 100 && numero < 999)d = "Numero de 3 cifras";
		else d = " error";   
		txtcorrecto.setText(d);
		
		String a = "";   
		if (centena > decena  && centena > unidades && decena > unidades)a = "Los numeros son desendentes";
		else if (unidades > decena && unidades > centena && decena > centena)a = "Los numeros son ascendentes"; 
		else a = "Los numeros no son ascendentes ni descendentes";
		 txtCondicion.setText(a);   
		}

}