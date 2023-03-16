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
    
	JTextField txtUnidades,txtImporte,txtDescuento,txtTotal;
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
	    
	    JLabel lblImporte = new JLabel("Importe:");
	    lblImporte.setBounds(30,90,80,25);
	    getContentPane().add(lblImporte);
	    
	    JLabel lblDescuento = new JLabel("Descuento:");
	    lblDescuento.setBounds(30,120,80,25);
	    getContentPane().add(lblDescuento);
	    
	    JLabel lblTotal = new JLabel("Total:");
	    lblTotal.setBounds(30,150,80,25);
	    getContentPane().add(lblTotal);
	    
	    txtUnidades = new JTextField();
	    txtUnidades.setBounds(100,30,80,25);
	    txtUnidades.setMargin(new Insets(2,5,2,5));
	    txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnidades);
	    
	    txtImporte = new JTextField();
	    txtImporte.setBounds(100,90,80,25);
	    txtImporte.setMargin(new Insets(2,5,2,5));
	    txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImporte);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,120,50,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(100,150,50,25);
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
		
		   if (unidades <= 25) {
		        double precio = 27;  
		   } if( unidades >= 26 && unidades <=50) { 
		        double precio = 25;
		   }if( unidades >= 51) {
		        double precio = 23;
		double importe = unidades * precio;
	   }
		if (unidades > 50) { 
           double descuento = 0.15 * importe;
		}
		else{
			descuento = 0.05 * importe;
		}
		double total = importe - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtImporte.setText( df.format(importe) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );
		
		}

}