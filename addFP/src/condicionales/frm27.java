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


public class frm27 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtMonto,txtSueldobruto,txtDescuento,txtSueldoneto,txtPolos;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm27 frame = new frm27();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm27() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblmonto= new JLabel("Monto:");
	    lblmonto.setBounds(30,30,100,25);
	    getContentPane().add(lblmonto);
	    
	    JLabel lblsueldobruto = new JLabel("Sueldo bruto:");
	    lblsueldobruto.setBounds(30,120,150,25);
	    getContentPane().add(lblsueldobruto);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,150,150,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lblsueldoneto = new JLabel("Sueldo neto:");
	    lblsueldoneto.setBounds(30,180,150,25);
	    getContentPane().add(lblsueldoneto);
	    
	    JLabel lblpolos = new JLabel("Polos:");
	    lblpolos.setBounds(30,210,150,25);
	    getContentPane().add(lblpolos);
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(100,30,100,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtSueldobruto = new JTextField();
	    txtSueldobruto.setBounds(150,120,100,25);
	    txtSueldobruto.setMargin(new Insets(2,5,2,5));
	    txtSueldobruto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldobruto);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(150,150,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtSueldoneto = new JTextField();
	    txtSueldoneto.setBounds(150,180,100,25);
	    txtSueldoneto.setMargin(new Insets(2,5,2,5));
	    txtSueldoneto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldoneto);
	    
	    txtPolos = new JTextField();
	    txtPolos.setBounds(150,210,100,25);
	    txtPolos.setMargin(new Insets(2,5,2,5));
	    txtPolos.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPolos);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtMonto.getText() );
		
		double comision = monto * 0.15;
		double sueldobasico = 600;
		double sueldobruto = sueldobasico + comision;
		float descuento = 0;

		if (sueldobruto >= 1800)descuento =(float) (sueldobruto * 0.10);   
		else descuento =(float) (sueldobruto * 0.05);
				    
        int polos =0;
		if (monto >= 1000) polos = 3;
		else polos = 1;
				   
		double	sueldoneto = sueldobruto - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtSueldobruto.setText( df.format(sueldobruto) );
		txtDescuento.setText( df.format(descuento) );
		txtSueldoneto.setText( df.format(sueldoneto) );
		txtPolos.setText( df.format(polos) );
		


				
		    
		}

}