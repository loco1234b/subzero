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


public class frm22 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtUnia,txtUnib,txtImporte,txtDescuento,txtTotal;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm22 frame = new frm22();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblunia= new JLabel("Unidades A:");
	    lblunia.setBounds(30,30,120,25);
	    getContentPane().add(lblunia);
	    
	    JLabel lblunib = new JLabel("Unidades B:");
	    lblunib.setBounds(30,60,120,25);
	    getContentPane().add(lblunib);
	    
	    JLabel lblimporte = new JLabel("Importe:");
	    lblimporte.setBounds(30,150,120,25);
	    getContentPane().add(lblimporte);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,180,120,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lbltotal = new JLabel("Total:");
	    lbltotal.setBounds(30,210,120,25);
	    getContentPane().add(lbltotal);
	    
	    txtUnia = new JTextField();
	    txtUnia.setBounds(100,30,100,25);
	    txtUnia.setMargin(new Insets(2,5,2,5));
	    txtUnia.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnia);
	    
	    txtUnib = new JTextField();
	    txtUnib.setBounds(100,60,100,25);
	    txtUnib.setMargin(new Insets(2,5,2,5));
	    txtUnib.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtUnib);
	    
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
	    
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int unidadesA = Integer.parseInt( txtUnia.getText() );
		int unidadesB = Integer.parseInt( txtUnib.getText() );
		
		double PRODUCTOA = unidadesA * 25;
		double PRODUCTOB = unidadesB * 30;
		
		float descuentoa = 0;
		if (unidadesA >= 50)descuentoa =(float) (PRODUCTOA * 0.15);  
		else descuentoa = 0;
	
        float descuentob = 0;
		if (unidadesB >= 60) descuentob =(float) (PRODUCTOB * 0.10);	    
		else descuentob = 0;
				    

		double importe = PRODUCTOA + PRODUCTOB;
		double descuento = descuentoa + descuentob;
		double	total = importe - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtImporte.setText( df.format(importe) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );


				
		    
		}

}