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


public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtCodigo,txtUnidades,txtPrecio,txtImporte,txtDescuento,txtTotal;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblcodigo= new JLabel("Codigo:");
	    lblcodigo.setBounds(30,30,100,25);
	    getContentPane().add(lblcodigo);
	    
	    JLabel lblunidades = new JLabel("unidades:");
	    lblunidades.setBounds(30,60,100,25);
	    getContentPane().add(lblunidades);
	   
	    JLabel lblprecio = new JLabel("Precio:");
	    lblprecio.setBounds(30,150,100,25);
	    getContentPane().add(lblprecio);
	    
	    JLabel lblimporte = new JLabel("Importe:");
	    lblimporte.setBounds(30,180,100,25);
	    getContentPane().add(lblimporte);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,210,100,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lbltotal = new JLabel("Total:");
	    lbltotal.setBounds(30,240,100,25);
	    getContentPane().add(lbltotal);
	    
	    txtCodigo = new JTextField();
	    txtCodigo.setBounds(100,30,100,25);
	    txtCodigo.setMargin(new Insets(2,5,2,5));
	    txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCodigo);
	    
	    txtUnidades = new JTextField();
	    txtUnidades.setBounds(100,60,100,25);
	    txtUnidades.setMargin(new Insets(2,5,2,5));
	    txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnidades);
	    
	    txtPrecio = new JTextField();
	    txtPrecio.setBounds(100,150,100,25);
	    txtPrecio.setMargin(new Insets(2,5,2,5));
	    txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPrecio);
	    
	    txtImporte = new JTextField();
	    txtImporte.setBounds(100,180,100,25);
	    txtImporte.setMargin(new Insets(2,5,2,5));
	    txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImporte);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,210,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(100,240,100,25);
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
		int codigo = Integer.parseInt( txtCodigo.getText() );
		int unidades = Integer.parseInt( txtUnidades.getText() );
		
		int precio = codigo ==101 ? 17: codigo == 102 ? 25: codigo == 103 ? 16 :27;
		int compra = unidades * precio;
		float descuento = 0;
		if (unidades <= 10)descuento = (float) (compra *0.05);
		else if (unidades >= 11 && unidades <= 20)descuento =(float) (compra * 0.08);
		else if (unidades >= 21 && unidades <= 30)descuento =(float) (compra * 0.10);
		else descuento = (float)(compra * 0.13);
	
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPrecio.setText( df.format(precio) );
		txtImporte.setText( df.format(compra) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(compra - descuento) );
		}

}