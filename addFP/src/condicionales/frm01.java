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


public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtUnidades,txtImporte,txtDescuento,txtTotal,txtPrecio;
	JLabel lblimporte,lbldescuento,lbltotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblUnidades = new JLabel("Unidades:");
	    lblUnidades.setBounds(30,30,80,25);
	    getContentPane().add(lblUnidades);
	    
	    JLabel lblprecio = new JLabel("Precio:");
	    lblprecio.setBounds(30,120,80,25);
	    getContentPane().add(lblprecio);
	    
	    JLabel lblImporte = new JLabel("Importe:");
	    lblImporte.setBounds(30,150,80,25);
	    getContentPane().add(lblImporte);
	   
	    JLabel lblDescuento = new JLabel("Descuento:");
	    lblDescuento.setBounds(30,180,80,25);
	    getContentPane().add(lblDescuento);
	    
	    JLabel lblTotal = new JLabel("Total:");
	    lblTotal.setBounds(30,210,80,25);
	    getContentPane().add(lblTotal);
	    
	    txtUnidades = new JTextField();
	    txtUnidades.setBounds(100,30,80,25);
	    txtUnidades.setMargin(new Insets(2,5,2,5));
	    txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnidades);
	    
	    txtPrecio = new JTextField();
	    txtPrecio.setBounds(100,120,80,25);
	    txtPrecio.setMargin(new Insets(2,5,2,5));
	    txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPrecio);
	    
	    txtImporte = new JTextField();
	    txtImporte.setBounds(100,150,80,25);
	    txtImporte.setMargin(new Insets(2,5,2,5));
	    txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImporte);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,180,80,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(100,210,80,25);
	    txtTotal.setMargin(new Insets(2,5,2,5));
	    txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTotal);
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int unidades = Integer.parseInt( txtUnidades.getText() );
		int precio = 0;
		
		   if (unidades <= 25) precio = 27;     
		   else if( unidades >= 26 && unidades <=50)precio = 25;
		   else precio = 23;
		        
		int importe = unidades * precio;
		
	    float descuento = 0;
		if (unidades > 50) descuento =(float) (0.15 * importe);
		else descuento = (float)(0.05 * importe);
			
		float total = 0;
		total = (float)(importe - descuento);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtImporte.setText( df.format(importe) );
		txtPrecio.setText( df.format(precio) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );
		
		}

}