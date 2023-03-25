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


public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtComision,txtDescuento,txtSbruto,txtSneto;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Monto:");
	    lblnumero.setBounds(30,30,100,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblcomision = new JLabel("Comision:");
	    lblcomision.setBounds(30,120,120,25);
	    getContentPane().add(lblcomision);
	    
	    JLabel lblsbruto = new JLabel("Sueldo bruto:");
	    lblsbruto.setBounds(30,150,140,25);
	    getContentPane().add(lblsbruto);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,180,140,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lblsneto = new JLabel("Sueldo neto:");
	    lblsneto.setBounds(30,210,140,25);
	    getContentPane().add(lblsneto);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtComision = new JTextField();
	    txtComision.setBounds(160,120,100,25);
	    txtComision.setMargin(new Insets(2,5,2,5));
	    txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtComision);
	    
	    txtSbruto = new JTextField();
	    txtSbruto.setBounds(160,150,100,25);
	    txtSbruto.setMargin(new Insets(2,5,2,5));
	    txtSbruto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSbruto);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(160,180,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtSneto = new JTextField();
	    txtSneto.setBounds(160,210,100,25);
	    txtSneto.setMargin(new Insets(2,5,2,5));
	    txtSneto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSneto);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtNumero.getText() );
	mat("##.00");
		txtComision.setText( df.format(comision) );
		txtSbruto.setText( df.format(sueldobruto) );
		txtDescuento.setText( df.format(descuento) );
		txtSneto.setText( df.format(sueldoneto) );
		
		}

}