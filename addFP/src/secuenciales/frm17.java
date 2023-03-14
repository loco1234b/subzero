package secuenciales;

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


public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtCentro,txtComedor,txtEscuela,txtAsilo,txtMonto;
	JLabel lblMonto,lblCentro,lblComedor,lblEscuela,lblAsilo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblMonto = new JLabel("Monto:");
	    lblMonto.setBounds(30,30,100,25);
	    getContentPane().add(lblMonto);
	    
	    JLabel lblCentro = new JLabel("Centro de salud:");
	    lblCentro.setBounds(30,120,100,25);
	    getContentPane().add(lblCentro);
	    
	    JLabel lblComedor = new JLabel("Comedor infantil:");
	    lblComedor.setBounds(30,150,100,25);
	    getContentPane().add(lblComedor);
	    
	    JLabel lblEscuela = new JLabel("Escuela infantil:");
	    lblEscuela.setBounds(30,180,100,25);
	    getContentPane().add(lblEscuela);
	    
	    JLabel lblAsilo = new JLabel("Asilo de ancianos:");
	    lblAsilo.setBounds(30,210,130,25);
	    getContentPane().add(lblAsilo);
	    
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(110,30,80,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtCentro = new JTextField();
	    txtCentro.setBounds(140,120,80,25);
	    txtCentro.setMargin(new Insets(2,5,2,5));
	    txtCentro.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCentro);
	    
	    txtComedor = new JTextField();
	    txtComedor.setBounds(140,150,80,25);
	    txtComedor.setMargin(new Insets(2,5,2,5));
	    txtComedor.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtComedor);
	    
	    txtEscuela = new JTextField();
	    txtEscuela.setBounds(140,180,80,25);
	    txtEscuela.setMargin(new Insets(2,5,2,5));
	    txtEscuela.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEscuela);
	    
	    txtAsilo = new JTextField();
	    txtAsilo.setBounds(140,210,80,25);
	    txtAsilo.setMargin(new Insets(2,5,2,5));
	    txtAsilo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtAsilo);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtMonto.getText() );
		
		double centrosalud = monto * 0.25;
		double comedorinfantil = monto * 0.35;
		double escuelainfantil = monto * 0.25;
		double asiloancianos = monto * 0.15 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCentro.setText( df.format(centrosalud));
		txtComedor.setText( df.format(comedorinfantil) );
		txtEscuela.setText( df.format(escuelainfantil) );
		txtAsilo.setText( df.format(asiloancianos) );
		
		}

}

