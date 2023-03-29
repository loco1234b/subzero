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


public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtDonacion,txtCentro,txtComedor,txtBolsa;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lbldonacion= new JLabel("Donacion:");
	    lbldonacion.setBounds(30,30,100,25);
	    getContentPane().add(lbldonacion);
	    
	    JLabel lblcentro = new JLabel("Centro de salud:");
	    lblcentro.setBounds(30,120,140,25);
	    getContentPane().add(lblcentro);
	    
	    JLabel lblcomedor = new JLabel("Comedor niños:");
	    lblcomedor.setBounds(30,150,140,25);
	    getContentPane().add(lblcomedor);
	    
	    JLabel lblbolsa = new JLabel("Bolsa:");
	    lblbolsa.setBounds(30,180,140,25);
	    getContentPane().add(lblbolsa);
	   
	    txtDonacion = new JTextField();
	    txtDonacion.setBounds(100,30,100,25);
	    txtDonacion.setMargin(new Insets(2,5,2,5));
	    txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDonacion);
	    
	    txtCentro = new JTextField();
	    txtCentro.setBounds(160,120,100,25);
	    txtCentro.setMargin(new Insets(2,5,2,5));
	    txtCentro.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCentro);
	    
	    txtComedor = new JTextField();
	    txtComedor.setBounds(160,150,100,25);
	    txtComedor.setMargin(new Insets(2,5,2,5));
	    txtComedor.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtComedor);
	    
	    txtBolsa = new JTextField();
	    txtBolsa.setBounds(160,180,100,25);
	    txtBolsa.setMargin(new Insets(2,5,2,5));
	    txtBolsa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtBolsa);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int donacion = Integer.parseInt( txtDonacion.getText() );

	    float centrosalud =0;  
		float comedorniños =0;  
		float bolsa =0;          
		
		if (donacion >= 10000)centrosalud = (float)0.30 * donacion;
		if (donacion >= 10000)comedorniños =(float) 0.50 * donacion;
		if (donacion >= 10000)bolsa =(float)0.20 * donacion;
		
		
		if (donacion <= 9999)centrosalud = (float) (donacion * 0.25);
		if (donacion <= 9999)comedorniños =(float) (donacion * 0.60);
		if (donacion <= 9999)bolsa = (float) (donacion * 0.15) ;
	
	    DecimalFormat df = new DecimalFormat("##.00");
		txtCentro.setText( df.format(centrosalud) );
		txtComedor.setText( df.format(comedorniños) );
		txtBolsa.setText( df.format(bolsa) );
		
		}

}