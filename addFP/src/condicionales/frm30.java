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


public class frm30 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtDias,txtCuota,txtDescuento,txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm30 frame = new frm30();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblcuota= new JLabel("Cuota:");
	    lblcuota.setBounds(30,30,100,25);
	    getContentPane().add(lblcuota);
	    
	    JLabel lbldias = new JLabel("Dias:");
	    lbldias.setBounds(30,60,100,25);
	    getContentPane().add(lbldias);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,150,150,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lbltotal = new JLabel("Total:");
	    lbltotal.setBounds(30,180,150,25);
	    getContentPane().add(lbltotal);
	    
	    txtCuota = new JTextField();
	    txtCuota.setBounds(100,30,100,25);
	    txtCuota.setMargin(new Insets(2,5,2,5));
	    txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCuota);
	    
	    txtDias = new JTextField();
	    txtDias.setBounds(100,60,100,25);
	    txtDias.setMargin(new Insets(2,5,2,5));
	    txtDias.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDias);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(150,150,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(150,180,100,25);
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
		int cuota = Integer.parseInt( txtCuota.getText() );
		int dias = Integer.parseInt( txtDias.getText() );
		float descuento = 0;
		float recargo = 0;
		if (dias <= 10)descuento =(float) (cuota * 0.02);
		if (dias <= 10 && descuento <5)descuento = 5;
		if (dias >= 11 && dias <21)descuento = 0;   
		if (dias >21 && dias <=31)recargo =(float) (cuota * 0.03);
		if  (dias >21 && recargo <10)recargo = 10;
		
		double total = cuota - descuento + recargo;
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );
		
				
		    
		}

}