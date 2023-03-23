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


public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtPrecio,txtUnidades,txtDescuento,txtImporte,txtTotal,txtObsequio;
	
	
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
		
	    JLabel lblprecio= new JLabel("Precio:");
	    lblprecio.setBounds(30,30,100,25);
	    getContentPane().add(lblprecio);
	    
	    JLabel lblunidades = new JLabel("Unidades:");
	    lblunidades.setBounds(30,60,100,25);
	    getContentPane().add(lblunidades);
	    
	    JLabel lblimporte = new JLabel("Importe:");
	    lblimporte.setBounds(30,150,100,25);
	    getContentPane().add(lblimporte);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,180,100,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lbltotal = new JLabel("Total:");
	    lbltotal.setBounds(30,210,140,25);
	    getContentPane().add(lbltotal);
	    
	    JLabel lblobsequio = new JLabel("Obsequio:");
	    lblobsequio.setBounds(30,240,140,25);
	    getContentPane().add(lblobsequio);
	    
	    txtPrecio = new JTextField();
	    txtPrecio.setBounds(100,30,100,25);
	    txtPrecio.setMargin(new Insets(2,5,2,5));
	    txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPrecio);
	    
	    txtUnidades = new JTextField();
	    txtUnidades.setBounds(100,60,100,25);
	    txtUnidades.setMargin(new Insets(2,5,2,5));
	    txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnidades);
	    
	    txtImporte = new JTextField();
	    txtImporte.setBounds(100,150,100,25);
	    txtImporte.setMargin(new Insets(2,5,2,5));
	    txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImporte);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,180,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(100,210,100,25);
	    txtTotal.setMargin(new Insets(2,5,2,5));
	    txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTotal);
	    
	    txtObsequio= new JTextField();
	    txtObsequio.setBounds(100,240,100,25);
	    txtObsequio.setMargin(new Insets(2,5,2,5));
	    txtObsequio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtObsequio);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int precio = Integer.parseInt( txtPrecio.getText() );
		int unidades = Integer.parseInt( txtUnidades.getText() );
		
		double compra = unidades * precio;
		float descuento = 0;
		if (unidades >= 6)descuento = (float)(compra * 0.15);
		else descuento =(float) (compra * 0.10);
				    
		double total = compra - descuento;
		
        float obsequio = 0;
		if (unidades >= 30) obsequio = 2 * (unidades / 3);
		else obsequio = 0 ;
				 
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtImporte.setText( df.format(compra) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );
		txtObsequio.setText(df.format(obsequio));
		}

}