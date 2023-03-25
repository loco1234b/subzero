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


public class frm26 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtMonto,txtPrestamo,txtIntereses,txtPropio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm26 frame = new frm26();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm26() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblmonto= new JLabel("Monto:");
	    lblmonto.setBounds(30,30,100,25);
	    getContentPane().add(lblmonto);
	    
	    JLabel lblprestamo = new JLabel("Prestamo:");
	    lblprestamo.setBounds(30,120,150,25);
	    getContentPane().add(lblprestamo);
	    
	    JLabel lblinteres = new JLabel("Intereses:");
	    lblinteres.setBounds(30,150,150,25);
	    getContentPane().add(lblinteres);
	    
	    JLabel lblpropio = new JLabel("Pagar con propio dinero:");
	    lblpropio.setBounds(30,180,1505,25);
	    getContentPane().add(lblpropio);
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(100,30,100,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtPrestamo = new JTextField();
	    txtPrestamo.setBounds(180,120,100,25);
	    txtPrestamo.setMargin(new Insets(2,5,2,5));
	    txtPrestamo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPrestamo);
	    
	    txtIntereses = new JTextField();
	    txtIntereses.setBounds(180,150,100,25);
	    txtIntereses.setMargin(new Insets(2,5,2,5));
	    txtIntereses.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtIntereses);
	    
	    txtPropio = new JTextField();
	    txtPropio.setBounds(180,180,100,25);
	    txtPropio.setMargin(new Insets(2,5,2,5));
	    txtPropio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPropio);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtMonto.getText() );
		
		float prestamo = 0;
		if (monto >= 5000)prestamo =(float) (monto * 0.30); 
		else prestamo =(float) (monto * 0.20);
		    

		double propiodinero = monto - prestamo;
		double intereses = propiodinero * 0.10;
		double total = propiodinero + intereses;
	
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPrestamo.setText( df.format(prestamo) );
		txtIntereses.setText( df.format(intereses) );
		txtPropio.setText( df.format(total) );
		


				
		    
		}

}