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


public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtUnidades,txtImporte,txtDescuento,txtTotal,txtCaramelo;
	JLabel lblimporte,lbldescuento,lbltotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblUnidades = new JLabel("Unidades:");
	    lblUnidades.setBounds(30,30,80,25);
	    getContentPane().add(lblUnidades);
	    
	    JLabel lblImporte = new JLabel("Importe:");
	    lblImporte.setBounds(30,120,80,25);
	    getContentPane().add(lblImporte);
	   
	    JLabel lblDescuento = new JLabel("Descuento:");
	    lblDescuento.setBounds(30,150,80,25);
	    getContentPane().add(lblDescuento);
	    
	    JLabel lblTotal = new JLabel("Total:");
	    lblTotal.setBounds(30,180,80,25);
	    getContentPane().add(lblTotal);
	    
	    JLabel lblCaramelos = new JLabel("Caramelos:");
	    lblCaramelos.setBounds(30,210,80,25);
	    getContentPane().add(lblCaramelos);
	    
	    
	    txtUnidades = new JTextField();
	    txtUnidades.setBounds(100,30,80,25);
	    txtUnidades.setMargin(new Insets(2,5,2,5));
	    txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnidades);
	    
	    txtImporte = new JTextField();
	    txtImporte.setBounds(100,120,80,25);
	    txtImporte.setMargin(new Insets(2,5,2,5));
	    txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImporte);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,150,80,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(100,180,80,25);
	    txtTotal.setMargin(new Insets(2,5,2,5));
	    txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTotal);
	    
	    txtCaramelo = new JTextField();
	    txtCaramelo.setBounds(100,210,80,25);
	    txtCaramelo.setMargin(new Insets(2,5,2,5));
	    txtCaramelo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCaramelo);
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int unidades = Integer.parseInt( txtUnidades.getText() );
		int caramelo = 0;
		if (unidades <= 50)caramelo = 5;
		else if (unidades >= 51 && unidades <= 100)caramelo = 10;
		else caramelo = 15;
		
		int importe = unidades * 20;
		float descuento = 0;
		if (importe >= 701)descuento = (float)0.16 * importe;
		else if (importe >= 501 && importe <= 700)descuento = (float)0.14 * importe;
		else descuento = (float)0.12 * importe;
		
		float total = 0;
		total = importe - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtImporte.setText( df.format(importe) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );
		txtCaramelo.setText( df.format(caramelo) );
		}

}