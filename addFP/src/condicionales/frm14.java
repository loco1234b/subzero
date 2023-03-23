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


public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtMonto,txtDescuento,txtTotal;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero oculto:");
	    lblnumero.setBounds(30,30,120,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblmonto = new JLabel("Importe:");
	    lblmonto.setBounds(30,60,120,25);
	    getContentPane().add(lblmonto);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,150,120,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lbltotal = new JLabel("Total:");
	    lbltotal.setBounds(30,180,120,25);
	    getContentPane().add(lbltotal);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(140,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(140,60,100,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(100,150,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(100,180,100,25);
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
		int numero = Integer.parseInt( txtNumero.getText() );
		int monto = Integer.parseInt( txtMonto.getText() );
		
		double importe = monto;
		float descuento = 0;
		if (numero % 2 ==0 && numero > 100)descuento = (float)(importe * 0.15);
		else descuento =(float) (importe * 0.05);

		double importetotal = importe - descuento;
		

		DecimalFormat df = new DecimalFormat("##.##");
		txtDescuento.setText(df.format(descuento));
		txtTotal.setText(df.format(importetotal));
	}
}