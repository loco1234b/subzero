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


public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtComision,txtSueldobruto,txtDescuento,txtSueldoneto,txtMonto;
	JLabel lblMonto,lblComision,lblSueldobruto,lblDescuento,lblSueldoneto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblMonto = new JLabel("Monto:");
	    lblMonto.setBounds(30,30,100,25);
	    getContentPane().add(lblMonto);
	    
	    JLabel lblComision = new JLabel("Comision:");
	    lblComision.setBounds(30,120,100,25);
	    getContentPane().add(lblComision);
	    
	    JLabel lblSueldobruto = new JLabel("Sueldo bruto:");
	    lblSueldobruto.setBounds(30,150,100,25);
	    getContentPane().add(lblSueldobruto);
	    
	    JLabel lblDescuento = new JLabel("Descuento:");
	    lblDescuento.setBounds(30,180,100,25);
	    getContentPane().add(lblDescuento);
	    
	    JLabel lblSueldoneto = new JLabel("Sueldo neto:");
	    lblSueldoneto.setBounds(30,210,130,25);
	    getContentPane().add(lblSueldoneto);
	    
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(110,30,80,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtComision = new JTextField();
	    txtComision.setBounds(140,120,80,25);
	    txtComision.setMargin(new Insets(2,5,2,5));
	    txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtComision);
	    
	    txtSueldobruto = new JTextField();
	    txtSueldobruto.setBounds(140,150,80,25);
	    txtSueldobruto.setMargin(new Insets(2,5,2,5));
	    txtSueldobruto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldobruto);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(140,180,80,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtSueldoneto = new JTextField();
	    txtSueldoneto.setBounds(140,210,80,25);
	    txtSueldoneto.setMargin(new Insets(2,5,2,5));
	    txtSueldoneto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldoneto);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtMonto.getText() );
		
		double comision = monto * 0.09;
		double sueldobruto = 500 + comision;
		double descuento = sueldobruto * 0.11;
		double sueldoneto = sueldobruto - descuento ;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtComision.setText( df.format(comision));
		txtSueldobruto.setText( df.format(sueldobruto) );
		txtDescuento.setText( df.format(descuento) );
		txtSueldoneto.setText( df.format(sueldoneto) );
		
		}

}

