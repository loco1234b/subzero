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


public class frm29 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtHoras,txtTarifa,txtDescuento,txtSueldobruto,txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm29 frame = new frm29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm29() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblhoras= new JLabel("Horas:");
	    lblhoras.setBounds(30,30,100,25);
	    getContentPane().add(lblhoras);
	    
	    JLabel lbltarifa = new JLabel("Tarifa:");
	    lbltarifa.setBounds(30,60,100,25);
	    getContentPane().add(lbltarifa);
	    
	    JLabel lblsueldobruto = new JLabel("Sueldo bruto:");
	    lblsueldobruto.setBounds(30,150,150,25);
	    getContentPane().add(lblsueldobruto);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,180,150,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lbltotal = new JLabel("Total:");
	    lbltotal.setBounds(30,210,150,25);
	    getContentPane().add(lbltotal);
	    
	    txtHoras = new JTextField();
	    txtHoras.setBounds(100,30,100,25);
	    txtHoras.setMargin(new Insets(2,5,2,5));
	    txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHoras);
	    
	    txtTarifa = new JTextField();
	    txtTarifa.setBounds(100,60,100,25);
	    txtTarifa.setMargin(new Insets(2,5,2,5));
	    txtTarifa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTarifa);
	    
	    txtSueldobruto = new JTextField();
	    txtSueldobruto.setBounds(150,150,100,25);
	    txtSueldobruto.setMargin(new Insets(2,5,2,5));
	    txtSueldobruto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldobruto);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(150,180,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtTotal = new JTextField();
	    txtTotal.setBounds(150,210,100,25);
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
		int horas = Integer.parseInt( txtHoras.getText() );
		int tarifa = Integer.parseInt( txtTarifa.getText() );
		
		float sueldobruto = 0;
		float recarga = 0;
		if (horas <= 48) sueldobruto = horas * tarifa; 
		else  recarga =(float) ((horas * tarifa) * 0.20);
		    sueldobruto = (horas * tarifa) + recarga;
		    
        float descuento = 0;
		if (sueldobruto >= 1500)descuento =(float) (sueldobruto * 0.11);
		    
		else descuento = 0;
		    

		double total = sueldobruto - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtSueldobruto.setText( df.format(sueldobruto) );
		txtDescuento.setText( df.format(descuento) );
		txtTotal.setText( df.format(total) );
		
				
		    
		}

}