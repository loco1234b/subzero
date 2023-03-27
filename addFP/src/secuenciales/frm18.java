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


public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtUnidades,txtPrecio,txtImporte,txtDescuento,txtTotal;
	JLabel lblUnidades,lblPrecio,lblImporte,lblDescuento,lblTotal;
	
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
		
	    JLabel lblUnidades = new JLabel("Unidades:");
	    lblUnidades.setBounds(30,30,100,25);
	    getContentPane().add(lblUnidades);
	    
	    JLabel lblPrecio = new JLabel("Precio:");
	    lblPrecio.setBounds(30,60,100,25);
	    getContentPane().add(lblPrecio);
	    
	    JLabel lblImporte = new JLabel("Importe:");
	    lblImporte.setBounds(30,150,100,25);
	    getContentPane().add(lblImporte);
	    
	    JLabel lblDescuento = new JLabel("Descuento:");
	    lblDescuento.setBounds(30,180,100,25);
	    getContentPane().add(lblDescuento);
	    
	    JLabel lblTotal = new JLabel("Total a pagar:");
	    lblTotal.setBounds(30,210,130,25);
	    getContentPane().add(lblTotal);
	    
	    
	    txtUnidades = new JTextField();
	    txtUnidades.setBounds(100,30,80,25);
	    txtUnidades.setMargin(new Insets(2,5,2,5));
	    txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnidades);
	    
	    txtPrecio = new JTextField();
	    txtPrecio.setBounds(100,60,80,25);
	    txtPrecio.setMargin(new Insets(2,5,2,5));
	    txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPrecio);
	    
	    txtImporte = new JTextField();
	    txtImporte.setBounds(100,150,80,25);
	    txtImporte.setFocusable(false);
	    txtImporte.setMargin(new Insets(2,5,2,5));
	    txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImporte);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,180,80,25);
	    txtDescuento.setFocusable(false);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(120,210,80,25);
	    txtTotal.setFocusable(false);
	    txtTotal.setMargin(new Insets(2,5,2,5));
	    txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTotal);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int unidades = Integer.parseInt( txtUnidades.getText() );
		int precio = Integer.parseInt( txtPrecio.getText() );
		
		double importe = unidades * precio;
		double descuento1 = (importe)- importe * 0.15;
		double descuento2 = descuento1 * 0.15;
		double descuentofinal = (importe * 0.15)+ descuento2;
		double total = descuento1 - descuento2 ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtImporte.setText( df.format(importe));
		txtDescuento.setText( df.format(descuentofinal) );
		txtTotal.setText( df.format(total) );
		
		}

}
