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


public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtCambio,txtComprobar;
	JLabel lblimporte,lbldescuento,lbltotal;
	
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
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,120,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblcomprobar = new JLabel("Comprobar datos:");
	    lblcomprobar.setBounds(30,120,120,25);
	    getContentPane().add(lblcomprobar);
	   
	    JLabel lblCambio = new JLabel("El numero mayor posible:");
	    lblCambio.setBounds(30,150,180,25);
	    getContentPane().add(lblCambio);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtComprobar = new JTextField();
	    txtComprobar.setBounds(200,120,100,25);
	    txtComprobar.setMargin(new Insets(2,5,2,5));
	    txtComprobar.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtComprobar);
	    
	    txtCambio = new JTextField();
	    txtCambio.setBounds(200,150,100,25);
	    txtCambio.setMargin(new Insets(2,5,2,5));
	    txtCambio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCambio);
	  
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		String e = "";
		if(numero >= 1000 && numero <= 9999)e = "correcto";
		else e = "error";
		double millar = numero / 1000;
		double centena = (numero % 1000) /100;
		double decena = (numero % 1000) % 100 / 10;
		double unidad = (numero % 1000 % 100) % 10;
		
	    double mayor =Math.max(Math.max(Math.max(millar,centena),decena),unidad);
	    double menor = Math.min(Math.min(Math.min(millar,centena),decena),unidad);
	    txtComprobar.setText(e);
	    
		DecimalFormat df = new DecimalFormat("##.##");
		txtCambio.setText(df.format(mayor)+""+df.format(menor));
		 
		}

}